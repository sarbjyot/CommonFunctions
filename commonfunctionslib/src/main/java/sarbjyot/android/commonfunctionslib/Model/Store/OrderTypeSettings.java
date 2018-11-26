package sarbjyot.android.commonfunctionslib.Model.Store;

import java.io.Serializable;

/**
 * Created by Desk71 on 11/17/2017.
 */

public class OrderTypeSettings  implements Serializable {

    private  DeliverySettings delivery_settings;
    private  PickupSettings pickup_settings;

    public DeliverySettings getDelivery_settings() {
        return delivery_settings;
    }

    public void setDelivery_settings(DeliverySettings delivery_settings) {
        this.delivery_settings = delivery_settings;
    }

    public PickupSettings getPickup_settings() {
        return pickup_settings;
    }

    public void setPickup_settings(PickupSettings pickup_settings) {
        this.pickup_settings = pickup_settings;
    }
}
