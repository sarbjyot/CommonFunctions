package sarbjyot.android.commonfunctionslib.Model.Store;

import java.io.Serializable;

/**
 * Created by Desk71 on 11/17/2017.
 */

public class PickupSettings implements Serializable {

    private int estimated_pickup_time_minutes = 0;
    boolean enabled = false;

    public int getEstimated_pickup_time_minutes() {
        return estimated_pickup_time_minutes;
    }

    public void setEstimated_pickup_time_minutes(int estimated_pickup_time_minutes) {
        this.estimated_pickup_time_minutes = estimated_pickup_time_minutes;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
