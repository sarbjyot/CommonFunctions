package sarbjyot.android.commonfunctionslib.Model.Store;

/**
 * Created by Desk71 on 3/13/2018.
 */

public class PlatformSetting {

    private double platform_commission_pct = 0;
    private double online_payment_fee_pct = 0;
    private boolean disable_platform_deals = false;
    private boolean is_sponsored = false;

    public double getPlatform_commission_pct() {
        return platform_commission_pct;
    }

    public void setPlatform_commission_pct(double platform_commission_pct) {
        this.platform_commission_pct = platform_commission_pct;
    }

    public double getOnline_payment_fee_pct() {
        return online_payment_fee_pct;
    }

    public void setOnline_payment_fee_pct(double online_payment_fee_pct) {
        this.online_payment_fee_pct = online_payment_fee_pct;
    }

    public boolean isDisable_platform_deals() {
        return disable_platform_deals;
    }

    public void setDisable_platform_deals(boolean disable_platform_deals) {
        this.disable_platform_deals = disable_platform_deals;
    }

    public boolean isIs_sponsored() {
        return is_sponsored;
    }

    public void setIs_sponsored(boolean is_sponsored) {
        this.is_sponsored = is_sponsored;
    }
}
