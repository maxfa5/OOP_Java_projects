package OOP.transport;

import java.util.ArrayList;
import java.util.List;

 public class TransportationCompany {
    private String name;
    private List<Vehicle> vehicles;

    public TransportationCompany(String name, int initialCapacity) {
        this.name = name;
        this.vehicles = new ArrayList<>(initialCapacity);
    }

    public void appendVehicle(Vehicle newVehicle) {
        vehicles.add(newVehicle);
    }

    public String getName() {
        return name;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
    
    public Vehicle getVehicle(int index) {
        Vehicle res = null;
        if (index >= 0 && index < vehicles.size()) {
            res = vehicles.get(index);
        }else{
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for vehicles list of size " + vehicles.size());
        }
        return res;
    }

    public int getVehicleCount() {
        return vehicles.size();
    }

    public void removeVehicle(int index){
        if (index > 0 && index < vehicles.size()) {
            vehicles.remove(index);
        }
   
    }
}

