package sarbjyot.android.commonfunctionslib.Model.Platform;

/**
 * Created by Desk71 on 2018-09-25.
 */

public class AppleSetting {

    private boolean is_live  = false;
    private String app_id = "";

    public boolean isIs_live() {
        return is_live;
    }

    public void setIs_live(boolean is_live) {
        this.is_live = is_live;
    }

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }
}
