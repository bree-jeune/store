package com.store.service;

import com.store.controller.model.Registration;
import com.store.model.Users;
import com.store.model.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public Users registerUser(Registration registration) {
        Users user = new Users();
        user.setUsername(registration.getUsername());
        user.setEmail(registration.getEmail());
        user.setFirstName(registration.getFirstName());
        user.setLastName(registration.getLastName());
        user.setPassword(registration.getPassword()); //TODO: Encrypt password
        return userDAO.save(user);
    }
}
