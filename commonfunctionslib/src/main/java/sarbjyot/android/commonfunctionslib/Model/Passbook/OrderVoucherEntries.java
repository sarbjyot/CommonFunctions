package sarbjyot.android.commonfunctionslib.Model.Passbook;

/**
 * Created by Desk71 on 2018-10-11.
 */

public class OrderVoucherEntries {

    private int order_id;
    private int store_id;
    private String created_time;
    private String created_time_formatted;
    private int delivery_mode;
    private int payment_mode;
    private String payment_method;
    private String payment_method_title;
    private double items_total_amount;
    private double store_amount;
    private double net_platform_amount;
    private double net_store_amount;
    private double net_amount_due_to_store;
    private double net_amount_due_to_platform;
    private double net_platform_earning_amount;
    private double net_amount_due;
    private double net_amount;

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

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    public String getCreated_time_formatted() {
        return created_time_formatted;
    }

    public void setCreated_time_formatted(String created_time_formatted) {
        this.created_time_formatted = created_time_formatted;
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

    public String getPayment_method_title() {
        return payment_method_title;
    }

    public void setPayment_method_title(String payment_method_title) {
        this.payment_method_title = payment_method_title;
    }

    public double getItems_total_amount() {
        return items_total_amount;
    }

    public void setItems_total_amount(double items_total_amount) {
        this.items_total_amount = items_total_amount;
    }

    public double getStore_amount() {
        return store_amount;
    }

    public void setStore_amount(double store_amount) {
        this.store_amount = store_amount;
    }

    public double getNet_platform_amount() {
        return net_platform_amount;
    }

    public void setNet_platform_amount(double net_platform_amount) {
        this.net_platform_amount = net_platform_amount;
    }

    public double getNet_store_amount() {
        return net_store_amount;
    }

    public void setNet_store_amount(double net_store_amount) {
        this.net_store_amount = net_store_amount;
    }

    public double getNet_amount_due_to_store() {
        return net_amount_due_to_store;
    }

    public void setNet_amount_due_to_store(double net_amount_due_to_store) {
        this.net_amount_due_to_store = net_amount_due_to_store;
    }

    public double getNet_amount_due_to_platform() {
        return net_amount_due_to_platform;
    }

    public void setNet_amount_due_to_platform(double net_amount_due_to_platform) {
        this.net_amount_due_to_platform = net_amount_due_to_platform;
    }

    public double getNet_platform_earning_amount() {
        return net_platform_earning_amount;
    }

    public void setNet_platform_earning_amount(double net_platform_earning_amount) {
        this.net_platform_earning_amount = net_platform_earning_amount;
    }

    public double getNet_amount_due() {
        return net_amount_due;
    }

    public void setNet_amount_due(double net_amount_due) {
        this.net_amount_due = net_amount_due;
    }

    public double getNet_amount() {
        return net_amount;
    }

    public void setNet_amount(double net_amount) {
        this.net_amount = net_amount;
    }
}
