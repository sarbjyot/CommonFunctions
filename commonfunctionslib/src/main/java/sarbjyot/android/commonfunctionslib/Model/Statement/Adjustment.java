package sarbjyot.android.commonfunctionslib.Model.Statement;

import tech.imbibe.mart.android.app.user.MVC.Model.Order.OrderDerivedFields;
import tech.imbibe.mart.android.app.user.MVC.Model.Order.OrderDetail;
import tech.imbibe.mart.android.app.user.MVC.Model.Store.Store;

/**
 * Created by Desk71 on 2018-10-09.
 */

public class Adjustment {

    private int order_charge_id;
    private int store_id;
    private int order_id;
    private int charge_type;
    private String transaction_date;
    double amount;
    private String description;
    private int user_id;
    private String created_time;
    private OrderDetail order_details;
    private String user_name;
    private OrderDerivedFields derived_fields;
    private Store store;


    public int getOrder_charge_id() {
        return order_charge_id;
    }

    public void setOrder_charge_id(int order_charge_id) {
        this.order_charge_id = order_charge_id;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getCharge_type() {
        return charge_type;
    }

    public void setCharge_type(int charge_type) {
        this.charge_type = charge_type;
    }

    public String getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(String transaction_date) {
        this.transaction_date = transaction_date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
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
