package com.kennytian.tink;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class TinkModule extends ReactContextBaseJavaModule {
    public TinkModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "Tink";
    }

    @ReactMethod
    public void setAppkeyAndChannelId(String key,String channelId) {
        Log.i("setAppkeyAndChannelId", key);
    }

    @ReactMethod
    public void beginLogPageView(String pageName) {
        Log.i("beginLogPageView", pageName);
    }

    @ReactMethod
    public void endLogPageView(String pageName) {
        Log.i("endLogPageView", pageName);
    }
}
