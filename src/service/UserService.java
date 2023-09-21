package service;

import entity.Driver;
import entity.User;
import exception.UserNotFoundException;

public interface UserService {
    public User registerUser(User user);
    public User getUser(int userId) throws UserNotFoundException;
    public Driver getDriver(int driverId) throws UserNotFoundException;
}
