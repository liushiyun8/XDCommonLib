package com.emp.xdcommon.common.utils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {

    private Toast toast;
    private static Context mContext;

    public static void init(Context context){
        mContext=context;
    }

    public static void shortTips(String tip) {
        Toast.makeText(mContext, tip, Toast.LENGTH_SHORT).show();
    }

    public static void longTips(String tip) {
        Toast.makeText(mContext, tip, Toast.LENGTH_LONG).show();
    }

    public void moreShortTips(String tip) {
        if(toast==null){
            toast = Toast.makeText(mContext, tip, Toast.LENGTH_SHORT);
            toast.show();
        }else {
            toast.setText(tip);
            toast.show();
        }

    }
}
