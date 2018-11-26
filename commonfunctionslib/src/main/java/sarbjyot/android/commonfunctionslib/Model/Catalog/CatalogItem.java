package sarbjyot.android.commonfunctionslib.Model.Catalog;

/**
 * Created by Desk71 on 11/29/2017.
 */

public class CatalogItem {

    private int store_catalog_item_id = 0;
    private int store_id = 0;
    private int owner_user_id =0;
    private int catalog_id = 0;
    private int store_catalog_id= 0;
    private int store_catalog_section_id = 0;
    private String store_catalog_section_name="";
    private int item_category_id = 0;
    private int image_fid= 0;
    private String image_url=null;
    private String name;
    private String description;
    private double price= 0;
    private String timings = null;
    private ItemVariations variations;
    private int is_non_discountable=0;
    private int status=0;
    private DateModel dates;


    public int getOwner_user_id() {
        return owner_user_id;
    }

    public void setOwner_user_id(int owner_user_id) {
        this.owner_user_id = owner_user_id;
    }

    public int getStore_catalog_item_id() {
        return store_catalog_item_id;
    }

    public void setStore_catalog_item_id(int store_catalog_item_id) {
        this.store_catalog_item_id = store_catalog_item_id;
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

    public int getStore_catalog_section_id() {
        return store_catalog_section_id;
    }

    public void setStore_catalog_section_id(int store_catalog_section_id) {
        this.store_catalog_section_id = store_catalog_section_id;
    }

    public int getItem_category_id() {
        return item_category_id;
    }

    public void setItem_category_id(int item_category_id) {
        this.item_category_id = item_category_id;
    }

    public int getImage_fid() {
        return image_fid;
    }

    public void setImage_fid(int image_fid) {
        this.image_fid = image_fid;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ItemVariations getVariations() {
        return variations;
    }

    public void setVariations(ItemVariations variations) {
        this.variations = variations;
    }

    public String getTimings() {
        return timings;
    }

    public void setTimings(String timings) {
        this.timings = timings;
    }

    public int getIs_non_discountable() {
        return is_non_discountable;
    }

    public void setIs_non_discountable(int is_non_discountable) {
        this.is_non_discountable = is_non_discountable;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DateModel getDates() {
        return dates;
    }

    public void setDates(DateModel dates) {
        this.dates = dates;
    }

    public String getStore_catalog_section_name() {
        return store_catalog_section_name;
    }

    public void setStore_catalog_section_name(String store_catalog_section_name) {
        this.store_catalog_section_name = store_catalog_section_name;
    }
}
