package sarbjyot.android.commonfunctionslib.Model.Store;

/**
 * Created by Desk71 on 11/23/2017.
 */

public class PlatformDeal {

    private double discount_pct = 0;
    private String text;

    public double getDiscount_pct() {
        return discount_pct;
    }

    public void setDiscount_pct(double discount_pct) {
        this.discount_pct = discount_pct;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
