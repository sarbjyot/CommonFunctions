package sarbjyot.android.commonfunctionslib.Model.Platform;

/**
 * Created by Desk71 on 2018-09-25.
 */

public class ApiSetting {

    private AppleSetting apple_settings;
    private GoogleSetting google_settings;

    public AppleSetting getApple_settings() {
        return apple_settings;
    }

    public void setApple_settings(AppleSetting apple_settings) {
        this.apple_settings = apple_settings;
    }

    public GoogleSetting getGoogle_settings() {
        return google_settings;
    }

    public void setGoogle_settings(GoogleSetting google_settings) {
        this.google_settings = google_settings;
    }
}
