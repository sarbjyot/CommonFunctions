package sarbjyot.android.commonfunctionslib.Model.Platform;

/**
 * Created by Desk71 on 2/5/2018.
 */

public class OrderSettings {

    private String order_number_prefix = "";
    private boolean disable_platform_deals = false;
    private boolean disable_condiments = false;
    private boolean disable_tip = false;
    private boolean disable_order_scheduling = false;

    public String getOrder_number_prefix() {
        return order_number_prefix;
    }

    public void setOrder_number_prefix(String order_number_prefix) {
        this.order_number_prefix = order_number_prefix;
    }

    public boolean isDisable_platform_deals() {
        return disable_platform_deals;
    }

    public void setDisable_platform_deals(boolean disable_platform_deals) {
        this.disable_platform_deals = disable_platform_deals;
    }

    public boolean isDisable_condiments() {
        return disable_condiments;
    }

    public void setDisable_condiments(boolean disable_condiments) {
        this.disable_condiments = disable_condiments;
    }

    public boolean isDisable_tip() {
        return disable_tip;
    }

    public void setDisable_tip(boolean disable_tip) {
        this.disable_tip = disable_tip;
    }

    public boolean isDisable_order_scheduling() {
        return disable_order_scheduling;
    }

    public void setDisable_order_scheduling(boolean disable_order_scheduling) {
        this.disable_order_scheduling = disable_order_scheduling;
    }
}
