package com.yashtongaonkar.assistancebot.api;

import android.content.Context;

import retrofit2.Retrofit;

/**
 * Created by yash on 21/8/17.
 */

public class ApiClient {

    private ApiService apiService;
    private Retrofit retrofit;
    private Context context;

    public ApiClient(Context context) {
        this.context = context;
    }
}
