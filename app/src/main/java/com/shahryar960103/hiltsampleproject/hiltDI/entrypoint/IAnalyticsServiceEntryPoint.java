package com.shahryar960103.hiltsampleproject.hiltDI.entrypoint;

import com.shahryar960103.hiltsampleproject.hiltDI.exampleClasses.AnalyticsService;

import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@EntryPoint
@InstallIn(ActivityComponent.class)
public interface IAnalyticsServiceEntryPoint {


   public AnalyticsService ANALYTICS_SERVICE();


}
