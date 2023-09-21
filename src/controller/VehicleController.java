package controller;

import dto.VehicleRegistrationDto;
import entity.Vehicle;
import exception.UserNotFoundException;
import exception.VehicleNotFoundException;
import repository.UserRepository;
import repository.VehicleRepository;
import service.UserService;
import service.UserServiceImpl;
import service.VehicleService;
import service.VehicleServiceImpl;

public class VehicleController {
    private VehicleService vehicleService;
    private UserService userService;

    public VehicleController(VehicleRepository vehicleRepository, UserRepository userRepository) {
        this.vehicleService = new VehicleServiceImpl(vehicleRepository, userRepository);
        this.userService = new UserServiceImpl(userRepository);
    }

    public Vehicle registerVehicle(VehicleRegistrationDto vehicleRegistrationDto) throws UserNotFoundException {
        Vehicle vehicle = new Vehicle();
        vehicle.setName(vehicleRegistrationDto.getName());
        vehicle.setColor(vehicleRegistrationDto.getColor());
        vehicle.setNumber(vehicleRegistrationDto.getNumber());
        vehicle.setType(vehicleRegistrationDto.getType());
        vehicle.setOwner(userService.getUser(vehicleRegistrationDto.getOwnerId()));
        return vehicleService.registerVehicle(vehicle);
    }

    public Vehicle getVehicle(int vehicleId) throws VehicleNotFoundException {
        return vehicleService.getVehicle(vehicleId);
    }
}

//