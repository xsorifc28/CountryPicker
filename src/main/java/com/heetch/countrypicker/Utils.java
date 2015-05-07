package com.heetch.countrypicker;

import android.content.Context;

/**
 * Created by GODARD Tuatini on 07/05/15.
 */
public class Utils {

    public static int getMipmapResId(Context context, String drawableName) {
        return context.getResources().getIdentifier(drawableName, "mipmap", context.getPackageName());
    }
}