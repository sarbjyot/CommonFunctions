package sarbjyot.android.commonfunctionslib.Model.Store;


import java.io.Serializable;

import sarbjyot.android.commonfunctionslib.Model.DateTime.TimeRange;


/**
 * Created by Desk71 on 11/17/2017.
 */

public class StoreTimings implements Serializable {

    private TimeRange open_timings;
    private TimeRange delivery_timings;

    public TimeRange getOpen_timings() {
        return open_timings;
    }

    public void setOpen_timings(TimeRange open_timings) {
        this.open_timings = open_timings;
    }

    public TimeRange getDelivery_timings() {
        return delivery_timings;
    }

    public void setDelivery_timings(TimeRange delivery_timings) {
        this.delivery_timings = delivery_timings;
    }
}
