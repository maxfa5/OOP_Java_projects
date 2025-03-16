package OOP.transport;

public class Car implements Vehicle {
    private String name;
    private int yearOfCreate;
    private double fuelConsumption;
    private double maxSpeed;
    private int countDoors;


    public Car(String name, int yearOfCreate, double fuelConsumption, double maxSpeed, int countDoors, double expenses, double sizeOfWheels) {
        this.name = name;
        this.yearOfCreate = yearOfCreate;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.countDoors = countDoors;
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
    public double getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int getCountDoors() {
        return countDoors;
    }


    @Override
    public String getInfo() {
        return String.format("Car Info: Name=%s, Year=%d, Toplivo=%s, Max Speed=%.2f, Doors=%d",
                name, yearOfCreate, fuelConsumption, maxSpeed, countDoors);
    }

    @Override
    public double getFuelConsumption() {
        return fuelConsumption;

    }


}