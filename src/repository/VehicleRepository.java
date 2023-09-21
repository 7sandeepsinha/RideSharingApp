package repository;

import entity.Vehicle;

import java.util.HashMap;

public class VehicleRepository {
    private HashMap<Integer, Vehicle> vehicleHashMap;
    private static int idCounter = 0;

    public VehicleRepository() {
        this.vehicleHashMap = new HashMap<>();
    }

    public Vehicle findById(int vehicleId){
        return vehicleHashMap.get(vehicleId);
    }

    public Vehicle save(Vehicle vehicle){
        if(vehicle.getId() == 0){
            vehicle.setId(++idCounter);
        }
        return vehicleHashMap.put(vehicle.getId(), vehicle);
    }
}
