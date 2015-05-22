package com.comred.tween;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.MimeTypeMap;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.File;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 * Created by HTaha on 3/23/2015.
 * contains several utils.
 */
public class Utility {

    public static Context context;
    public static Activity activity;
    public static String appName;

    /**
     * constructor
     *
     * @param appName            name of the project
     * @param applicationContext the context
     * @param activity           your activity
     */
    public Utility(String appName, Context applicationContext, Activity activity) {
        context = applicationContext;
        Utility.activity = activity;
        Utility.appName = appName;
    }

    /**
     * print a message in the debug
     *
     * @param msg
     */
    public static void log(String msg) {
        Log.d("[" + appName + "]", msg);
    }


    /**
     * print a message in the debug
     *
     * @param msg
     */
    public static void sysout(String msg) {
        System.out.println(appName + " --> " + msg);
    }


    /**
     * convert Object to json string
     *
     * @param o Object to convert
     * @return
     */
    public static String toJSon(Object o) {
        Gson json = new Gson();
        String s = json.toJson(o);
        return s;
    }

    /**
     * get the mime type of the file
     *
     * @param url = file path or whatever suitable URL you want
     * @return
     */
    public static String getMimeType(String url) {
        String type = null;
        String extension = getExtension(url);
        if (extension != null) {
            MimeTypeMap mime = MimeTypeMap.getSingleton();
            type = mime.getMimeTypeFromExtension(extension);
        }
        return type;
    }

    /**
     * get the extension of the file
     *
     * @param url = file path or whatever suitable URL you want
     * @return
     */
    public static String getExtension(String url) {
        String extension = MimeTypeMap.getFileExtensionFromUrl(url);
        return extension;
    }

    /**
     * get the name of the file
     *
     * @param url = file path or whatever suitable URL you want
     * @return
     */
    public static String getFileName(String url) {
        File f = new File(url);
        return f.getName();
    }


    /**
     * format a number to 00,00,00.00
     *
     * @param t number
     * @return
     */
    public static String NumberFormater(Double t) {
        NumberFormat formatter = new DecimalFormat("###,###,###.##");
        return formatter.format(t);
    }

    /**
     * hide the title bar of the activity
     *
     * @param A activity to hide the title bar.
     */
    public static void hideTiTleBar(Activity A) {
        A.requestWindowFeature(Window.FEATURE_NO_TITLE);
        A.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }


    /**
     * hide keyboard
     *
     * @param A activity to hide the title bar.
     */
    public static void hidekeyboardv2(Activity A) {
        A.getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    /**
     * hide keyboard
     *
     * @param activity A activity to hide the keyboard.
     * @param view     view of the activity
     */
    public static void hideKeyboard(Context activity, View view) {

        InputMethodManager in = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        in.hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
    }


    /**
     * show keyboard
     *
     * @param activity activity
     * @param view     view to show keyboard for
     */
    public static void showKeyboard(Context activity, View view) {

        InputMethodManager in = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        in.showSoftInput(view, 0);
    }

    /**
     * @param activity activity to hide the keybord
     */
    public static void hideSoftKeyboard(Activity activity) {

        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
    }

    /**
     * show toast message
     *
     * @param activity activity to show toast for
     * @param msg      the message to show
     */
    public static void showtoast(Context activity, String msg) {

        Toast.makeText(activity.getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }

    /**
     * get screen height and width
     *
     * @param context context
     * @return a json object {width: 1234, height: 2432}
     */
    public static JsonObject getScreenWH(Context context) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        int width = metrics.widthPixels;
        int height = metrics.heightPixels;
        JsonObject json = new JsonObject();
        json.addProperty("width", width);
        json.addProperty("height", height);
        return json;
    }

    /**
     * round a number
     *
     * @param value
     * @param places
     * @return rounded number
     */
    public static double round(double value, int places) {
        if (places < 0)
            return 0.0;

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }


    /**
     * get today date in your format
     *
     * @param format of the date you want to get
     * @return String of the date in the format given
     */
    public static String getToday(String format) {
        SimpleDateFormat dfDate = new SimpleDateFormat(format);
        String data = "";
        Calendar c = Calendar.getInstance();
        data = dfDate.format(c.getTime());
        return data;
    }

}
