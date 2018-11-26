package sarbjyot.android.commonfunctionslib.Model.Order;

/**
 * Created by Desk71 on 12/11/2017.
 */

public class CouponDetail {


    int mart_coupon_id= 0;
    String coupon_code= "";

    double discount_amount = 0;
    int mart_coupon_redemption_id= 0;

    public int getMart_coupon_id() {
        return mart_coupon_id;
    }

    public void setMart_coupon_id(int mart_coupon_id) {
        this.mart_coupon_id = mart_coupon_id;
    }

    public String getCoupon_code() {
        return coupon_code;
    }

    public void setCoupon_code(String coupon_code) {
        this.coupon_code = coupon_code;
    }

    public double getDiscount_amount() {
        return discount_amount;
    }

    public void setDiscount_amount(double discount_amount) {
        this.discount_amount = discount_amount;
    }

    public int getMart_coupon_redemption_id() {
        return mart_coupon_redemption_id;
    }

    public void setMart_coupon_redemption_id(int mart_coupon_redemption_id) {
        this.mart_coupon_redemption_id = mart_coupon_redemption_id;
    }
}
