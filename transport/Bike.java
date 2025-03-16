package OOP.transport;



public class Bike implements Vehicle {
    private String name;
    private int yearOfCreate;
    private double fuelConsumption;
    private double maxSpeed;
    private int countDoors;
    private double sizeOfWheels;

    public Bike(String name, int yearOfCreate, double maxSpeed, double expenses, double sizeOfWheels) {
        this.name = name;
        this.yearOfCreate = yearOfCreate;
        this.fuelConsumption = 0;
        this.maxSpeed = maxSpeed;
        this.countDoors = 0;
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
        return String.format("Bike Info: Name=%s, Year=%d, Toplivo=%s, Max Speed=%.2f, Doors=%d, Wheel Size=%.2f",
                name, yearOfCreate, fuelConsumption, maxSpeed, countDoors, sizeOfWheels);
    }

    public double getSizeOfWheels() {
        return sizeOfWheels;
    }
}