package com.company.validators;

public interface Validator<T> {
    boolean isValid(T value);
}
