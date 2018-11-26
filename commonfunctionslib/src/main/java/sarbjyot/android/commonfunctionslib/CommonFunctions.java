package sarbjyot.android.commonfunctionslib;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.StrictMode;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.DatePicker;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.vision.barcode.Barcode;

import org.joda.time.Days;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

/**
 * Created by Desk71 on 11/23/2017.
 */

public class CommonFunctions {

    public static Dialog dialog1;


    public static String getCurrentTimeUsingDate() {
        Date date = new Date();
        String strDateFormat = "hh:mm:ss a";
        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
        String formattedDate =DateFormat.getDateTimeInstance().format(new Date());
        //String formattedDate= dateFormat.format(date);
        return formattedDate;
    }

    public static String formattedTimeFromTimeStamp(String timestamp){
        String date = null;
        Calendar cal = Calendar.getInstance(Locale.ENGLISH);
        cal.setTimeInMillis(Long.parseLong(timestamp));
        Date BeforeDate = cal.getTime();
        date = new SimpleDateFormat("MMM dd, yyyy").format(BeforeDate);
        //date = DateFormat.format("dd-MM-yyyy", cal).toString();

        return  date ;
    }


    public static boolean isValidEmail(String target) {
        if (target == null) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }

    public static void setStatusBarColor(Activity context) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            Window window = context.getWindow();
            // clear FLAG_TRANSLUCENT_STATUS flag:
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            // add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            // finally change the color
            window.setStatusBarColor(ContextCompat.getColor(context, R.color.colorPrimary));
        } else {
            // do something for phones running an SDK before lollipop
        }
    }

    public static Boolean isNetWorking(Context context) {
        try {
            ConnectivityManager ConMgr = (ConnectivityManager) context
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo netInfo = ConMgr.getActiveNetworkInfo();
            if (netInfo != null && netInfo.isConnected()) {

                return true;
            }
            return false;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isNullValue(String value) {
        if ( value == null|| value.equalsIgnoreCase("") || value.equalsIgnoreCase("null") ) {
            return true;
        } else {
            return false;
        }
    }

    public static void hideKeyboard(Activity activity) {
        View view = activity.findViewById(android.R.id.content);
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void showKeyboard(Activity activity) {
        View view = activity.findViewById(android.R.id.content);
        if (view != null) {
            InputMethodManager inputMethodManager =
                    (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
            inputMethodManager.toggleSoftInputFromWindow(view.getApplicationWindowToken(),
                    InputMethodManager.SHOW_FORCED, 0);
        }
    }

    public static String printKeyHash(Activity context) {
        PackageInfo packageInfo;
        String key = null;
        try {
            //getting application package name, as defined in manifest
            String packageName = context.getApplicationContext().getPackageName();
            //Retriving package info
            packageInfo = context.getPackageManager().getPackageInfo(packageName,
                    PackageManager.GET_SIGNATURES);
            Log.e("Package Name=", context.getApplicationContext().getPackageName());

            for (Signature signature : packageInfo.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                key = new String(Base64.encode(md.digest(), 0));

                // String key = new String(Base64.encodeBytes(md.digest()));
                Log.e("Key Hash=", key);
            }
        } catch (PackageManager.NameNotFoundException e1) {
            Log.e("Name not found", e1.toString());
        } catch (NoSuchAlgorithmException e) {
            Log.e("No such an algorithm", e.toString());
        } catch (Exception e) {
            Log.e("Exception", e.toString());
        }

        return key;
    }


    public static String getAddressFromLocation(Activity mActivity,LatLng latlng) {
        Geocoder geocoder;
        List<Address> addresses;
        String result = null;
        if (latlng != null) {
            try {
                geocoder = new Geocoder(mActivity, Locale.getDefault());
                addresses = geocoder.getFromLocation(latlng.latitude, latlng.longitude, 1); // Here 1 represent max location result to returned, by documents it recommended 1 to 5
                if (addresses != null && addresses.size() > 0) {
                    Address address = addresses.get(0);
                    StringBuilder sb = new StringBuilder();
                    String addressLine = address.getAddressLine(0);
                   /* for (int i = 0; i < address.getMaxAddressLineIndex(); i++) {
                        sb.append(address.getAddressLine(i)).append(",");
                    }
                    sb.append(address.getSubLocality()).append(",");
                    sb.append(address.getLocality()).append(",");
                    sb.append(address.getAdminArea()).append(",");
                    sb.append(address.getCountryName());*/
                    result = addressLine;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;

    }


    public static List<String> getTimingArray() {
        List<String> timingarray = new ArrayList<>();
        int hrs = 00;
        int min = 00;
        String value = "00:00";
        for (int j = 0; j < 48; j++) {
            if (j == 0) {
                timingarray.add(value);
            } else if (j == 1) {
                min = 30;
                hrs = 0;
                value = String.valueOf(hrs) + "0:" + String.valueOf(min);
                timingarray.add(value);
            } else {
                if (j % 2 == 0) {
                    min = 00;
                    hrs = hrs + 01;
                    if (hrs < 10) {
                        value = "0" + String.valueOf(hrs) + ":0" + String.valueOf(min);
                    } else {
                        value = String.valueOf(hrs) + ":0" + String.valueOf(min);
                    }

                    timingarray.add(value);
                } else {
                    min = 30;
                    if (hrs < 10) {
                        value = "0" + String.valueOf(hrs) + ":" + String.valueOf(min);
                    } else {
                        value = String.valueOf(hrs) + ":" + String.valueOf(min);
                    }
                    timingarray.add(value);
                }
            }
        }
        return timingarray;

    }


    public static void enableStrictMode() {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }

    public static boolean CheckIsGpsEnable(final Context context) {
        final LocationManager manager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);

        if (!manager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            AlertDialog.Builder builder3 = new AlertDialog.Builder(context);
            builder3.setMessage("Your GPS is turned off. Please enable to find stores");
            builder3.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog1, int which) {
                    dialog1.dismiss();
                    context.startActivity(new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS));
                }
            });
            builder3.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog1, int which) {
                    dialog1.dismiss();
                }
            });
            builder3.show();
            return false;
        } else {
            return true;
        }

    }

    public static String AddressFromLocation(Activity mActivity, Location mLatLng) {
        String finalAddress = "";
        Geocoder geocoder = new Geocoder(mActivity, Locale.getDefault());

        StringBuilder builder = new StringBuilder();
        try {
            List<Address> address = geocoder.getFromLocation(mLatLng.getLatitude(), mLatLng.getLongitude(), 1);
            // List<Address> address = geoCoder.getFromLocation(, 5);
            int maxLines = address.get(0).getMaxAddressLineIndex();
            for (int i = 0; i < address.size(); i++) {
                String addressStr = address.get(0).getAddressLine(i);
                if (addressStr == null) {
                } else {
                    builder.append(addressStr);
                    builder.append(" ");
                }
            }
            finalAddress = builder.toString();
        } catch (Exception e) {
            CommonFunctions.showToast(mActivity, "Unable to get your location please try again.");
        }
        return finalAddress;
    }

    public static void showToast(Context mActivity, String message) {
        Toast.makeText(mActivity, "" + message, Toast.LENGTH_LONG).show();
    }



    public static double calCulateDistance(LatLng latLng, LatLng latLng2,boolean is_miles) {
        Location loc1 = new Location("");
        loc1.setLatitude(latLng.latitude);
        loc1.setLongitude(latLng.longitude);

        Location loc2 = new Location("");
        loc2.setLatitude(latLng2.latitude);
        loc2.setLongitude(latLng2.longitude);

        DecimalFormat threeDForm = new DecimalFormat("#0.000");

        double distanceInMeters = loc1.distanceTo(loc2);
        if (is_miles) {
            distanceInMeters = distanceInMeters * 0.00062137119;
            distanceInMeters = Double.parseDouble(threeDForm.format(((distanceInMeters))));
        } else {
            distanceInMeters = distanceInMeters / 1000;
            distanceInMeters = Double.parseDouble(threeDForm.format(((distanceInMeters))));
        }
        return distanceInMeters;
    }

    public static void expand(RelativeLayout expandview) {
        //set Visible
        expandview.setVisibility(View.VISIBLE);
        final int widthSpec = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        final int heightSpec = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        expandview.measure(widthSpec, heightSpec);

        ValueAnimator mAnimator = slideAnimator(0, expandview.getMeasuredHeight(), expandview);
        mAnimator.setDuration(500);
        mAnimator.start();

    }

    public static void collapse(final RelativeLayout expandview) {
        int finalHeight = expandview.getHeight();

        ValueAnimator mAnimator = slideAnimator(finalHeight, 0, expandview);
        mAnimator.setDuration(500);

        mAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                //Height=0, but it set visibility to GONE
                expandview.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }

        });
        mAnimator.start();
    }

    private static ValueAnimator slideAnimator(int start, int end, final RelativeLayout expandview) {

        ValueAnimator animator = ValueAnimator.ofInt(start, end);

        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                //Update Height
                int value = (Integer) valueAnimator.getAnimatedValue();
                ViewGroup.LayoutParams layoutParams = expandview.getLayoutParams();
                layoutParams.height = value;
                expandview.setLayoutParams(layoutParams);
            }
        });
        return animator;
    }

    public static LatLng getLocationFromAddress(String strAddress, Activity activity) {

        Geocoder coder = new Geocoder(activity);
        List<Address> address;
        Barcode.GeoPoint p1 = null;
        LatLng latLng = null;

        try {
            address = coder.getFromLocationName(strAddress, 5);
            if (address == null || address.size()==0) {
               latLng = null;
            } else {
                Address location = address.get(0);
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                latLng = new LatLng(latitude, longitude);
            }

            return latLng;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return latLng;
    }


    public static Date convertDateFromString(String dateString) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = df.parse(dateString);
        return date1;
    }



    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            // pre-condition
            return;
        }

        int totalHeight = 0;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
        listView.requestLayout();
    }

    public static String GetPackageName(Context context) {
        PackageInfo packageInfo = null;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return packageInfo.packageName;
    }



    public static int getNumberOfDayBetweenTwoDates(String date1) {
        String dateBeforeString = null;
        DateFormat readFormat = new SimpleDateFormat( "MMMM dd, yyyy, hh:mm aaa");
        DateFormat writeFormat = new SimpleDateFormat( "yyyy-MM-dd");
        Date date = null;
        try {
            date = readFormat.parse(date1);
        } catch ( ParseException e ) {
            e.printStackTrace();
        }
        if( date != null ) {
            dateBeforeString = writeFormat.format( date );
        }
        String currentDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        //Parsing the date
        org.joda.time.LocalDate dateBefore =  org.joda.time.LocalDate.parse(dateBeforeString);
        org.joda.time.LocalDate dateAfter =  org.joda.time.LocalDate.parse(currentDate);
        int days = Days.daysBetween(dateBefore, dateAfter).getDays();
        return days;
    }

    public static String get30DaysBeforeDate() {
        Calendar cal = GregorianCalendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DAY_OF_YEAR, -30);
        Date BeforeDate = cal.getTime();
        String currentDate = new SimpleDateFormat("yyyy-MM-dd").format(BeforeDate);
        return currentDate;
    }

    public static String getCuurentDate() {
        Calendar cal = GregorianCalendar.getInstance();
        cal.setTime(new Date());
        Date BeforeDate = cal.getTime();
        String currentDate = new SimpleDateFormat("yyyy-MM-dd").format(BeforeDate);
        return currentDate;
    }


    public static boolean isValidDate(String start_date, String end_date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = null;
        date1 = sdf.parse(start_date);
        Date date2 = sdf.parse(end_date);

        if (date1.compareTo(date2) > 0) {
            return false;
        } else if (date1.compareTo(date2) < 0) {
            return true;
        } else if (date1.compareTo(date2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void showDatePicker(Activity mActivity, final TextView dateTextView) {
        final Calendar c = Calendar.getInstance();
        DatePickerDialog dpd = new DatePickerDialog(mActivity,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        int finalMonth = Integer.parseInt(String.valueOf(monthOfYear))+1;
                        dateTextView.setText(year + "-" + String.valueOf(finalMonth) + "-" + dayOfMonth);
                    }
                }, c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DATE));
        dpd.show();
    }


    public static String getCommaSeparateString(String value) {
        String commaSeparateString = "";
        if(commaSeparateString.equalsIgnoreCase("")) {
            commaSeparateString = value;
        } else {
            commaSeparateString = commaSeparateString +","+value;
        }
        return commaSeparateString;
    }

    public static String getDateFormate(String created_time_formatted) {
        String formatedDate = null;
        DateFormat readFormat = new SimpleDateFormat( "MMM dd, yyyy, hh:mm aaa");
        Date date = null;
        try {
            date = readFormat.parse(created_time_formatted);
            formatedDate  = readFormat.format(date);
        } catch ( ParseException e ) {
            e.printStackTrace();
        }
       return formatedDate;
    }
}
