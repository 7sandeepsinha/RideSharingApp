package controller;

import dto.UserRegistrationDTO;
import entity.Driver;
import entity.Passenger;
import entity.User;
import entity.UserType;
import exception.InvalidUserDetailsException;
import exception.UserNotFoundException;
import repository.UserRepository;
import service.UserService;
import service.UserServiceImpl;
import utils.RideSharingUtils;

public class UserController {
    private UserService userService;

    public UserController(UserRepository userRepository) {
        this.userService = new UserServiceImpl(userRepository);
    }

    public User registerUser(UserRegistrationDTO userRegistrationDTO) throws InvalidUserDetailsException {
        validateUserRegistration(userRegistrationDTO);
        User user;
        if(userRegistrationDTO.getUserType().equals(UserType.DRIVER)){
            user = new Driver();
        } else {
            user = new Passenger();
        }
        user.setName(userRegistrationDTO.getName());
        user.setPhoneNumber(userRegistrationDTO.getPhoneNumber());
        user.setGender(userRegistrationDTO.getGender());
        user.setAge(userRegistrationDTO.getAge());
        return userService.registerUser(user);
    }

    public User getUser(int userId) throws UserNotFoundException {
        return userService.getUser(userId);
    }


    private void validateUserRegistration(UserRegistrationDTO userRegistrationDTO) throws InvalidUserDetailsException {
        if(RideSharingUtils.isEmptyOrNull(userRegistrationDTO.getName()) ||
            RideSharingUtils.isEmptyOrNull(userRegistrationDTO.getPhoneNumber()) ){
            throw new InvalidUserDetailsException("Missing Details");
        }

        if(userRegistrationDTO.getAge() < 18)
            throw new InvalidUserDetailsException("Invalid age");
    }

}
