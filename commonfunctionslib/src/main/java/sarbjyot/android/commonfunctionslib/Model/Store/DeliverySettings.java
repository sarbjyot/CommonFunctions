package sarbjyot.android.commonfunctionslib.Model.Store;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Desk71 on 11/17/2017.
 */

public class DeliverySettings implements Serializable {

    private boolean enabled = false;
    private int estimated_delivery_time_minutes = 0;
    private double minimum_order_amount = 0;
    private double delivery_charges_amount = 0;
    private ArrayList<DeliveryDistanceWiseCharges> delivery_distance_wise_charges = null;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getEstimated_delivery_time_minutes() {
        return estimated_delivery_time_minutes;
    }

    public void setEstimated_delivery_time_minutes(int estimated_delivery_time_minutes) {
        this.estimated_delivery_time_minutes = estimated_delivery_time_minutes;
    }

    public double getMinimum_order_amount() {
        return minimum_order_amount;
    }

    public void setMinimum_order_amount(double minimum_order_amount) {
        this.minimum_order_amount = minimum_order_amount;
    }

    public double getDelivery_charges_amount() {
        return delivery_charges_amount;
    }

    public void setDelivery_charges_amount(double delivery_charges_amount) {
        this.delivery_charges_amount = delivery_charges_amount;
    }

    public ArrayList<DeliveryDistanceWiseCharges> getDelivery_distance_wise_charges() {
        return delivery_distance_wise_charges;
    }

    public void setDelivery_distance_wise_charges(ArrayList<DeliveryDistanceWiseCharges> delivery_distance_wise_charges) {
        this.delivery_distance_wise_charges = delivery_distance_wise_charges;
    }
}
