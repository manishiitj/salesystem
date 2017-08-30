package regions;

import java.util.HashMap;

/**
 * Created by Manish on 8/28/17.
 */
public class City {
    private Integer id;
    private String name;

    HashMap<Integer, Store> storeHashMap;

    public City(Integer id, String name) {
        this.id = id;
        this.name = name;
        storeHashMap = new HashMap<Integer, Store>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public HashMap<Integer, Store> getStoreHashMap() {
        return storeHashMap;
    }

    public void setStoreHashMap(HashMap<Integer, Store> storeHashMap) {
        this.storeHashMap = storeHashMap;
    }


}
