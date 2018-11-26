package sarbjyot.android.commonfunctionslib.Model.Statement;

/**
 * Created by Desk71 on 2018-10-09.
 */

public class Summary {

    private int count;
    private double items_total_amount = 0.0;
    private double store_discount_amount = 0.0;
    private double platform_discount_amount = 0.0;
    private double tip_amount = 0.0;
    private double tax_amount = 0.0;
    private double net_amount = 0.0;
    private double net_amount_online = 0.0;
    private double net_amount_cash = 0.0;
    private double platform_commission_amount = 0.0;
    private double net_amount_due = 0.0;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getItems_total_amount() {
        return items_total_amount;
    }

    public void setItems_total_amount(double items_total_amount) {
        this.items_total_amount = items_total_amount;
    }

    public double getStore_discount_amount() {
        return store_discount_amount;
    }

    public void setStore_discount_amount(double store_discount_amount) {
        this.store_discount_amount = store_discount_amount;
    }

    public double getPlatform_discount_amount() {
        return platform_discount_amount;
    }

    public void setPlatform_discount_amount(double platform_discount_amount) {
        this.platform_discount_amount = platform_discount_amount;
    }

    public double getTip_amount() {
        return tip_amount;
    }

    public void setTip_amount(double tip_amount) {
        this.tip_amount = tip_amount;
    }

    public double getTax_amount() {
        return tax_amount;
    }

    public void setTax_amount(double tax_amount) {
        this.tax_amount = tax_amount;
    }

    public double getNet_amount() {
        return net_amount;
    }

    public void setNet_amount(double net_amount) {
        this.net_amount = net_amount;
    }

    public double getNet_amount_online() {
        return net_amount_online;
    }

    public void setNet_amount_online(double net_amount_online) {
        this.net_amount_online = net_amount_online;
    }

    public double getNet_amount_cash() {
        return net_amount_cash;
    }

    public void setNet_amount_cash(double net_amount_cash) {
        this.net_amount_cash = net_amount_cash;
    }

    public double getPlatform_commission_amount() {
        return platform_commission_amount;
    }

    public void setPlatform_commission_amount(double platform_commission_amount) {
        this.platform_commission_amount = platform_commission_amount;
    }

    public double getNet_amount_due() {
        return net_amount_due;
    }

    public void setNet_amount_due(double net_amount_due) {
        this.net_amount_due = net_amount_due;
    }
}
