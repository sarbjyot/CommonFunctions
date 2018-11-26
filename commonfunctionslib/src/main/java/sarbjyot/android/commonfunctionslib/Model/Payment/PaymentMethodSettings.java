package sarbjyot.android.commonfunctionslib.Model.Payment;

/**
 * Created by Desk71 on 2/5/2018.
 */

public class PaymentMethodSettings {

    private String method = "";
    private boolean enabled = false;


    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
