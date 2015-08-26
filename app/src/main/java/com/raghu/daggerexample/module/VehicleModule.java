package com.raghu.daggerexample.module;

import com.raghu.daggerexample.model.Motor;
import com.raghu.daggerexample.model.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by raghunandanangara on 4/08/2015.
 */

@Module

public class VehicleModule {

    @Provides @Singleton
    Motor provideMotor(){
        return new Motor();
    }

    @Provides @Singleton
    Vehicle provideVehicle(){
        return new Vehicle(new Motor());
    }
}
