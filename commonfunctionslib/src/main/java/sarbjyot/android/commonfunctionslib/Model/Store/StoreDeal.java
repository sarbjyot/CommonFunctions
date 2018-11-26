package sarbjyot.android.commonfunctionslib.Model.Store;

import java.io.Serializable;

/**
 * Created by Desk71 on 11/17/2017.
 */

public class StoreDeal implements Serializable {

    private double min_order_amount = 0;
    private double discount_pct = 0;
    private String notes;
    private int[] delivery_modes = null;

    public double getMin_order_amount() {
        return min_order_amount;
    }

    public void setMin_order_amount(double min_order_amount) {
        this.min_order_amount = min_order_amount;
    }

    public double getDiscount_pct() {
        return discount_pct;
    }

    public void setDiscount_pct(double discount_pct) {
        this.discount_pct = discount_pct;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int[] getDelivery_modes() {
        return delivery_modes;
    }

    public void setDelivery_modes(int[] delivery_modes) {
        this.delivery_modes = delivery_modes;
    }
}
