package com.company.validators;

public class EmailValidator implements Validator<String> {
    @Override
    public boolean isValid(String email) {
        return email != null && email.matches("\\b\\w+@\\w+\\.\\w+\\b");
    }
}
