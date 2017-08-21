package com.yashtongaonkar.assistancebot.api;

/**
 * Created by yash on 21/8/17.
 */

public interface ApiCallback<T> {

    void onSuccess(T response);

    void onFailure(String error);
}
