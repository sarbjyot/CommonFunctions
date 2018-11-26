package sarbjyot.android.commonfunctionslib.Model.Order;

import java.io.Serializable;

import tech.imbibe.mart.android.app.user.MVC.Model.Store.Store;


/**
 * Created by Desk71 on 11/17/2017.
 */

public class Order implements Serializable{

    private int order_id=0;
    private int store_id=0;
    private int user_id= 0;
    private String cart_id;
    private String payment_id;
    private int status=0;
    private int delivery_mode;//new filed
    private int payment_mode;
    private String payment_method;
    private double net_amount = 0.0;
    private OrderDetail order_details;
    private String user_name;
    private int user_address_id;
    private String user_phone;
    private String user_apartment_number;
    private String user_address;
    private String user_ip_address;
    private String instructions;
    private int cancellation_reason_id;
    private String cancellation_reason;
    private String cancellation_comments;
    private int user_rating=0;
    private String user_rating_comments;
    private String user_rating_time;
    private String is_test;
    private String deliverer_user_id;
    private String deliverer_user_owner_role;
    private String deliverer_user_assign_time;
    private int store_accounting_voucher_id;
    private int settlement_status;
    private int settlement_store_accounting_voucher_id;
    private int settlement_payment_id;
    private OrderDerivedFields derived_fields;
    private Store store;


    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getCart_id() {
        return cart_id;
    }

    public void setCart_id(String cart_id) {
        this.cart_id = cart_id;
    }

    public String getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public double getNet_amount() {
        return net_amount;
    }

    public void setNet_amount(double net_amount) {
        this.net_amount = net_amount;
    }

    public OrderDetail getOrder_details() {
        return order_details;
    }

    public void setOrder_details(OrderDetail order_details) {
        this.order_details = order_details;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getUser_address_id() {
        return user_address_id;
    }

    public void setUser_address_id(int user_address_id) {
        this.user_address_id = user_address_id;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_apartment_number() {
        return user_apartment_number;
    }

    public void setUser_apartment_number(String user_apartment_number) {
        this.user_apartment_number = user_apartment_number;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getUser_ip_address() {
        return user_ip_address;
    }

    public void setUser_ip_address(String user_ip_address) {
        this.user_ip_address = user_ip_address;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public int getCancellation_reason_id() {
        return cancellation_reason_id;
    }

    public void setCancellation_reason_id(int cancellation_reason_id) {
        this.cancellation_reason_id = cancellation_reason_id;
    }

    public String getCancellation_reason() {
        return cancellation_reason;
    }

    public void setCancellation_reason(String cancellation_reason) {
        this.cancellation_reason = cancellation_reason;
    }

    public String getCancellation_comments() {
        return cancellation_comments;
    }

    public void setCancellation_comments(String cancellation_comments) {
        this.cancellation_comments = cancellation_comments;
    }

    public int getUser_rating() {
        return user_rating;
    }

    public void setUser_rating(int user_rating) {
        this.user_rating = user_rating;
    }

    public String getUser_rating_comments() {
        return user_rating_comments;
    }

    public void setUser_rating_comments(String user_rating_comments) {
        this.user_rating_comments = user_rating_comments;
    }

    public String getUser_rating_time() {
        return user_rating_time;
    }

    public void setUser_rating_time(String user_rating_time) {
        this.user_rating_time = user_rating_time;
    }

    public String getIs_test() {
        return is_test;
    }

    public void setIs_test(String is_test) {
        this.is_test = is_test;
    }

    public String getDeliverer_user_id() {
        return deliverer_user_id;
    }

    public void setDeliverer_user_id(String deliverer_user_id) {
        this.deliverer_user_id = deliverer_user_id;
    }

    public String getDeliverer_user_owner_role() {
        return deliverer_user_owner_role;
    }

    public void setDeliverer_user_owner_role(String deliverer_user_owner_role) {
        this.deliverer_user_owner_role = deliverer_user_owner_role;
    }

    public String getDeliverer_user_assign_time() {
        return deliverer_user_assign_time;
    }

    public void setDeliverer_user_assign_time(String deliverer_user_assign_time) {
        this.deliverer_user_assign_time = deliverer_user_assign_time;
    }

    public int getStore_accounting_voucher_id() {
        return store_accounting_voucher_id;
    }

    public void setStore_accounting_voucher_id(int store_accounting_voucher_id) {
        this.store_accounting_voucher_id = store_accounting_voucher_id;
    }

    public int getSettlement_status() {
        return settlement_status;
    }

    public void setSettlement_status(int settlement_status) {
        this.settlement_status = settlement_status;
    }

    public int getSettlement_store_accounting_voucher_id() {
        return settlement_store_accounting_voucher_id;
    }

    public void setSettlement_store_accounting_voucher_id(int settlement_store_accounting_voucher_id) {
        this.settlement_store_accounting_voucher_id = settlement_store_accounting_voucher_id;
    }

    public int getSettlement_payment_id() {
        return settlement_payment_id;
    }

    public void setSettlement_payment_id(int settlement_payment_id) {
        this.settlement_payment_id = settlement_payment_id;
    }

    public OrderDerivedFields getDerived_fields() {
        return derived_fields;
    }

    public void setDerived_fields(OrderDerivedFields derived_fields) {
        this.derived_fields = derived_fields;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
