package regions;

import java.util.HashMap;

/**
 * Created by Manish on 8/28/17.
 *
 */
public class Country {

    private Integer id;
    private String name;
    HashMap<Integer, State> stateHashMap;

    public Country(Integer id, String name) {
        this.id = id;
        this.name = name;
        stateHashMap = new HashMap<Integer, State>();
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

    public HashMap<Integer, State> getStateHashMap() {
        return stateHashMap;
    }

    public void setStateHashMap(HashMap<Integer, State> stateHashMap) {
        this.stateHashMap = stateHashMap;
    }
}
