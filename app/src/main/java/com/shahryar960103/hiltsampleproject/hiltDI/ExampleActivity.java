package com.shahryar960103.hiltsampleproject.hiltDI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.shahryar960103.hiltsampleproject.R;
import com.shahryar960103.hiltsampleproject.hiltDI.exampleClasses.AnalyticsAdapter;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;
import retrofit2.Retrofit;

@AndroidEntryPoint
public class ExampleActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
    }
}