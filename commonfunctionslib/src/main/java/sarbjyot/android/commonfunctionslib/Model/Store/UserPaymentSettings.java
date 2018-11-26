package sarbjyot.android.commonfunctionslib.Model.Store;

import java.util.List;

import sarbjyot.android.commonfunctionslib.Model.Payment.PaymentMethodSettings;


/**
 * Created by Desk71 on 12/11/2017.
 */

public class UserPaymentSettings {

    private List<PaymentMethodSettings> payment_methods_settings;

    public List<PaymentMethodSettings> getPayment_methods_settings() {
        return payment_methods_settings;
    }

    public void setPayment_methods_settings(List<PaymentMethodSettings> payment_methods_settings) {
        this.payment_methods_settings = payment_methods_settings;
    }
}
