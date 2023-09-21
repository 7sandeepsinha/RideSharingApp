package repository;

import entity.User;

import java.util.HashMap;

public class UserRepository {
    private HashMap<Integer, User> userHashMap;
    private static int idCounter = 0;

    public UserRepository() {
        this.userHashMap = new HashMap<>();
    }

    public User findById(int userId){
        return userHashMap.get(userId);
    }

    public User save(User user){
        if(user.getId() == 0){
            user.setId(++idCounter);
        }
        return userHashMap.put(user.getId(), user);
    }
}
