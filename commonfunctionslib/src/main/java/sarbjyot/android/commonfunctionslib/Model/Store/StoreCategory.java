package sarbjyot.android.commonfunctionslib.Model.Store;

/**
 * Created by Desk71 on 2018-11-22.
 */

public class StoreCategory {

    private int store_category_id = 0;
    private int status = 0;
    private String name = "";
    private String image_url = "";


    public int getStore_category_id() {
        return store_category_id;
    }

    public void setStore_category_id(int store_category_id) {
        this.store_category_id = store_category_id;
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

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
