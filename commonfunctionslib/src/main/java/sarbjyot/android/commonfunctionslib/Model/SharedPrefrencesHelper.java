package sarbjyot.android.commonfunctionslib.Model;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import tech.imbibe.mart.android.app.user.MVC.Model.Coupon.Coupon;
import tech.imbibe.mart.android.app.user.MVC.Model.Location.FeaturedArea;
import tech.imbibe.mart.android.app.user.MVC.Model.Order.Order;
import tech.imbibe.mart.android.app.user.MVC.Model.Store.Store;
import tech.imbibe.mart.android.app.user.MVC.Model.Store.StoreRating;


/**
 * Created by Desk71 on 11/17/2017.
 */

public class SharedPrefrencesHelper {


    public static void removeAppPreferences(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.clear();
        editor.commit();
    }


    public static void setSearchList(ArrayList<Store> data, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        Gson gson = new Gson();
        String jsonFavorites = gson.toJson(data);
        editor.putString("SearchList", jsonFavorites);
        editor.commit();
    }

    public static ArrayList<Order> getOrderList(Activity sActivity) {
        SharedPreferences settings;
        List<Order> orderlist;

        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);

        if (pref.contains("OrderList")) {
            String jsonFavorites = pref.getString("OrderList", null);
            Gson gson = new Gson();
            Order[] favoriteItems = gson.fromJson(jsonFavorites,
                    Order[].class);

            orderlist = Arrays.asList(favoriteItems);
            orderlist = new ArrayList<Order>(orderlist);
        } else
            return null;

        return (ArrayList<Order>) orderlist;
    }

    public static void setOrderList(ArrayList<Order> data, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        Gson gson = new Gson();
        String jsonFavorites = gson.toJson(data);
        editor.putString("OrderList", jsonFavorites);
        editor.commit();
    }


    public static ArrayList<Coupon> getCouponList(Activity sActivity) {
        List<Coupon> couponlist;
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        if (pref.contains("CouponList")) {
            String jsonFavorites = pref.getString("CouponList", null);
            Gson gson = new Gson();
            Coupon[] favoriteItems = gson.fromJson(jsonFavorites,
                    Coupon[].class);

            couponlist = Arrays.asList(favoriteItems);
            couponlist = new ArrayList<Coupon>(couponlist);
        } else
            return null;
        return (ArrayList<Coupon>) couponlist;
    }

    public static void setCouponList(ArrayList<Coupon> data, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        Gson gson = new Gson();
        String jsonFavorites = gson.toJson(data);
        editor.putString("CouponList", jsonFavorites);
        editor.commit();
    }

    public static ArrayList<Store> getSearchList(Activity sActivity) {
        SharedPreferences settings;
        List<Store> orderlist;

        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);

        if (pref.contains("SearchList")) {
            String jsonFavorites = pref.getString("SearchList", null);
            Gson gson = new Gson();
            Store[] favoriteItems = gson.fromJson(jsonFavorites,
                    Store[].class);

            orderlist = Arrays.asList(favoriteItems);
            orderlist = new ArrayList<Store>(orderlist);
        } else
            return null;

        return (ArrayList<Store>) orderlist;
    }

    public static ArrayList<StoreRating> getReviewList(Activity sActivity) {
        List<StoreRating> couponlist;
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        if (pref.contains("ReviewList")) {
            String jsonFavorites = pref.getString("ReviewList", null);
            Gson gson = new Gson();
            StoreRating[] favoriteItems = gson.fromJson(jsonFavorites,
                    StoreRating[].class);

            couponlist = Arrays.asList(favoriteItems);
            couponlist = new ArrayList<StoreRating>(couponlist);
        } else
            return null;
        return (ArrayList<StoreRating>) couponlist;
    }

    public static void setReviewList(ArrayList<StoreRating> data, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        Gson gson = new Gson();
        String jsonFavorites = gson.toJson(data);
        editor.putString("ReviewList", jsonFavorites);
        editor.commit();
    }

    public static String getCurrentStore(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getString("CurrentStore", null);
    }

    public static void setCurrentStore(String data, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("CurrentStore", data);
        editor.commit();
    }

    public static String getCurrentPartnerStoreWrapper(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getString("CurrentPartnerStoreWrapper", null);
    }

    public static void setCurrentPartnerStoreWrapper(String data, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("CurrentPartnerStoreWrapper", data);
        editor.commit();
    }

    public static String getCurrentItem(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getString("CurrentItem", null);
    }

    public static void setCurrentItem(String data, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("CurrentItem", data);
        editor.commit();
    }

    public static String getStoreWrapper(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getString("StoreWrapper", null);
    }

    public static void setStoreWrapper(String data, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("StoreWrapper", data);
        editor.commit();
    }

    public static String getCurrentStoreWrapper(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getString("CurrentStoreWrapper", null);
    }

    public static void setCurrentStoreWrapper(String data, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("CurrentStoreWrapper", data);
        editor.commit();
    }

    public static String getPlatformSetting(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getString("PlatformSetting", "");
    }

    public static void setPlatformSetting(String data, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("PlatformSetting", data);
        editor.commit();
    }

    public static String getCurrentCart(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getString("CurrentCart", "");
    }

    public static void setCurrentCart(String data, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("CurrentCart", data);
        editor.commit();
    }

    public static String getCurrentPartnerCart(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getString("CurrentPartnerCart", "");
    }

    public static void setCurrentPartnerCart(String data, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("CurrentPartnerCart", data);
        editor.commit();
    }


    public static String getNotificationCart(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getString("NotificationCart", "");
    }

    public static void setNotificationCart(String data, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("NotificationCart", data);
        editor.commit();
    }


    public static void setCurrentAddress(String CurrentAddress, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("CurrentAddress", CurrentAddress);
        editor.commit();
    }

    public static String getCurrentAddress(Context sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getString("CurrentAddress", "");
    }


    public static void setCurrentUser(String data, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("CurrentUser", data);
        editor.commit();
    }

    public static String getCurrentUser(Context sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getString("CurrentUser", "");
    }

    public static String getOtpID(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getString("OtpID", "");
    }

    public static void setOtpID(String OtpID, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("OtpID", OtpID);
        editor.commit();
    }



    public static String getCurrentAddressID(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getString("CurrentAddressID", "");
    }

    public static void setCurrentAddressID(String CurrentAddressID, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("CurrentAddressID", CurrentAddressID);
        editor.commit();
    }

    public static String getCurrentAddressHouse(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getString("CurrentAddressHouse", "");
    }

    public static void setCurrentAddressHouse(String CurrentAddressHouse, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("CurrentAddressHouse", CurrentAddressHouse);
        editor.commit();
    }

    public static String getFcmToken(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getString("FcmToken", "");
    }

    public static void setFcmToken(String FcmToken, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("FcmToken", FcmToken);
        editor.commit();
    }

    public static String getSearchToken(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getString("SearchToken", "");
    }

    public static void setSearchToken(String SearchToken, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("SearchToken", SearchToken);
        editor.commit();
    }

    public static String getStoreSearchToken(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getString("StoreSearchToken", "");
    }

    public static void setStoreSearchToken(String SearchToken, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("StoreSearchToken", SearchToken);
        editor.commit();
    }



    public static String getOrderSearchToken(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getString("OrderSearchToken", "");
    }

    public static void setOrderSearchToken(String OrderSearchToken, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("OrderSearchToken", OrderSearchToken);
        editor.commit();
    }

    public static String getSelectedScreen(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getString("SelectedScreen", "");
    }

    public static void setSelectedScreen(String SelectedScreen, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("SelectedScreen", SelectedScreen);
        editor.commit();
    }

    public static String getCurrentOrderID(Context sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getString("CurrentOrderID", "");
    }

    public static void setCurrentOrderID(String CurrentAddressID, Context sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("CurrentOrderID", CurrentAddressID);
        editor.commit();
    }


    public static String getNotificationData(Context sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getString("NotificationData", "");
    }

    public static void setNotificationData(String CurrentAddressID, Context sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("NotificationData", CurrentAddressID);
        editor.commit();
    }

    public static String getStoreSearchKey(Context sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getString("setStoreSearchKey", "");
    }

    public static void setStoreSearchKey(String CurrentAddressID, Context sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("setStoreSearchKey", CurrentAddressID);
        editor.commit();
    }

    public static String getOrderSearchKey(Context sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getString("OrderSearchKey", "");
    }

    public static void setOrderSearchKey(String CurrentAddressID, Context sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("OrderSearchKey", CurrentAddressID);
        editor.commit();
    }

    public static boolean getIsFirstCall(Context sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getBoolean("IsFirstCall", false);
    }

    public static void setIsFirstCall(boolean IsFirstCall, Context sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("IsFirstCall", IsFirstCall);
        editor.commit();
    }

    public static boolean getIsDetailFirstCall(Context sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getBoolean("IsDetailFirstCall", false);
    }

    public static void setIsDetailFirstCall(boolean IsFirstCall, Context sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("IsDetailFirstCall", IsFirstCall);
        editor.commit();
    }


    public static boolean getIsOrderFirstCall(Context sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getBoolean("IsOrderFirstCall", false);
    }

    public static void setIsOrderFirstCall(boolean IsFirstCall, Context sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("IsOrderFirstCall", IsFirstCall);
        editor.commit();
    }


    public static boolean getIsAreaFirstCall(Context sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getBoolean("IsAreaFirstCall", false);
    }

    public static void setIsAreaFirstCall(boolean IsFirstCall, Context sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("IsAreaFirstCall", IsFirstCall);
        editor.commit();
    }


    public static ArrayList<FeaturedArea> getAreaList(Activity sActivity) {
        List<FeaturedArea> couponlist;
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        if (pref.contains("AreaList")) {
            String jsonFavorites = pref.getString("AreaList", null);
            Gson gson = new Gson();
            FeaturedArea[] favoriteItems = gson.fromJson(jsonFavorites,
                    FeaturedArea[].class);

            couponlist = Arrays.asList(favoriteItems);
            couponlist = new ArrayList<FeaturedArea>(couponlist);
        } else
            return null;
        return (ArrayList<FeaturedArea>) couponlist;
    }

    public static void setAreaList(ArrayList<FeaturedArea> data, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        Gson gson = new Gson();
        String jsonFavorites = gson.toJson(data);
        editor.putString("AreaList", jsonFavorites);
        editor.commit();
    }



    public static boolean getIsFilter(Context sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        return pref.getBoolean("IsFilter", false);
    }

    public static void setIsFilter(boolean IsFilter, Context sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("appPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("IsFilter", IsFilter);
        editor.commit();
    }



}
