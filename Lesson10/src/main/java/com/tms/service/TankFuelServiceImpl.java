package com.tms.service;

public class TankFuelServiceImpl implements TankFuelService {
    private int fuel;

    public TankFuelServiceImpl(int fuel) {
        this.fuel = fuel;
    }

    public TankFuelServiceImpl() {

    }

    public int getFuel() {
        if (fuel > 0) {
            return fuel;
        } else {
            System.out.println("В бензобаке нет топлива");
        }
        return fuel;
    }


    @Override
    public int refuel() {


        return fuel + getFuel();
    }
}
