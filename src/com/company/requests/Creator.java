package com.company.requests;

import com.company.User;
import com.company.UserReader;
import com.company.UserRepository;

import java.io.BufferedReader;

public class Creator implements Request {
    @Override
    public void fulfillRequest(BufferedReader reader) {
        createUser(reader);
    }

    public void createUser(BufferedReader reader) {
        System.out.println("Creating new user.");
        UserReader userReader = new UserReader();
        User user = userReader.readUserFromConsole(reader);
        UserRepository userRepository = new UserRepository();
        userRepository.addUser(user);
    }
}
