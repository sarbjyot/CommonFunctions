package sarbjyot.android.commonfunctionslib.Model.Order;

/**
 * Created by Desk71 on 11/17/2017.
 */

public class OrderItemSize {


    private int id = 0;
    private int store_catalog_item_size_id = 0;
    private String name;
    private double price = 0;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStore_catalog_item_size_id() {
        return store_catalog_item_size_id;
    }

    public void setStore_catalog_item_size_id(int store_catalog_item_size_id) {
        this.store_catalog_item_size_id = store_catalog_item_size_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
