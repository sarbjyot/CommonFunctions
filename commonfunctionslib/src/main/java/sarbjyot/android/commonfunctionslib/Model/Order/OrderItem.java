package sarbjyot.android.commonfunctionslib.Model.Order;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import tech.imbibe.mart.android.app.user.MVC.Model.Catalog.CatalogItem;
import tech.imbibe.mart.android.app.user.MVC.Model.Catalog.ItemSize;
import tech.imbibe.mart.android.app.user.MVC.Model.Catalog.ItemVariationCategory;
import tech.imbibe.mart.android.app.user.MVC.Model.Catalog.ItemVariationCategoryOption;

/**
 * Created by Desk71 on 11/17/2017.
 */

public class OrderItem implements Serializable {

    private int store_catalog_item_id = 0;
    private String item_name;
    private double item_price = 0;
    private double base_price = 0;
    private double unit_price = 0;
    private int quantity = 0;
    private double item_total_amount = 0;
    private double item_total_discountable_amount = 0;
    private OrderItemSize size;
    private List<OrderItemOption> options = new ArrayList<OrderItemOption>();
    private String instructions;
    private boolean is_not_discountable = false;

    public int getStore_catalog_item_id() {
        return store_catalog_item_id;
    }

    public void setStore_catalog_item_id(int store_catalog_item_id) {
        this.store_catalog_item_id = store_catalog_item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public double getItem_price() {
        return item_price;
    }

    public void setItem_price(double item_price) {
        this.item_price = item_price;
    }

    public double getBase_price() {
        return base_price;
    }

    public void setBase_price(double base_price) {
        this.base_price = base_price;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public double getItem_total_amount() {
        return item_total_amount;
    }

    public void setItem_total_amount(double item_total_amount) {
        this.item_total_amount = item_total_amount;
    }

    public double getItem_total_discountable_amount() {
        return item_total_discountable_amount;
    }

    public void setItem_total_discountable_amount(double item_total_discountable_amount) {
        this.item_total_discountable_amount = item_total_discountable_amount;
    }

    public OrderItemSize getSize() {
        return size;
    }

    public void setSize(OrderItemSize size) {
        this.size = size;
    }

    public List<OrderItemOption> getOptions() {
        return options;
    }

    public void setOptions(List<OrderItemOption> options) {
        this.options = options;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public boolean isIs_not_discountable() {
        return is_not_discountable;
    }

    public void setIs_not_discountable(boolean is_not_discountable) {
        this.is_not_discountable = is_not_discountable;
    }

    public void updateItemTotals(CatalogItem catalog_item) {
        this.item_name = catalog_item.getName();
        this.item_price = catalog_item.getPrice();
        this.base_price = catalog_item.getPrice();
        this.unit_price = catalog_item.getPrice();
        this.item_total_amount = this.quantity * this.unit_price;

        if (this.size != null) {
            ItemSize catalog_size = catalog_item.getVariations().getSizes().get(this.size.getId());

            this.size.setStore_catalog_item_size_id(catalog_size.getStore_catalog_item_size_id());
            this.size.setName(catalog_size.getName());
            this.size.setPrice(catalog_size.getPrice());

            this.base_price = catalog_size.getPrice();
            this.unit_price = catalog_size.getPrice();
            this.item_total_amount = this.quantity * this.unit_price;
        } else {
            this.size = null;
        }

        if (catalog_item.getVariations().getCategories() != null && this.options != null) {
            for (int i = 0; i < this.options.size(); i++) {
                OrderItemOption option = this.options.get(i);

                ItemVariationCategory category = catalog_item.getVariations().getCategories().get(option.getCategory_id());
                ItemVariationCategoryOption categoryOption = category.getOptions().get(option.getId());

                option.setStore_catalog_item_category_id(category.getStore_catalog_item_category_id());
                option.setStore_catalog_item_category_option_id(categoryOption.getStore_catalog_item_category_option_id());
                option.setCategory_name(category.getName());
                option.setOption_name(categoryOption.getName());

                double price = categoryOption.getPrice();
                if (categoryOption.getIs_price_pct()) {
                    price = this.base_price * price / 100;
                }

                option.setPrice(price);
                this.unit_price += price;
                this.item_total_amount = this.quantity * this.unit_price;
            }
        }
    }
}
