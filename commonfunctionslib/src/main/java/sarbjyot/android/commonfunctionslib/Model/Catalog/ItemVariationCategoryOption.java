package sarbjyot.android.commonfunctionslib.Model.Catalog;

/**
 * Created by Desk71 on 11/29/2017.
 */

public class ItemVariationCategoryOption {

    String name;
    double price = 0;
    boolean is_price_pct = false;
    boolean is_default = false;
    double price_formatted = 0;
    boolean is_not_discountable = false;
    private int store_catalog_item_category_option_id = 0;

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

    public boolean getIs_price_pct() {
        return is_price_pct;
    }

    public void setIs_price_pct(boolean is_price_pct) {
        this.is_price_pct = is_price_pct;
    }

    public boolean getIs_default() {
        return is_default;
    }

    public void setIs_default(boolean is_default) {
        this.is_default = is_default;
    }

    public double getPrice_formatted() {
        return price_formatted;
    }

    public void setPrice_formatted(double price_formatted) {
        this.price_formatted = price_formatted;
    }

    public boolean isIs_not_discountable() {
        return is_not_discountable;
    }

    public void setIs_not_discountable(boolean is_not_discountable) {
        this.is_not_discountable = is_not_discountable;
    }

    public int getStore_catalog_item_category_option_id() {
        return store_catalog_item_category_option_id;
    }

    public void setStore_catalog_item_category_option_id(int store_catalog_item_category_option_id) {
        this.store_catalog_item_category_option_id = store_catalog_item_category_option_id;
    }
}
