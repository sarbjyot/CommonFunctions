package sarbjyot.android.commonfunctionslib.Model.Order;

/**
 * Created by Desk71 on 11/17/2017.
 */

public class OrderItemOption {

    private int category_id = 0;
    private int id = 0;
    private int store_catalog_item_category_id = 0;
    private int store_catalog_item_category_option_id = 0;
    private String category_name;
    private String option_name;
    private double price = 0;


    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStore_catalog_item_category_id() {
        return store_catalog_item_category_id;
    }

    public void setStore_catalog_item_category_id(int store_catalog_item_category_id) {
        this.store_catalog_item_category_id = store_catalog_item_category_id;
    }

    public int getStore_catalog_item_category_option_id() {
        return store_catalog_item_category_option_id;
    }

    public void setStore_catalog_item_category_option_id(int store_catalog_item_category_option_id) {
        this.store_catalog_item_category_option_id = store_catalog_item_category_option_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getOption_name() {
        return option_name;
    }

    public void setOption_name(String option_name) {
        this.option_name = option_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
