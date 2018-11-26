package sarbjyot.android.commonfunctionslib.Model.Store;

/**
 * Created by Desk71 on 11/17/2017.
 */

public class SearchParams {

    private int[] store_ids = new int[]{};
    private int store_id = 0;
    private String user_address = "";
    private double latitude = 0;
    private double longitude = 0;
    private int delivery_mode = 0;
    private int distance = 0;
    private int[] service_area_ids = new int[]{};
    private int[] store_category_ids = new int[]{};
    private int[] item_category_ids = new int[]{};
    private int store_open_status;
    private int pageStart = 0;
    private String name = "";


    public int[] getStore_ids() {
        return store_ids;
    }

    public void setStore_ids(int[] store_ids) {
        this.store_ids = store_ids;
    }

    public int getStore_id() {return store_id; }

    public void setStore_id(int store_id) {this.store_id = store_id;}

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getDelivery_mode() {
        return delivery_mode;
    }

    public void setDelivery_mode(int delivery_mode) {
        this.delivery_mode = delivery_mode;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int[] getStore_category_ids() {
        return store_category_ids;
    }

    public void setStore_category_ids(int[] store_category_ids) {
        this.store_category_ids = store_category_ids;
    }

    public int[] getItem_category_ids() {
        return item_category_ids;
    }

    public void setItem_category_ids(int[] item_category_ids) {
        this.item_category_ids = item_category_ids;
    }

    public int getStore_open_status() {
        return store_open_status;
    }

    public void setStore_open_status(int store_open_status) {
        this.store_open_status = store_open_status;
    }

    public int getPageStart() {
        return pageStart;
    }

    public void setPageStart(int pageStart) {
        this.pageStart = pageStart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getService_area_ids() {
        return service_area_ids;
    }

    public void setService_area_ids(int[] service_area_ids) {
        this.service_area_ids = service_area_ids;
    }
}
