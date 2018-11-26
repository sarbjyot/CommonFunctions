package sarbjyot.android.commonfunctionslib.Model.Catalog;

/**
 * Created by Desk71 on 11/29/2017.
 */

public class ItemSize {
    private String name;
    private double price = 0;
    private boolean is_default = false;
    private boolean is_not_discountable = false;
    private int store_catalog_item_size_id = 0;


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

    public boolean is_default() {
        return is_default;
    }

    public void setIs_default(boolean is_default) {
        this.is_default = is_default;
    }

    public boolean isIs_not_discountable() {
        return is_not_discountable;
    }

    public void setIs_not_discountable(boolean is_not_discountable) {
        this.is_not_discountable = is_not_discountable;
    }

    public int getStore_catalog_item_size_id() {
        return store_catalog_item_size_id;
    }

    public void setStore_catalog_item_size_id(int store_catalog_item_size_id) {
        this.store_catalog_item_size_id = store_catalog_item_size_id;
    }
}
