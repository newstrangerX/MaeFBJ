package com.mae.maeftj;

import android.content.Context;
import android.widget.Toast;

public class printer {
    static Context c;

    public printer(Context c) {
        this.c = c;
    }
    public static void pr(String s){
        Toast.makeText(c, s, Toast.LENGTH_SHORT).show();
    }
}
