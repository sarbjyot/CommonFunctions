package sarbjyot.android.commonfunctionslib.Model.Catalog;

/**
 * Created by Desk71 on 1/15/2018.
 */

public class Item_categories {

    private int item_category_id = 0;
    private int status = 0;
    private String name;

    public int getItem_category_id() {
        return item_category_id;
    }

    public void setItem_category_id(int item_category_id) {
        this.item_category_id = item_category_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
