package com.example.a20201211finalhomework.util;

import android.content.Context;
import android.view.Menu;
import android.view.ViewConfiguration;
import android.view.Window;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MenuUtil {
    public static void forceShowOverflowMenu(Context context) {
        try {
            ViewConfiguration config = ViewConfiguration.get(context);
            Field menuKeyField = ViewConfiguration.class.
                    getDeclaredField("sHasPermanentMenuKey");
            if (menuKeyField != null) {
                menuKeyField.setAccessible(true);
                menuKeyField.setBoolean(config, false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 显示OverflowMenu的Icon
    public static void setOverflowIconVisible(int featureId, Menu menu) {
        // ActionBar的featureId是8，Toolbar的featureId是108
        if (featureId % 100 == Window.FEATURE_ACTION_BAR && menu != null) {
            if (menu.getClass().getSimpleName().equals("MenuBuilder")) {
                try {
                    Method m = menu.getClass().getDeclaredMethod(
                            "setOptionalIconsVisible", Boolean.TYPE);
                    m.setAccessible(true);
                    m.invoke(menu, true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
