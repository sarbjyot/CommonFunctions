package sarbjyot.android.commonfunctionslib.Model.Catalog;

import java.util.List;

/**
 * Created by Desk71 on 11/29/2017.
 */

public class ItemVariationCategory {

    private String name;
    private String display_type;
    private boolean required=false;
    private boolean is_not_discountable=false;
    private int store_catalog_item_category_id = 0;
    private List<ItemVariationCategoryOption> options;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplay_type() {
        return display_type;
    }

    public void setDisplay_type(String display_type) {
        this.display_type = display_type;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public List<ItemVariationCategoryOption> getOptions() {
        return options;
    }

    public void setOptions(List<ItemVariationCategoryOption> options) {
        this.options = options;
    }

    public boolean isIs_not_discountable() {
        return is_not_discountable;
    }

    public void setIs_not_discountable(boolean is_not_discountable) {
        this.is_not_discountable = is_not_discountable;
    }

    public int getStore_catalog_item_category_id() {
        return store_catalog_item_category_id;
    }

    public void setStore_catalog_item_category_id(int store_catalog_item_category_id) {
        this.store_catalog_item_category_id = store_catalog_item_category_id;
    }
}
