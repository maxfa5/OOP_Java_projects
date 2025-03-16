package OOP.transport;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Truck implements Vehicle {
    private String name;
    private int yearOfCreate;
    private double fuelConsumption;
    private double maxSpeed;
    private int countDoors;
    private double sizeOfWheels;

    public Truck(String name, int yearOfCreate, double maxSpeed, double fuelConsumption, int countDoors, double expenses, double sizeOfWheels) {
        this.name = name;
        this.yearOfCreate = yearOfCreate;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.countDoors = countDoors;
        this.sizeOfWheels = sizeOfWheels;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getYearOfCreate() {
        return yearOfCreate;
    }

    @Override
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public double getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int getCountDoors() {
        return countDoors;
    }


    @Override
    public String getInfo() {
        return String.format("Truck Info: Name=%s, Year=%d, Toplivo=%s, Max Speed=%.2f, Doors=%d, Wheel Size=%.2f",
                name, yearOfCreate, fuelConsumption, maxSpeed, countDoors, sizeOfWheels);
    }

    public double getSizeOfWheels() {
        return sizeOfWheels;
    }
}