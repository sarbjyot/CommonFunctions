package sarbjyot.android.commonfunctionslib.Model.Store;

/**
 * Created by Desk71 on 2018-08-07.
 */

public class DelivererLogModel {

    private int deliverer_log_id = 0;
    private int store_id = 0;
    private String store_name;
    private int order_id = 0;
    private double order_amount = 0;
    private int deliverer_user_id = 0;
    private String deliverer_user_name;
    private String deliverer_user_owner_role;
    private String log_type;
    private String comments;
    private String created_time;


    public int getDeliverer_log_id() {
        return deliverer_log_id;
    }

    public void setDeliverer_log_id(int deliverer_log_id) {
        this.deliverer_log_id = deliverer_log_id;
    }

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

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getDeliverer_user_id() {
        return deliverer_user_id;
    }

    public void setDeliverer_user_id(int deliverer_user_id) {
        this.deliverer_user_id = deliverer_user_id;
    }

    public String getDeliverer_user_name() {
        return deliverer_user_name;
    }

    public void setDeliverer_user_name(String deliverer_user_name) {
        this.deliverer_user_name = deliverer_user_name;
    }

    public String getDeliverer_user_owner_role() {
        return deliverer_user_owner_role;
    }

    public void setDeliverer_user_owner_role(String deliverer_user_owner_role) {
        this.deliverer_user_owner_role = deliverer_user_owner_role;
    }

    public String getLog_type() {
        return log_type;
    }

    public void setLog_type(String log_type) {
        this.log_type = log_type;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    public double getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(double order_amount) {
        this.order_amount = order_amount;
    }
}
