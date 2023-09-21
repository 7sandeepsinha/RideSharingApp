import controller.UserController;
import controller.VehicleController;
import dto.UserRegistrationDTO;
import dto.VehicleRegistrationDto;
import entity.User;
import entity.UserType;
import entity.Vehicle;
import entity.VehicleType;
import exception.InvalidUserDetailsException;
import exception.UserNotFoundException;
import exception.VehicleNotFoundException;
import repository.UserRepository;
import repository.VehicleRepository;

public class Main {
    public static void main(String[] args) throws InvalidUserDetailsException, UserNotFoundException, VehicleNotFoundException {
        UserRepository userRepository = new UserRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        UserController userController = new UserController(userRepository);
        VehicleController vehicleController = new VehicleController(vehicleRepository, userRepository);

        UserRegistrationDTO userRegistrationDTO = new UserRegistrationDTO(
                "Bhakti",
                "1234",
                22,
                'F',
                UserType.DRIVER
        );

        userController.registerUser(userRegistrationDTO);
        User savedUser = userController.getUser(1);
        System.out.println(savedUser);

        VehicleRegistrationDto vehicleRegistrationDto = new VehicleRegistrationDto(
                "BMW X5",
                "KA01-1234",
                VehicleType.SUV,
                "Blue",
                1);

        vehicleController.registerVehicle(vehicleRegistrationDto);
        Vehicle savedVehicle = vehicleController.getVehicle(1);
        System.out.println(savedVehicle);
    }
}