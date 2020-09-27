package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
//从服务器获得数据
public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);  //用enqueue()方法能自动开启子线程
    }
}
