package sarbjyot.android.commonfunctionslib.Model.Payment;

/**
 * Created by Desk71 on 11/17/2017.
 */

public class PaymentMode {
    public static int CashOnDelivery = 1;
    public static int Card = 2;
    public static int WireTransfer = 3;
    public static int Cheque = 4;


    public static String getPaymentModeStr(int payment_mode,String payment_method) {
        String value = "";
        if (payment_mode == PaymentMode.CashOnDelivery) {
            value = "Cash";
        } else if (payment_mode == PaymentMode.Card){
            if(payment_method.contains("paytm")) {
                value = "Paytm";
            } else {
                value = "Pay Online";
            }
        }
        return value;
    }


}
