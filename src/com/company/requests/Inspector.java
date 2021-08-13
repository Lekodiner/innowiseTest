package com.company.requests;

import com.company.ConsoleReader;
import com.company.User;
import com.company.UserRepository;

import java.io.BufferedReader;
import java.util.Map;

public class Inspector implements Request {
    @Override
    public void fulfillRequest(BufferedReader reader) {
        System.out.println("Type \"1\" to show exact user or \"2\" to show all of them.");
        RequestRecognizer requestRecognizer = new RequestRecognizer();
        int request = requestRecognizer.recognizeNumberOfRequest(reader, 2);
        if (request == 1) {
            showUser(reader);
        } else {
            showAllUsers();
        }
    }

    public void showUser(BufferedReader reader) {
        UserRepository userRepository = new UserRepository();
        ConsoleReader consoleReader = new ConsoleReader();
        System.out.println("Type the number of the user.");
        int number = consoleReader.readUserNumber(reader);
        userRepository.getUsers().get(number).printUser();
    }

    public void showAllUsers() {
        UserRepository userRepository = new UserRepository();
        Map<Integer, User> users = userRepository.getUsers();
        for (Map.Entry<Integer, User> entry : users.entrySet()) {
            System.out.println("User number " + entry.getKey() + ":");
            entry.getValue().printUser();
            System.out.println("\n===========================\n");
        }
    }
}
