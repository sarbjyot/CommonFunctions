package sarbjyot.android.commonfunctionslib.Model;

import android.app.Activity;
import android.content.SharedPreferences;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

/**
 * Created by Desk71 on 2018-06-14.
 */

public class FilterPrefrences {

    public static void removeFilterPreferences(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("filterPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.clear();
        editor.commit();
    }


    public static ArrayList<String> getOrderTypeFilter(Activity sActivity) {
        ArrayList<String> array = new ArrayList<String>();
        SharedPreferences pref = sActivity.getSharedPreferences("filterPreference", 0);
        String jArrayString = pref.getString("OrderTypeFilter", null);
        if (pref.contains("OrderTypeFilter")) {
            try {
                JSONArray jArray = new JSONArray(jArrayString);
                for (int i = 0; i < jArray.length(); i++) {
                    array.add(jArray.getString(i));
                }
                return array;
            } catch (JSONException e) {
                return null;
            }
        } else {
            return null;
        }
    }

    public static void setOrderTypeFilter(ArrayList<String> data, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("filterPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        JSONArray jArray = new JSONArray(data);
        editor.putString("OrderTypeFilter", jArray.toString());
        editor.commit();
    }



    public static ArrayList<String> getStoreTypeFilter(Activity sActivity) {
        ArrayList<String> array = new ArrayList<String>();
        SharedPreferences pref = sActivity.getSharedPreferences("filterPreference", 0);
        String jArrayString = pref.getString("StoreTypeFilter", null);
        if (pref.contains("StoreTypeFilter")) {
            try {
                JSONArray jArray = new JSONArray(jArrayString);
                for (int i = 0; i < jArray.length(); i++) {
                    array.add(jArray.getString(i));
                }
                return array;
            } catch (JSONException e) {
                return null;
            }
        } else {
            return null;
        }
    }

    public static void setStoreTypeFilter(ArrayList<String> data, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("filterPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        JSONArray jArray = new JSONArray(data);
        editor.putString("StoreTypeFilter", jArray.toString());
        editor.commit();
    }


    public static ArrayList<String> getCuisineFilterList(Activity sActivity) {
        ArrayList<String> array = new ArrayList<String>();
        SharedPreferences pref = sActivity.getSharedPreferences("filterPreference", 0);
        String jArrayString = pref.getString("CuisineFilterList", null);
        if (pref.contains("CuisineFilterList")) {
            try {
                JSONArray jArray = new JSONArray(jArrayString);
                for (int i = 0; i < jArray.length(); i++) {
                    array.add(jArray.getString(i));
                }
                return array;
            } catch (JSONException e) {
                return null;
            }
        } else {
            return null;
        }
    }

    public static void setCuisineFilterList(ArrayList<String> data, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("filterPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        JSONArray jArray = new JSONArray(data);
        editor.putString("CuisineFilterList", jArray.toString());
        editor.commit();
    }


    public static ArrayList<String> getDishFilterList(Activity sActivity) {
        ArrayList<String> array = new ArrayList<String>();
        SharedPreferences pref = sActivity.getSharedPreferences("filterPreference", 0);
        String jArrayString = pref.getString("DishFilterList", null);
        if (pref.contains("DishFilterList")) {
            try {
                JSONArray jArray = new JSONArray(jArrayString);
                for (int i = 0; i < jArray.length(); i++) {
                    array.add(jArray.getString(i));
                }
                return array;
            } catch (JSONException e) {
                return null;
            }
        } else {
            return null;
        }
    }

    public static void setDishFilterList(ArrayList<String> data, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("filterPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        JSONArray jArray = new JSONArray(data);
        editor.putString("DishFilterList", jArray.toString());
        editor.commit();
    }


    // Order screen filter

    public static String getFilterOrderId(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("filterPreference", 0);
        return pref.getString("FilterOrderId", "");
    }

    public static void setFilterOrderId(String StartDate, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("filterPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("FilterOrderId", StartDate);
        editor.commit();
    }


    public static String getFilterPaymentId(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("filterPreference", 0);
        return pref.getString("FilterPaymentId", "");
    }

    public static void setFilterPaymentId(String StartDate, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("filterPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("FilterPaymentId", StartDate);
        editor.commit();
    }


    public static String getStartDate(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("filterPreference", 0);
        return pref.getString("StartDate", "");
    }

    public static void setStartDate(String StartDate, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("filterPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("StartDate", StartDate);
        editor.commit();
    }


    public static String getEndDate(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("filterPreference", 0);
        return pref.getString("EndDate", "");
    }

    public static void setEndDate(String EndDate, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("filterPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("EndDate", EndDate);
        editor.commit();
    }

    public static String getIsTest(Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("filterPreference", 0);
        return pref.getString("IsTest", "");
    }

    public static void setIsTest(String IsTest, Activity sActivity) {
        SharedPreferences pref = sActivity.getSharedPreferences("filterPreference", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("IsTest", IsTest);
        editor.commit();
    }




}
