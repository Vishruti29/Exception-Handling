package com.Exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserRegistrationTest {
        @Test
        void givenValidFirstName_whenValidate_thenSuccess() {
            String firstName = "Garv";
            Assertions.assertDoesNotThrow(() -> UserRegistration.validateFirstName(firstName));
        }
        @Test
        void givenInvalidFirstName_whenValidate_thenThrowsException() {
            String firstName = "g";
            Assertions.assertThrows(InvalidFirstNameException.class, () -> UserRegistration.validateFirstName(firstName));
        }
        @Test
        void givenValidLastName_whenValidate_thenSuccess() {
            String lastName = "Patel";
            Assertions.assertDoesNotThrow(() -> UserRegistration.validateLastName(lastName));
        }
        @Test
        void givenInvalidLastName_whenValidate_thenThrowsException() {
            String lastName = "p";
            Assertions.assertThrows(InvalidLastNameException.class, () -> UserRegistration.validateLastName(lastName));
        }
        @Test
        void givenValidEmail_whenValidate_thenSuccess() {
            String email = "vishrutipatil.29@gmail.com";
            Assertions.assertDoesNotThrow(() -> UserRegistration.validateEmail(email));
        }
        @Test
        void givenInvalidEmail_whenValidate_thenThrowsException() {
            String email = "john.doe.gmail.com";
            Assertions.assertThrows(InvalidEmailException.class, () -> UserRegistration.validateEmail(email));
        }
        @Test
        void givenValidMobileNumber_whenValidate_thenSuccess() {
            String mobileNumber = "91 1234567890";
            Assertions.assertDoesNotThrow(() -> UserRegistration.validateMobileNumber(mobileNumber));
        }
        @Test
        void givenInvalidMobileNumber_whenValidate_thenThrowsException() {
            String mobileNumber = "123456789";
            Assertions.assertThrows(InvalidMobileNumberException.class, () -> UserRegistration.validateMobileNumber(mobileNumber));
        }
        @Test
        void givenValidPassword_whenValidate_thenSuccess() {
            String password = "Password@123";
            Assertions.assertDoesNotThrow(() -> UserRegistration.validatePassword(password));
        }
        @Test
        void givenInvalidPassword_whenValidate_thenThrowsException() {
            String password = "password";
            Assertions.assertThrows(InvalidPasswordException.class, () -> UserRegistration.validatePassword(password));
        }
}