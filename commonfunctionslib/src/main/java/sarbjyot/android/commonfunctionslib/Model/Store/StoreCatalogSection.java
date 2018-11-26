package sarbjyot.android.commonfunctionslib.Model.Store;

/**
 * Created by Desk71 on 11/23/2017.
 */

public class StoreCatalogSection {

    private int store_catalog_section_id = 0;
    private String owner_user_id = "";
    private int store_id = 0;
    private int catalog_id = 0;
    private int store_catalog_id = 0;
    private String name;
    private String description;
    private int status = 0;
    private int weight = 0;

    public int getStore_catalog_section_id() {
        return store_catalog_section_id;
    }

    public void setStore_catalog_section_id(int store_catalog_section_id) {
        this.store_catalog_section_id = store_catalog_section_id;
    }

    public String getOwner_user_id() {
        return owner_user_id;
    }

    public void setOwner_user_id(String owner_user_id) {
        this.owner_user_id = owner_user_id;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public int getCatalog_id() {
        return catalog_id;
    }

    public void setCatalog_id(int catalog_id) {
        this.catalog_id = catalog_id;
    }

    public int getStore_catalog_id() {
        return store_catalog_id;
    }

    public void setStore_catalog_id(int store_catalog_id) {
        this.store_catalog_id = store_catalog_id;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
