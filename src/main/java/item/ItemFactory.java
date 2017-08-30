package item;

import item.beverage.Coffee;
import item.beverage.Tea;
import item.beverage.Water;
import item.foodItems.Burger;
import item.foodItems.Poha;
import item.foodItems.Sandwitch;

/**
 * Created by Manish on 8/28/17.
 */
public class ItemFactory {

    public static Item getItem(Item.ItemType type) throws Exception{

        Item item;

        switch (type){
            case BURGER:
                item = new Burger(type);
                break;

            case POHA:
                item = new Poha(type);
                break;

            case SANDWITCH:
                item = new Sandwitch(type);
                break;

            case COFFEE:
                item = new Coffee(type);
                break;

            case TEA:
                item = new Tea(type);
                break;

            case WATER:
                item = new Water(type);
                break;

            default:
                item = null;
                throw new Exception("No food item type found");


        }
        return item;
    }



}
