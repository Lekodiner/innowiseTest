package com.company;

import java.util.HashMap;

public enum Roles {
    USER(1),
    CUSTOMER(1),
    ADMIN(2),
    PROVIDER(2),
    SUPER_ADMIN(3);

    private final int roleLevel;

    Roles(int roleLevel) {
        this.roleLevel = roleLevel;
    }

    public static HashMap<String, Integer> getRoles() {
        HashMap<String, Integer> roles = new HashMap<>();
        Roles[] rolesArray = Roles.values();
        for (Roles role : rolesArray) {
            roles.put(role.toString(), role.roleLevel);
        }
        return roles;
    }

    public static void printRoles() {
        Roles[] rolesArray = Roles.values();
        for (Roles role:rolesArray) {
            System.out.println(role.toString() + ", access level " + role.roleLevel);
        }
    }
}
