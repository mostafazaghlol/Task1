package com.mostafazaghloul.task1.utils;

import android.app.Activity;
import android.view.WindowManager;

public class screenwithoutAction {
    public static void FullScreen(Activity mContext){
        mContext.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
