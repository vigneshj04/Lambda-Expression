package com.Lambda;

import java.util.regex.Pattern;

@FunctionalInterface
interface UserInterface {
    boolean validate(String str) throws CustomException;
}

public class UserDetails {
    public static void main(String[] args) throws CustomException {
        UserInterface validateFirstName = (firstName) -> {
            if (firstName.isEmpty()) {
                throw new CustomException("Invalid input");
            }
            Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
            return pattern.matcher(firstName).matches();
        };
        System.out.println(validateFirstName.validate("Rajesh"));

        UserInterface validateLastName = (lastName) -> {
            if (lastName.isEmpty()) {
                throw new CustomException("Invalid input");
            }
            Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
            return pattern.matcher(lastName).matches();
        };
        System.out.println(validateLastName.validate("Kumar"));

        UserInterface validateEmail = (email) -> {
            if (email.isEmpty()) {
                throw new CustomException("Invalid input");
            }
            Pattern pattern = Pattern.compile("^[a-zA-Z]+[.][A-Za-z]+@[a-zA-Z]+[.]+[a-zA-Z]{2}+[.][A-Za-z]{2}+$");
            return pattern.matcher(email).matches();
        };
        System.out.println(validateEmail.validate("Abc.123@gmail.com"));
    }
}