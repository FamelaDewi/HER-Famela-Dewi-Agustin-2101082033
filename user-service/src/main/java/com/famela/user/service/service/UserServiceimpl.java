/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famela.user.service.service;

import com.famela.user.service.dto.User;
import com.famela.user.service.repository.UserRepository;
import com.famela.user.service.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    
    @Override
    public List<User> getAllUsers(){
        return userRepository.getAllUsers();
    }
    
    @Override
    public User getUser(String id){
        return userRepository.getUser(id);
    }
    
    @Override
    public void addUser(User user){
        userRepository.addUser(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.updateUser(user);
    }

    @Override
    public User deleteUser(String id) {
       return userRepository.deleteUser(id);
    }
}