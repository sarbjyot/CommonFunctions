package sarbjyot.android.commonfunctionslib.Model.Order;

import java.io.Serializable;

/**
 * Created by Desk71 on 11/17/2017.
 */

public class OrderBreakup implements Serializable {

    private double items_total_amount = 0;
    private double discountable_items_total_amount = 0;
    private double items_total_discountable_amount = 0;
    private double store_discount_pct = 0;
    private double effective_store_discount_pct = 0;
    private double store_discount_amount = 0;
    private double platform_discount_pct = 0;
    private double effective_platform_discount_pct = 0;
    private double platform_discount_amount = 0;
    private double total_discount_pct = 0;
    private double total_discount_amount = 0;
    private double delivery_charges_amount = 0;
    private double tip_pct = 0;
    private double tip_amount = 0;
    private double tax_pct = 0;
    private double tax_amount = 0;
    private double platform_commission_pct = 0;
    private double platform_commission_amount = 0;
    private double payment_mode_processing_fee_formula = 0;
    private double payment_mode_processing_fee_amount = 0;
    private double store_amount = 0;
    private double net_platform_amount = 0;
    private double net_store_amount = 0;
    private double net_amount_due_to_store = 0;
    private double net_amount_due_to_platform = 0;
    private double net_amount_due = 0;
    private double net_amount = 0;
    private double net_platform_earning_amount = 0.0;


    public double getItems_total_amount() {
        return items_total_amount;
    }

    public void setItems_total_amount(double items_total_amount) {
        this.items_total_amount = items_total_amount;
    }

    public double getDiscountable_items_total_amount() {
        return discountable_items_total_amount;
    }

    public void setDiscountable_items_total_amount(double discountable_items_total_amount) {
        this.discountable_items_total_amount = discountable_items_total_amount;
    }

    public double getItems_total_discountable_amount() {
        return items_total_discountable_amount;
    }

    public void setItems_total_discountable_amount(double items_total_discountable_amount) {
        this.items_total_discountable_amount = items_total_discountable_amount;
    }

    public double getStore_discount_pct() {
        return store_discount_pct;
    }

    public void setStore_discount_pct(double store_discount_pct) {
        this.store_discount_pct = store_discount_pct;
    }

    public double getEffective_store_discount_pct() {
        return effective_store_discount_pct;
    }

    public void setEffective_store_discount_pct(double effective_store_discount_pct) {
        this.effective_store_discount_pct = effective_store_discount_pct;
    }

    public double getStore_discount_amount() {
        return store_discount_amount;
    }

    public void setStore_discount_amount(double store_discount_amount) {
        this.store_discount_amount = store_discount_amount;
    }

    public double getPlatform_discount_pct() {
        return platform_discount_pct;
    }

    public void setPlatform_discount_pct(double platform_discount_pct) {
        this.platform_discount_pct = platform_discount_pct;
    }

    public double getEffective_platform_discount_pct() {
        return effective_platform_discount_pct;
    }

    public void setEffective_platform_discount_pct(double effective_platform_discount_pct) {
        this.effective_platform_discount_pct = effective_platform_discount_pct;
    }

    public double getPlatform_discount_amount() {
        return platform_discount_amount;
    }

    public void setPlatform_discount_amount(double platform_discount_amount) {
        this.platform_discount_amount = platform_discount_amount;
    }

    public double getTotal_discount_pct() {
        return total_discount_pct;
    }

    public void setTotal_discount_pct(double total_discount_pct) {
        this.total_discount_pct = total_discount_pct;
    }

    public double getTotal_discount_amount() {
        return total_discount_amount;
    }

    public void setTotal_discount_amount(double total_discount_amount) {
        this.total_discount_amount = total_discount_amount;
    }

    public double getDelivery_charges_amount() {
        return delivery_charges_amount;
    }

    public void setDelivery_charges_amount(double delivery_charges_amount) {
        this.delivery_charges_amount = delivery_charges_amount;
    }

    public double getTip_pct() {
        return tip_pct;
    }

    public void setTip_pct(double tip_pct) {
        this.tip_pct = tip_pct;
    }

    public double getTip_amount() {
        return tip_amount;
    }

    public void setTip_amount(double tip_amount) {
        this.tip_amount = tip_amount;
    }

    public double getTax_pct() {
        return tax_pct;
    }

    public void setTax_pct(double tax_pct) {
        this.tax_pct = tax_pct;
    }

    public double getTax_amount() {
        return tax_amount;
    }

    public void setTax_amount(double tax_amount) {
        this.tax_amount = tax_amount;
    }

    public double getPlatform_commission_pct() {
        return platform_commission_pct;
    }

    public void setPlatform_commission_pct(double platform_commission_pct) {
        this.platform_commission_pct = platform_commission_pct;
    }

    public double getPlatform_commission_amount() {
        return platform_commission_amount;
    }

    public void setPlatform_commission_amount(double platform_commission_amount) {
        this.platform_commission_amount = platform_commission_amount;
    }

    public double getPayment_mode_processing_fee_formula() {
        return payment_mode_processing_fee_formula;
    }

    public void setPayment_mode_processing_fee_formula(double payment_mode_processing_fee_formula) {
        this.payment_mode_processing_fee_formula = payment_mode_processing_fee_formula;
    }

    public double getPayment_mode_processing_fee_amount() {
        return payment_mode_processing_fee_amount;
    }

    public void setPayment_mode_processing_fee_amount(double payment_mode_processing_fee_amount) {
        this.payment_mode_processing_fee_amount = payment_mode_processing_fee_amount;
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

    public double getNet_platform_earning_amount() {
        return net_platform_earning_amount;
    }

    public void setNet_platform_earning_amount(double net_platform_earning_amount) {
        this.net_platform_earning_amount = net_platform_earning_amount;
    }
}
