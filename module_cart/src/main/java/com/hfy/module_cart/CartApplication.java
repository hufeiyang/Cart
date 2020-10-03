package com.hfy.module_cart;

import android.content.Context;
import android.util.Log;

import com.hm.iou.lifecycle.annotation.AppLifecycle;
import com.hm.lifecycle.api.IApplicationLifecycleCallbacks;

/**
 * 组件的AppLifecycle
 * 1、@AppLifecycle
 * 2、实现IApplicationLifecycleCallbacks
 * @author hufeiyang
 */
@AppLifecycle
public class CartApplication implements IApplicationLifecycleCallbacks {

    public  Context context;

    /**
      * 用于设置优先级，即多个组件onCreate方法调用的优先顺序
      * @return
     */
    @Override
    public int getPriority() {
        return NORM_PRIORITY;
    }

    @Override
    public void onCreate(Context context) {
        //可在此处做初始化任务，相当于Application的onCreate方法
        this.context = context;

        Log.i("CartApplication", "onCreate");
    }

    @Override
    public void onTerminate() {

    }

    @Override
    public void onLowMemory() {

    }

    @Override
    public void onTrimMemory(int level) {

    }
}
