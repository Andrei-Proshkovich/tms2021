package com.tms.service;

import com.tms.model.Car;
import com.tms.model.Engine;

public class EngineServiceImpl implements EngineService {

    private Car car;

    public EngineServiceImpl(Car car) {
        this.car = car;
    }


    @Override
    public void start() {
        Engine engine = car.getEngine();

    }

    @Override
    public void stop() {

    }
}
