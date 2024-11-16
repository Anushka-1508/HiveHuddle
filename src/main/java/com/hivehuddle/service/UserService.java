package com.hivehuddle.service;


import com.hivehuddle.model.User;
import com.hivehuddle.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public User addUser(User user){
        return userRepository.save(user);
    }

    public User retrieveUser(User user){
        return userRepository.findById(user.getId()).get();
    }

}
