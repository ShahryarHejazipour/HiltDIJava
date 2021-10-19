package com.shahryar960103.hiltsampleproject.hiltDI.modules;

import com.shahryar960103.hiltsampleproject.hiltDI.ExampleActivity;
import com.shahryar960103.hiltsampleproject.hiltDI.exampleClasses.ExampleInterface;
import com.shahryar960103.hiltsampleproject.hiltDI.exampleClasses.ExampleInterfaceImpl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public abstract class InterFaceModule {

    @Binds
    public abstract ExampleInterface bindExampleInterFace(ExampleInterfaceImpl exampleInterface);


}
