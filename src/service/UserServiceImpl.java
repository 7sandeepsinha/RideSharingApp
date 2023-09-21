package service;

import entity.Driver;
import entity.User;
import exception.UserNotFoundException;
import repository.UserRepository;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(int userId) throws UserNotFoundException {
        User user = userRepository.findById(userId);
        if(user == null)
            throw new UserNotFoundException("User is not found for id: " + user);

        return user;
    }

    @Override
    public Driver getDriver(int driverId) throws UserNotFoundException {
        User user = userRepository.findById(driverId);
        Driver driver = new Driver();

    }
}
