package sarbjyot.android.commonfunctionslib.Model;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import tech.imbibe.mart.android.app.user.BuildConfig;
import tech.imbibe.mart.android.app.user.MVC.Controller.CartHelper;

/**
 * Created by Desk71 on 11/22/2017.
 */

public class DeviceInfo {

    private String device_token = "";
    private String device_type = "android";
    private String app_id = "";
    private String app_version_number = "";
    private String app_build_number = "";
    private String app_callback_token = "";

    private static DeviceInfo deviceInfo = null;

    public String getDevice_type() {
        return device_type;
    }

    public void setDevice_type(String device_type) {
        this.device_type = device_type;
    }

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public String getApp_version_number() {
        return app_version_number;
    }

    public void setApp_version_number(String app_version_number) {
        this.app_version_number = app_version_number;
    }

    public String getApp_build_number() {
        return app_build_number;
    }

    public void setApp_build_number(String app_build_number) {
        this.app_build_number = app_build_number;
    }

    public String getApp_callback_token() {
        return app_callback_token;
    }

    public void setApp_callback_token(String app_callback_token) {
        this.app_callback_token = app_callback_token;
    }

    public static DeviceInfo getCurrentDeviceInfo(Context activity) {
        if (DeviceInfo.deviceInfo == null) {
            DeviceInfo.deviceInfo = new DeviceInfo();
            PackageInfo packageInfo = null;
            try {
                packageInfo = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
            DeviceInfo.deviceInfo.device_token = CartHelper.getDeviceToken(activity);
            DeviceInfo.deviceInfo.app_id = BuildConfig.APPLICATION_ID;
            DeviceInfo.deviceInfo.app_version_number = packageInfo.versionName;
            DeviceInfo.deviceInfo.app_build_number = String.valueOf(packageInfo.versionCode);
        }

        return (DeviceInfo.deviceInfo);
    }
}