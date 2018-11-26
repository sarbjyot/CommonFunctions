package sarbjyot.android.commonfunctionslib.Model.Coupon;

/**
 * Created by Desk71 on 3/27/2018.
 */

public class Coupon {

    private int mart_coupon_id = 0;
    private String coupon_code;
    private String description;


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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
