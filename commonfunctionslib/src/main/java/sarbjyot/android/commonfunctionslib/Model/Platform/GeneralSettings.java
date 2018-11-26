package sarbjyot.android.commonfunctionslib.Model.Platform;

/**
 * Created by Desk71 on 2/5/2018.
 */

public class GeneralSettings {

    private boolean use_miles = false;
    private int default_page_size = 0;

    public boolean isUse_miles() {
        return use_miles;
    }

    public void setUse_miles(boolean use_miles) {
        this.use_miles = use_miles;
    }

    public int getDefault_page_size() {
        return default_page_size;
    }

    public void setDefault_page_size(int default_page_size) {
        this.default_page_size = default_page_size;
    }
}
