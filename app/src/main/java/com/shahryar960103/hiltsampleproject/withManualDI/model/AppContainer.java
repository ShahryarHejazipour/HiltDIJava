package com.shahryar960103.hiltsampleproject.withManualDI.model;

import com.shahryar960103.hiltsampleproject.withManualDI.model.model.LoginService;
import com.shahryar960103.hiltsampleproject.withManualDI.model.model.UserLocalDataSource;
import com.shahryar960103.hiltsampleproject.withManualDI.model.model.UserRemoteDataSource;
import com.shahryar960103.hiltsampleproject.withManualDI.model.model.UserRepository;

import retrofit2.Retrofit;

public class AppContainer {

    private Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://example.com")
            .build();

    private UserRemoteDataSource remoteDataSource = new UserRemoteDataSource(retrofit);
    private UserLocalDataSource localDataSource = new UserLocalDataSource();

    public UserRepository userRepository = new UserRepository(localDataSource, remoteDataSource);





}
