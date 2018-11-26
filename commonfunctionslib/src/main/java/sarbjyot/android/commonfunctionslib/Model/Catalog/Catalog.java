package sarbjyot.android.commonfunctionslib.Model.Catalog;

/**
 * Created by Desk71 on 2018-07-11.
 */

public class Catalog {
    int catalog_id = 0;
    String name ;
    String description;
    String status;

    public int getCatalog_id() {
        return catalog_id;
    }

    public void setCatalog_id(int catalog_id) {
        this.catalog_id = catalog_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
