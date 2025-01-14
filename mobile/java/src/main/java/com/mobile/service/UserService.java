package com.mobile.service;

import com.mobile.entity.UserModel;
import com.mobile.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void insertUser(UserModel user){
         userRepository.save(user);
    }
    public List<UserModel> getAllUsers(){
        return  userRepository.findAll();
    }

    public void deleteUser(UserModel userModel){
         userRepository.delete(userModel);
    }

    public void updateUser(UserModel userModel){
        userRepository.save(userModel);
    }
}
