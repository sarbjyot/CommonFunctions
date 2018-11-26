package sarbjyot.android.commonfunctionslib.Model.DateTime;

import java.io.Serializable;

/**
 * Created by Desk71 on 11/17/2017.
 */

public class TimeRange  implements Serializable {


    private boolean is_all_day = false;
    private  String start_time;
    private  String end_time;

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public boolean isIs_all_day() {
        return is_all_day;
    }

    public void setIs_all_day(boolean is_all_day) {
        this.is_all_day = is_all_day;
    }
}
