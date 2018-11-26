package sarbjyot.android.commonfunctionslib.Model.Catalog;

import java.io.Serializable;

import sarbjyot.android.commonfunctionslib.Model.DateTime.TimeRange;


/**
 * Created by Desk71 on 1/19/2018.
 */

public class ItemTimings implements Serializable {

    private TimeRange open_timings;
    private String day;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public TimeRange getOpen_timings() {
        return open_timings;
    }

    public void setOpen_timings(TimeRange open_timings) {
        this.open_timings = open_timings;
    }
}
