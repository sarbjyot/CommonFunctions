package sarbjyot.android.commonfunctionslib.Model;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by Desk71 on 4/18/2018.
 */

public class LocationPrefrences {

    public static void removeAppPreferences(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("locationPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.clear();
        editor.commit();
    }


    public static String getCurrentAddressCity(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("locationPreference", 0);
        return pref.getString("CurrentAddressCity", "");
    }

    public static void setCurrentAddressCity(String city, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("locationPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("CurrentAddressCity", city);
        editor.commit();
    }

    public static String getCurrentAddressArea(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("locationPreference", 0);
        return pref.getString("CurrentAddressArea", "");
    }

    public static void setCurrentAddressArea(String area, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("locationPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("CurrentAddressArea", area);
        editor.commit();
    }

}
