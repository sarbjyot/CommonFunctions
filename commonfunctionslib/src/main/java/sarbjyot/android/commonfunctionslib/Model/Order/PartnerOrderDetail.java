package sarbjyot.android.commonfunctionslib.Model.Order;

import java.io.Serializable;
import java.util.List;

import tech.imbibe.mart.android.app.user.MVC.Model.Catalog.CatalogItem;
import tech.imbibe.mart.android.app.user.MVC.Model.Payment.PaymentMode;

/**
 * Created by Desk71 on 12/4/2017.
 */


public class PartnerOrderDetail implements Serializable {


    private String session_id = "";
    private int store_id = 0;
    private int delivery_mode = 0;
    private boolean is_partner_order = false;
    private List<OrderItem> items;
    private List<CatalogItem> catalogItems;
    private OrderBreakup breakup;
    private String user_name = "";
    private String user_phone = "";
    private int user_address_id = 0;
    private double user_address_latitude = 0;
    private double user_address_longitude = 0;
    private String user_address = "";
    private String user_apartment_number = "";
    int num_people = 1;
    private String[] condiments = new String[]{};
    private String instructions = "";
    private int payment_mode = 0;
    private String payment_method = null;
    private String payment_auth_token = null;
    private CouponDetail coupon_detail = null;
    private String schedule_date;
    private String schedule_time;
    private int deliverer_user_id;
    private String deliverer_user_owner_role;

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public int getDelivery_mode() {
        return delivery_mode;
    }

    public void setDelivery_mode(int delivery_mode) {
        this.delivery_mode = delivery_mode;
    }

    public boolean isIs_partner_order() {
        return is_partner_order;
    }

    public void setIs_partner_order(boolean is_partner_order) {
        this.is_partner_order = is_partner_order;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public List<CatalogItem> getCatalogItems() {
        return catalogItems;
    }

    public void setCatalogItems(List<CatalogItem> catalogItems) {
        this.catalogItems = catalogItems;
    }

    public OrderBreakup getBreakup() {
        return breakup;
    }

    public void setBreakup(OrderBreakup breakup) {
        this.breakup = breakup;
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

    public int getUser_address_id() {
        return user_address_id;
    }

    public void setUser_address_id(int user_address_id) {
        this.user_address_id = user_address_id;
    }

    public double getUser_address_latitude() {
        return user_address_latitude;
    }

    public void setUser_address_latitude(double user_address_latitude) {
        this.user_address_latitude = user_address_latitude;
    }

    public double getUser_address_longitude() {
        return user_address_longitude;
    }

    public void setUser_address_longitude(double user_address_longitude) {
        this.user_address_longitude = user_address_longitude;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getUser_apartment_number() {
        return user_apartment_number;
    }

    public void setUser_apartment_number(String user_apartment_number) {
        this.user_apartment_number = user_apartment_number;
    }

    public int getNum_people() {
        return num_people;
    }

    public void setNum_people(int num_people) {
        this.num_people = num_people;
    }

    public String[] getCondiments() {
        return condiments;
    }

    public void setCondiments(String[] condiments) {
        this.condiments = condiments;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public int getPayment_mode() {
        return payment_mode;
    }

    public void setPayment_mode(int payment_mode) {
        this.payment_mode = payment_mode;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getPayment_auth_token() {
        return payment_auth_token;
    }

    public void setPayment_auth_token(String payment_auth_token) {
        this.payment_auth_token = payment_auth_token;
    }

    public CouponDetail getCoupon_detail() {
        return coupon_detail;
    }

    public void setCoupon_detail(CouponDetail coupon_detail) {
        this.coupon_detail = coupon_detail;
    }

    public String getSchedule_date() {
        return schedule_date;
    }

    public void setSchedule_date(String schedule_date) {
        this.schedule_date = schedule_date;
    }

    public String getSchedule_time() {
        return schedule_time;
    }

    public void setSchedule_time(String schedule_time) {
        this.schedule_time = schedule_time;
    }

    public int getDeliverer_user_id() {
        return deliverer_user_id;
    }

    public void setDeliverer_user_id(int deliverer_user_id) {
        this.deliverer_user_id = deliverer_user_id;
    }

    public String getDeliverer_user_owner_role() {
        return deliverer_user_owner_role;
    }

    public void setDeliverer_user_owner_role(String deliverer_user_owner_role) {
        this.deliverer_user_owner_role = deliverer_user_owner_role;
    }

    public static String getPaymentModeStr(PartnerOrderDetail orderDetail) {
        String value = "";
        if (orderDetail.getPayment_mode() == PaymentMode.CashOnDelivery) {
            value = "Cash";
        } else if (orderDetail.getPayment_mode() == PaymentMode.Card){
            if(orderDetail.getPayment_method().contains("paytm")) {
                value = "Paytm";
            } else {
                value = "Pay Online";
            }
        }
        return value;
    }
}
