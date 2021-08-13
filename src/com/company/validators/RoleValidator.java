package com.company.validators;

import com.company.Roles;

import java.util.HashMap;
import java.util.Map;

public class RoleValidator implements Validator<String> {
    @Override
    public boolean isValid(String role) {
        HashMap<String, Integer> roles = Roles.getRoles();
        for (Map.Entry<String, Integer> entry : roles.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(role)) {
                return true;
            }
        }
        return false;
    }

    public boolean isAcceptableRole(String role, int level) {
        for (Map.Entry<String, Integer> entry : Roles.getRoles().entrySet()) {
            if (entry.getValue() == level && entry.getKey().equalsIgnoreCase(role)) {
                return true;
            }
        }
        return false;
    }
}
