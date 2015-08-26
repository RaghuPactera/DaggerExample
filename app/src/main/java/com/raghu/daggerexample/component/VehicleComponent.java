package com.raghu.daggerexample.component;

import com.raghu.daggerexample.model.Vehicle;
import com.raghu.daggerexample.module.VehicleModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by raghunandanangara on 4/08/2015.
 */

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    Vehicle provideVehicle();
}
