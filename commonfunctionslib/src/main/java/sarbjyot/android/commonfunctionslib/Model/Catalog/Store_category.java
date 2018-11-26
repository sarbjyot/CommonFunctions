package sarbjyot.android.commonfunctionslib.Model.Catalog;

/**
 * Created by Desk71 on 11/29/2017.
 */

public class Store_category {
    int store_category_id = 0;
    String name ;
    String _description;

    public int getStore_category_id() {
        return store_category_id;
    }

    public void setStore_category_id(int store_category_id) {
        this.store_category_id = store_category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }
}
