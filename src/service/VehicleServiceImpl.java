package service;

import entity.Driver;
import entity.User;
import entity.Vehicle;
import exception.VehicleNotFoundException;
import repository.UserRepository;
import repository.VehicleRepository;

import java.util.List;

public class VehicleServiceImpl implements VehicleService {
    private VehicleRepository vehicleRepository;
    private UserRepository userRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository, UserRepository userRepository) {
        this.vehicleRepository = vehicleRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Vehicle registerVehicle(Vehicle vehicle) {
        Vehicle savedVehicle = vehicleRepository.save(vehicle);
        Driver driver = savedVehicle.getOwner();
        List<Vehicle> vehicles = driver.getVehicles();
        vehicles.add(savedVehicle);
        userRepository.save(driver);
        return savedVehicle;
    }

    @Override
    public Vehicle getVehicle(int vehicleId) throws VehicleNotFoundException {
        Vehicle vehicle = vehicleRepository.findById(vehicleId);
        if(vehicle == null)
            throw new VehicleNotFoundException("Vehicle is not found for id: " + vehicleId);

        return vehicle;
    }
}
