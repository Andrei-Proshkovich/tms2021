package com.tms.model;

public class Car {
    private String model;
    private int speed;
    private CarType carType;
    private final Engine engine;
    private TankFuel tankFuel;

    public Car(String model, CarType carType, Engine engine, TankFuel tankFuel) {
        this.model = model;
        this.carType = carType;
        this.engine = engine;
        this.tankFuel = tankFuel;
    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public TankFuel getTankFuel() {
        return tankFuel;
    }

    public void setTankFuel(TankFuel tankFuel) {
        this.tankFuel = tankFuel;
    }


    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}

