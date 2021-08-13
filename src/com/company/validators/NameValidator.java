package com.company.validators;

public class NameValidator implements Validator<String> {
    @Override
    public boolean isValid(String name) {
        return name != null && name.matches("\\w+");
    }
}
