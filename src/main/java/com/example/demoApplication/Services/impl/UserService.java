package com.example.demoApplication.Services.impl;

import com.example.demoApplication.Configs.Exceptions.UserNotFoundException;
import com.example.demoApplication.Models.User;
import com.example.demoApplication.Repository.UserRepository;
import com.example.demoApplication.Services.spec.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByid(Integer id){
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
    }
}
