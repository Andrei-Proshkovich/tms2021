package com.tms.service;

import com.tms.model.Car;
import com.tms.model.CarType;
import com.tms.model.Engine;
import com.tms.model.TankFuel;

import java.util.Random;

public class CarServiceImpl extends Car implements CarService {
    private TankFuel tankFuel;

    @Override
    public void startCar() {
        Random random = new Random();
        int twenty = random.nextInt(20);
        if (twenty % 2 == 0) {
            new CarIsNotReadyException();
        } else {
            System.out.println("Start Car!!!");
        }
    }

    @Override
    public void carMove() {
        System.out.println("Car move!");

    }

    public CarServiceImpl(String model, CarType type, Engine engine, TankFuel tankFuel) {
        super(model, type, engine, tankFuel);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public Engine getEngine() {
        return super.getEngine();
    }

    @Override
    public TankFuel getTankFuel() {
        return super.getTankFuel();
    }

    @Override
    public void setTankFuel(TankFuel tankFuel) {
        super.setTankFuel(tankFuel);
    }


}
