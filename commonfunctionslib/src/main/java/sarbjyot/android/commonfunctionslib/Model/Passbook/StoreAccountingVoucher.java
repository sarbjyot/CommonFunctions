package sarbjyot.android.commonfunctionslib.Model.Passbook;


import sarbjyot.android.commonfunctionslib.Model.Store.Store;

/**
 * Created by Desk71 on 2018-10-10.
 */

public class StoreAccountingVoucher {


    private int store_accounting_voucher_id;
    private String created_time;
    private int store_id;
    private int owner_user_id;
    private String voucher_type;
    private int payment_id;
    private int payment_mode;
    private String payment_method;
    private int status;
    private double amount;
    private VoucherDetail voucher_detail;
    private Store store;


    public int getStore_accounting_voucher_id() {
        return store_accounting_voucher_id;
    }

    public void setStore_accounting_voucher_id(int store_accounting_voucher_id) {
        this.store_accounting_voucher_id = store_accounting_voucher_id;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public int getOwner_user_id() {
        return owner_user_id;
    }

    public void setOwner_user_id(int owner_user_id) {
        this.owner_user_id = owner_user_id;
    }

    public String getVoucher_type() {
        return voucher_type;
    }

    public void setVoucher_type(String voucher_type) {
        this.voucher_type = voucher_type;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public VoucherDetail getVoucher_detail() {
        return voucher_detail;
    }

    public void setVoucher_detail(VoucherDetail voucher_detail) {
        this.voucher_detail = voucher_detail;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
