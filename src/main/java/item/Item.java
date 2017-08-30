package item;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by Manish on 8/28/17.
 *
 */
public abstract class Item {
    public ItemType type;
    private Date soldDate;

    public enum ItemType{
        BURGER,
        POHA,
        SANDWITCH,
        COFFEE,
        TEA,
        WATER
    }


    public enum ItemCategory{
        FOOD,
        BEVARAGE
    }

    public List<String> getAllBeverages(){
        String[] list = {"TEA", "COFFEE", "BURGER"};

        return Arrays.asList(list);
    }

    public List<String> getAllFoods(){
        String[] list = {"BURGER", "POHA", "SANDWITCH"};

        return Arrays.asList(list);
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public Date getSoldDate() {
        return soldDate;
    }

    public void setSoldDate(Date soldDate) {
        this.soldDate = soldDate;
    }

    @Override
    public String toString() {
        return "Item{" +
                "type=" + type.name() +
                ", soldDate=" + soldDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (type != item.type) return false;
        return soldDate != null ? soldDate.equals(item.soldDate) : item.soldDate == null;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (soldDate != null ? soldDate.hashCode() : 0);
        return result;
    }
}
