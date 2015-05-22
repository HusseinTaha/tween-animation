package com.comred.tween;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by HTaha on 3/23/2015.
 * manage the preferences easily
 */
public class SharedPrefs {

    public static SharedPreferences instance;
    public static int NULLINT = -794613258;

    /**
     * constructor
     *
     * @param ctx context of the application
     */
    public SharedPrefs(Context ctx) {
        if (instance == null)
            instance = ctx.getSharedPreferences("Agenda", Context.MODE_PRIVATE);
    }

    /**
     * get the shared instance of the class
     *
     * @return SharedPreferences
     */
    public static SharedPreferences getInstance() {
        return instance;
    }

    /**
     * save a string in the shared pref
     *
     * @param key key of the pref
     * @param val value of the pref
     */
    public static void saveString(String key, String val) {
        SharedPreferences.Editor editor = instance.edit();
        editor.putString(key, val);
        editor.apply();
    }

    /**
     * save an integer in the shared pref
     *
     * @param key key of the pref
     * @param val value of the pref
     */
    public static void saveInt(String key, int val) {
        SharedPreferences.Editor editor = instance.edit();
        editor.putInt(key, val);
        editor.apply();
    }

    /**
     * save a boolean in the shared pref
     *
     * @param key key of the pref
     * @param val value of the pref
     */
    public static void saveBoolean(String key, Boolean val) {
        SharedPreferences.Editor editor = instance.edit();
        editor.putBoolean(key, val);
        editor.apply();
    }

    /**
     * save a float in the shared pref
     *
     * @param key key of the pref
     * @param val value of the pref
     */
    public static void saveFloat(String key, float val) {
        SharedPreferences.Editor editor = instance.edit();
        editor.putFloat(key, val);
        editor.apply();
    }

    /**
     * save an object in the shared pref
     * this method will check for the type of the object and save it to its type.
     *
     * @param key key of the pref
     * @param val value of the pref
     */
    public static void save(String key, Object val) {
        if (val instanceof String)
            saveString(key, String.valueOf(val));
        else if (val instanceof Boolean)
            saveBoolean(key, Boolean.valueOf(val.toString()));
        else if (val instanceof Integer)
            saveInt(key, Integer.parseInt(val.toString()));
        else if (val instanceof Double || val instanceof Float)
            saveFloat(key, Float.parseFloat(val.toString()));
    }


    /**
     * get the shared pref for this key
     *
     * @param key
     * @return null or the value of the key
     */
    public static String loadString(String key) {
        return instance.getString(key, null);
    }

    /**
     * get the shared pref for this key
     *
     * @param key
     * @return NULLINT or the value of the key
     */
    public static int loadInt(String key) {
        return instance.getInt(key, NULLINT);
    }

    /**
     * get the shared pref for this key
     *
     * @param key
     * @return false or the value of the key
     */
    public static Boolean loadBoolean(String key) {
        return instance.getBoolean(key, false);
    }

    /**
     * get the shared pref for this key
     *
     * @param key
     * @return -0.0f or the value of the key
     */
    public static float loadFloat(String key) {
        return instance.getFloat(key, -0.0f);
    }

}
