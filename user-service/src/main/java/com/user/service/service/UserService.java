package com.user.service.service;


import com.user.service.entity.User;
import com.user.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
     private UserRepository userRepository;

   public List<User> getAll() {

       return userRepository.findAll();
   }

   public User getUserById(Integer id) {
       return userRepository.findById(id).orElse(null);
   }
   public User saveUser(User user) {
       return userRepository.save(user);
   }
}
