package sarbjyot.android.commonfunctionslib.Model.Order;

/**
 * Created by Desk71 on 5/28/2018.
 */

public class OrderSearchParams {
    private int store_id = 0;
    private String store_name = "";
    private String start_date = "";
    private String end_date = "";
    private int is_test;
    private int pageStart;
    private int order_id;
    private int delivery_mode;
    private int payment_mode;
    private int payment_id;
    private String user_name = "";
    private String user_phone = "";
    private String user_address = "";
    private double order_amount;
    private String report_type;
    private int deliverer_user_id;
    private double latitude;
    private double longitude;
    private double  radius;


    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public int isIs_test() {
        return is_test;
    }

    public void setIs_test(int is_test) {
        this.is_test = is_test;
    }

    public int getPageStart() {
        return pageStart;
    }

    public void setPageStart(int pageStart) {
        this.pageStart = pageStart;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getDelivery_mode() {
        return delivery_mode;
    }

    public void setDelivery_mode(int delivery_mode) {
        this.delivery_mode = delivery_mode;
    }

    public int getPayment_mode() {
        return payment_mode;
    }

    public void setPayment_mode(int payment_mode) {
        this.payment_mode = payment_mode;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public double getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(double order_amount) {
        this.order_amount = order_amount;
    }

    public String getReport_type() {
        return report_type;
    }

    public void setReport_type(String report_type) {
        this.report_type = report_type;
    }

    public int getDeliverer_user_id() {
        return deliverer_user_id;
    }

    public void setDeliverer_user_id(int deliverer_user_id) {
        this.deliverer_user_id = deliverer_user_id;
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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
