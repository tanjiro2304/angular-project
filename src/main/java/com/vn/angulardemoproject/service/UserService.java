package com.vn.angulardemoproject.service;

import com.vn.angulardemoproject.models.Users;
import com.vn.angulardemoproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<Users> getUsers(){
        return userRepository.findAll();
    }

    public Users saveUser(Users users){
        return userRepository.save(users);
    }
}
