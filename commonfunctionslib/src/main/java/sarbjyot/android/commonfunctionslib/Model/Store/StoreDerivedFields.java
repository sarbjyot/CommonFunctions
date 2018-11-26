package sarbjyot.android.commonfunctionslib.Model.Store;


import java.io.Serializable;

import tech.imbibe.mart.android.app.user.MVC.Model.DateTime.TimeRange;

/**
 * Created by Desk71 on 11/17/2017.
 */

public class StoreDerivedFields implements Serializable {

    private double distance = 0;
    private TimeRange current_open_timing_range;
    private boolean isOpen = false;
    private String formatted_address;


    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public TimeRange getCurrent_open_timing_range() {
        return current_open_timing_range;
    }

    public void setCurrent_open_timing_range(TimeRange current_open_timing_range) {
        this.current_open_timing_range = current_open_timing_range;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public String getFormatted_address() {
        return formatted_address;
    }

    public void setFormatted_address(String formatted_address) {
        this.formatted_address = formatted_address;
    }
}
