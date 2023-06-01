package com.example.thermometerdemo;

import android.content.Context;
import android.util.TypedValue;

public class Utils {

    public static int convertDpToPixel(int dp, Context context) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
    }

}
