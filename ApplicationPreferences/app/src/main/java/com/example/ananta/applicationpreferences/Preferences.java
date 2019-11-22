package com.example.ananta.applicationpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by bayup on 22-Nov-19.
 */

public class Preferences {
    //Deklarasi key-value berupa String
    static final String KEY_USER_REGISTERED="user", KEY_PASS_REGISTERED="pass";
    static final String KEY_USERNAME_LOGGED="Username_logged_in";
    static final String KEY_STATUS_LOGGED="Status_logged_in";
    //Deklarasi Shared Preferences dengan parameter context
    private static SharedPreferences getSharedPreferences(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context);
    }
    //Deklarasi Edit Preferences dan mengubah KEY_USER_REGISTERED
    public static void setRegisteredUser(Context context, String username){
        SharedPreferences.Editor editor=getSharedPreferences(context).edit();
        editor.putString(KEY_USER_REGISTERED, username);
        editor.apply();
    }
    //Mendapatkan nilai dari KEY_USER_REGISTERED berupa String
    public static String getRegisteredUser(Context context){
        return getSharedPreferences(context).getString(KEY_USER_REGISTERED,"");
    }
    //Deklarasi Edit Preferences dan mengubah KEY_PASS_REGISTERED
    public static void setRegisteredPass(Context context, String password){
        SharedPreferences.Editor editor=getSharedPreferences(context).edit();
        editor.putString(KEY_PASS_REGISTERED, password);
        editor.apply();
    }
    //Mendapatkan nilai dari KEY_PASS_REGISTERED berupa String
    public static String getRegisteredPass(Context context){
        return getSharedPreferences(context).getString(KEY_PASS_REGISTERED,"");
    }
    //Deklarasi Edit Preferences dan mengubah KEY_USERNAME_LOGGED
    public static void setLoggedInUser(Context context, String username){
        SharedPreferences.Editor editor=getSharedPreferences(context).edit();
        editor.putString(KEY_USERNAME_LOGGED, username);
        editor.apply();
    }
    //Mendapatkan nilai dari KEY_USERNAME_LOGGED berupa String
    public static String getLoggedInUser(Context context){
        return getSharedPreferences(context).getString(KEY_USERNAME_LOGGED,"");
    }
    //Deklarasi Edit Preferences dan mengubah KEY_STATUS_LOGGED
    public static void setLoggedInStatus(Context context, boolean status){
        SharedPreferences.Editor editor=getSharedPreferences(context).edit();
        editor.putBoolean(KEY_STATUS_LOGGED, status);
        editor.apply();
    }
    //Mendapatkan nilai dari KEY_STATUS_LOGGED berupa boolean
    public static boolean getLoggedInStatus(Context context){
        return getSharedPreferences(context).getBoolean(KEY_STATUS_LOGGED,false);
    }
    /*Deklarasi Edit Preferences dan menghapus data, sehingga bernilai default.
    Khusus untuk data yang memiliki key KEY_USERNAME_LOGGED dan KEY_STATUS_LOGGED */
    public static void clearLoggedInUser(Context context){
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.remove(KEY_USERNAME_LOGGED);
        editor.remove(KEY_STATUS_LOGGED);
        editor.apply();
    }
}
