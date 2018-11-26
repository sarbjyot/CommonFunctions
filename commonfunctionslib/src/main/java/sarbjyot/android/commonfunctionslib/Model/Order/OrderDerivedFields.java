package sarbjyot.android.commonfunctionslib.Model.Order;

import java.io.Serializable;

/**
 * Created by Desk71 on 11/17/2017.
 */

public class OrderDerivedFields  implements Serializable {

    private String created_time_formatted;
    private String processed_time_formatted = null;
    private String partnerConfirmUrl = null;
    private String partnerCancelUrl = null;
    private String user_rating_time_formatted = null;


    public String getCreated_time_formatted() {
        return created_time_formatted;
    }

    public void setCreated_time_formatted(String created_time_formatted) {
        this.created_time_formatted = created_time_formatted;
    }

    public String getProcessed_time_formatted() {
        return processed_time_formatted;
    }

    public void setProcessed_time_formatted(String processed_time_formatted) {
        this.processed_time_formatted = processed_time_formatted;
    }

    public String getPartnerConfirmUrl() {
        return partnerConfirmUrl;
    }

    public void setPartnerConfirmUrl(String partnerConfirmUrl) {
        this.partnerConfirmUrl = partnerConfirmUrl;
    }

    public String getPartnerCancelUrl() {
        return partnerCancelUrl;
    }

    public void setPartnerCancelUrl(String partnerCancelUrl) {
        this.partnerCancelUrl = partnerCancelUrl;
    }

    public String getUser_rating_time_formatted() {
        return user_rating_time_formatted;
    }

    public void setUser_rating_time_formatted(String user_rating_time_formatted) {
        this.user_rating_time_formatted = user_rating_time_formatted;
    }
}
