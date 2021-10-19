package com.shahryar960103.hiltsampleproject.hiltDI.exampleClasses;

import android.app.Activity;
import android.content.Context;

import com.shahryar960103.hiltsampleproject.MainActivity;
import com.shahryar960103.hiltsampleproject.hiltDI.ExampleActivity;
import com.shahryar960103.hiltsampleproject.hiltDI.entrypoint.IAnalyticsServiceEntryPoint;
import com.shahryar960103.hiltsampleproject.hiltDI.myApp.MyApplication;

import javax.inject.Inject;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.qualifiers.ActivityContext;


public class AnalyticsAdapter {



    IAnalyticsServiceEntryPoint iAnalyticsServiceEntryPoint= EntryPointAccessors.fromActivity((Activity) MyApplication.getAppContext(),IAnalyticsServiceEntryPoint.class);
    AnalyticsService service = iAnalyticsServiceEntryPoint.ANALYTICS_SERVICE();






}
