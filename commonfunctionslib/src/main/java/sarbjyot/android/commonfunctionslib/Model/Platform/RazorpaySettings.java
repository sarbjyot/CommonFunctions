package sarbjyot.android.commonfunctionslib.Model.Platform;

/**
 * Created by Desk71 on 2/5/2018.
 */

public class RazorpaySettings {

    private boolean is_live = false;
    private String test_api_key_id = "";
    private String live_api_key_id = "";

    public boolean isIs_live() {
        return is_live;
    }

    public void setIs_live(boolean is_live) {
        this.is_live = is_live;
    }

    public String getTest_api_key_id() {
        return test_api_key_id;
    }

    public void setTest_api_key_id(String test_api_key_id) {
        this.test_api_key_id = test_api_key_id;
    }

    public String getLive_api_key_id() {
        return live_api_key_id;
    }

    public void setLive_api_key_id(String live_api_key_id) {
        this.live_api_key_id = live_api_key_id;
    }
}
