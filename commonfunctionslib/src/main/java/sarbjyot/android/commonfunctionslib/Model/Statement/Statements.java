package sarbjyot.android.commonfunctionslib.Model.Statement;

import java.util.ArrayList;
import java.util.List;

import sarbjyot.android.commonfunctionslib.Model.Order.Order;


/**
 * Created by Desk71 on 2018-10-09.
 */

public class Statements {

    private List<Order> orders = new ArrayList<>();
    private List<Adjustment> adjustments = new ArrayList<>();
    private List<Adjustment> chargebacks = new ArrayList<>();
    private Summary summary = null;


    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Adjustment> getAdjustments() {
        return adjustments;
    }

    public void setAdjustments(List<Adjustment> adjustments) {
        this.adjustments = adjustments;
    }

    public List<Adjustment> getChargebacks() {
        return chargebacks;
    }

    public void setChargebacks(List<Adjustment> chargebacks) {
        this.chargebacks = chargebacks;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }
}
