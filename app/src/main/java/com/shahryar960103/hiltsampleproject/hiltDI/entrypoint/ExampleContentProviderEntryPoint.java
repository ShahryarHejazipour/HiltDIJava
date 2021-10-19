package com.shahryar960103.hiltsampleproject.hiltDI.entrypoint;

import com.shahryar960103.hiltsampleproject.hiltDI.exampleClasses.AnalyticsService;

import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@EntryPoint
@InstallIn(SingletonComponent.class)
public interface ExampleContentProviderEntryPoint {

    public AnalyticsService analyticsService();


}
