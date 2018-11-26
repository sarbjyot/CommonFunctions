package sarbjyot.android.commonfunctionslib.Model.Platform;

import java.util.List;

import tech.imbibe.mart.android.app.user.MVC.Model.Payment.PaymentMethodSettings;

/**
 * Created by Desk71 on 2/9/2018.
 */

public class PaymentSettings {

    private String currency_code = "";
    private List<PaymentMethodSettings> payment_methods_settings = null;

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    public List<PaymentMethodSettings> getPayment_methods_settings() {
        return payment_methods_settings;
    }

    public void setPayment_methods_settings(List<PaymentMethodSettings> payment_methods_settings) {
        this.payment_methods_settings = payment_methods_settings;
    }
}
