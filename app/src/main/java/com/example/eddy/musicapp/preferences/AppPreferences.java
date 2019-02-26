package com.example.eddy.musicapp.preferences;

import android.content.Context;
import android.content.SharedPreferences;

public final class AppPreferences {
    private static final String PREF_NAME = "AppPreferences";
    private static final String GENRES = "quited";

    private AppPreferences() {

    }

    public static void saveState(Context context, String quit) {
        getSharedPreferences(context)
                .edit()
                .putString(GENRES, quit)
                .apply();
    }

    public static String getState(Context context){
        return getSharedPreferences(context)
                .getString(GENRES, null);
    }

    private static SharedPreferences getSharedPreferences(Context context) {
        return context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }
}
