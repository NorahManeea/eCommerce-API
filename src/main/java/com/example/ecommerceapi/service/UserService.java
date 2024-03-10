package com.example.ecommerceapi.service;

import com.example.ecommerceapi.entity.User;
import com.example.ecommerceapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;



    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public Optional<User> deleteUserById(Long Id) {
        Optional<User> deletedUser = userRepository.findById(Id);
        if (deletedUser.isPresent()) {
            userRepository.deleteById(Id);
        }
        return deletedUser;
    }

    public User updateUser(Long id, User updatedAuthor) {
        Optional<User> existingUserOptional = userRepository.findById(id);
        if (existingUserOptional.isPresent()) {
            User existingUser = existingUserOptional.get();
            existingUser.setFirstName(updatedAuthor.getFirstName());
            existingUser.setLastName(updatedAuthor.getLastName());

            return userRepository.save(existingUser);
        }
        return null;
    }

}
