package com.shahryar960103.hiltsampleproject.withManualDI.model.model;

import retrofit2.Retrofit;

public class UserRemoteDataSource {

    private final Retrofit retrofit;

    public UserRemoteDataSource(Retrofit retrofit) {
        this.retrofit = retrofit;
    }
}
