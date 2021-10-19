package com.shahryar960103.hiltsampleproject.withoutManualDI.model;

import retrofit2.Retrofit;

public class UserRemoteDataSource {

    private final Retrofit retrofit;

    public UserRemoteDataSource(Retrofit retrofit) {
        this.retrofit = retrofit;
    }
}
