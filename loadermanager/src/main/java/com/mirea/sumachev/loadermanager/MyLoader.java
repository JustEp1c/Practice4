package com.mirea.sumachev.loadermanager;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;

import androidx.annotation.NonNull;
import androidx.loader.content.AsyncTaskLoader;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MyLoader extends AsyncTaskLoader {

    private String userStr;
    public static final String ARG_WORD = "word";

    public MyLoader(@NonNull Context context, Bundle args) {
        super(context);
        if (args != null)
            userStr = args.getString(ARG_WORD);
    }
    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }
    @Override
    public String loadInBackground() {
        List<String> symbols = Arrays.asList(userStr.split(""));
        Collections.shuffle(symbols);
        String output = "";
        for (String symbol : symbols) {
            output += symbol;
        }
        SystemClock.sleep(5000);
        return output;
    }
}
