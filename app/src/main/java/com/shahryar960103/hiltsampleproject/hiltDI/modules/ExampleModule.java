package com.shahryar960103.hiltsampleproject.hiltDI.modules;

import com.shahryar960103.hiltsampleproject.hiltDI.ExampleActivity;
import com.shahryar960103.hiltsampleproject.hiltDI.qualifiers.EmptyRetrofit;
import com.shahryar960103.hiltsampleproject.hiltDI.qualifiers.FirstRetrofit;
import com.shahryar960103.hiltsampleproject.hiltDI.qualifiers.NthRetrofit;
import com.shahryar960103.hiltsampleproject.hiltDI.qualifiers.SecondRetrofit;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
@InstallIn(ExampleActivity.class)
public class ExampleModule {

    @EmptyRetrofit
    @Provides
    public static Retrofit provideRetrofit(){
        return new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @FirstRetrofit
    @Provides
    public static Retrofit provideFirstRetrofit(){
        return new  Retrofit.Builder().baseUrl("FirstURL")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @SecondRetrofit
    @Provides
    public static Retrofit provideSecondRetrofit(){
        return new Retrofit.Builder().baseUrl("SecondURL")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @NthRetrofit
    @Provides
    public static Retrofit provideNthRetrofit(){
        return new Retrofit.Builder().baseUrl("NthURL")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
