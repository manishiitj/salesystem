package regions;

import item.Item;
import item.ItemFactory;

import java.util.*;

/**
 * Created by Manish on 8/28/17.
 */
public class Store {
    private Integer id;
    private String name;
    private HashMap<Item, List<Item>> itemCountMap;
    private HashMap<Item, List<Item>> itemSaleCountMap;

    public Store(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.itemCountMap = new HashMap<Item, List<Item>>();
        this.itemSaleCountMap = new HashMap<Item, List<Item>>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void buyItem(Item item){
        addItemToStock(item);
    }

    public void sellItem(Item item) throws Exception {
        if(itemCountMap.containsKey(item)){
            addItemToSales(item);
        }else{
            throw new Exception("No item in stock");
        }
    }

    public void addItemToStock(Item item){
        if(itemCountMap.containsKey(item)){
            List<Item> list = itemCountMap.get(item);
            list.add(item);
            itemCountMap.put(item, list);
        }else{
            // TODO: 8/28/17 add item here
            itemCountMap.put(item, new ArrayList<Item>());
        }
    }

    public void addItemToSales(Item item){
        item.setSoldDate(new Date(System.currentTimeMillis()));

        if(itemSaleCountMap.containsKey(item)){
            List<Item> existingList = itemCountMap.get(item);

            // todo check contains
            existingList.remove(item);
            itemCountMap.put(item, existingList);

            List<Item> list = itemSaleCountMap.get(item);
            list.add(item);
            itemSaleCountMap.put(item, list);
        }else{
            itemSaleCountMap.put(item, new ArrayList<Item>());
        }
    }


    public int getStockCount(){
        int result = 0;

        Set<Item> itemList = itemCountMap.keySet();

        for(Item item: itemList){
            result += itemCountMap.get(item).size();
        }

        return result;
    }


    public int getTotalSaleCount(Date fromDate, Date toDate){

        int result = 0;

        Set<Item> itemList = itemSaleCountMap.keySet();

        for(Item item: itemList){
            List<Item>  list = itemSaleCountMap.get(item);

            for(Item item1: list){
                if(item1.getSoldDate().before(toDate) && item1.getSoldDate().after(fromDate)){
                    result++;
                }
            }
        }

        return result;

    }


    public int getItemSaleCount(Date fromDate, Date toDate, Item.ItemType type) throws Exception {

        int result = 0;

        Item item = ItemFactory.getItem(type);

        List<Item> list = itemSaleCountMap.get(item);

        for(Item item1: list){
            if(item1.getSoldDate().before(toDate) && item1.getSoldDate().after(fromDate) ){
                result++;
            }
        }
        return result;
    }

//    public int getCategorySaleCount(Date fromDate, Date toDate, Item.ItemCategory type){
//        int result = 0;
//
//
//        List<Item> categoryItes = new ArrayList<Item>();
//
//        List<Item> list = itemSaleCountMap.get(item);
//
//        for(Item item1: list){
//            if(item1.getSoldDate().before(toDate) && item1.getSoldDate().after(fromDate) ){
//                result++;
//            }
//        }
//        return result;
//    }
//


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public HashMap<Item, List<Item>> getItemCountMap() {
        return itemCountMap;
    }

    public void setItemCountMap(HashMap<Item, List<Item>> itemCountMap) {
        this.itemCountMap = itemCountMap;
    }

    public HashMap<Item, List<Item>> getItemSaleCountMap() {
        return itemSaleCountMap;
    }

    public void setItemSaleCountMap(HashMap<Item, List<Item>> itemSaleCountMap) {
        this.itemSaleCountMap = itemSaleCountMap;
    }
}
