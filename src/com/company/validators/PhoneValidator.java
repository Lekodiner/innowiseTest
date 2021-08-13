package com.company.validators;

public class PhoneValidator implements Validator<String> {
    @Override
    public boolean isValid(String phone) {
        return phone.replaceAll("\\s+", "").matches("375\\d{5,}");
    }
}
