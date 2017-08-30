package regions;

import java.util.HashMap;

/**
 * Created by Manish on 8/28/17.
 *
 */
public class State {
    private Integer id;
    private String name;

    HashMap<Integer, City> cityHashMap;

    public State(Integer id, String name) {
        this.id = id;
        this.name = name;
        cityHashMap = new HashMap<Integer, City>();
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

    public HashMap<Integer, City> getCityHashMap() {
        return cityHashMap;
    }

    public void setCityHashMap(HashMap<Integer, City> cityHashMap) {
        this.cityHashMap = cityHashMap;
    }
}
