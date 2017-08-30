import item.Item;
import item.ItemFactory;
import javafx.application.Application;
import javafx.stage.Stage;
import regions.City;
import regions.Country;
import regions.State;
import regions.Store;

/**
 * Created by Manish on 8/28/17.
 */
public class SalesApp extends Application {


    public void start(Stage primaryStage) throws Exception {
        Store store = new Store(1, "fresh");

        Item item1 = ItemFactory.getItem(Item.ItemType.BURGER);
        Item item2 = ItemFactory.getItem(Item.ItemType.WATER);
        Item item3 = ItemFactory.getItem(Item.ItemType.POHA);

        store.buyItem(item1);
        store.buyItem(item2);
        store.buyItem(item3);


        City city = new City(1, "Bangalore");
        State state = new State(1, "Karnataka");
        Country country = new Country(1, "India");

        city.getStoreHashMap().put(1, store);
        state.getCityHashMap().put(1, city);
        country.getStateHashMap().put(1, state);


        System.out.println("Initial: "+ store.getItemCountMap().toString());

        store.sellItem(item3);

        System.out.println("after sale: " +store.getItemCountMap().toString());
        System.out.println("after sales: " +store.getItemSaleCountMap().toString());


    }
}
