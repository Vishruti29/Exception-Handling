package com.Exception;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
class InvalidFirstNameException extends Exception {
        public InvalidFirstNameException(String message) {
            super(message);
        }
    }

    class InvalidLastNameException extends Exception {
        public InvalidLastNameException(String message) {
            super(message);
        }
    }

    class InvalidEmailException extends Exception {
        public InvalidEmailException(String message) {
            super(message);
        }
    }

    class InvalidMobileNumberException extends Exception {
        public InvalidMobileNumberException(String message) {
            super(message);
        }
    }

    class InvalidPasswordException extends Exception {
        public InvalidPasswordException(String message) {
            super(message);
        }
    }

    public class UserRegistration {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Validate first name
            System.out.print("Enter your first name: ");
            String firstName = scanner.nextLine();

            try {
                validateFirstName(firstName);
                System.out.println("Valid first name");
            } catch (InvalidFirstNameException e) {
                System.out.println(e.getMessage());
            }

            // Validate last name
            System.out.print("Enter your last name: ");
            String lastName = scanner.nextLine();

            try {
                validateLastName(lastName);
                System.out.println("Valid last name");
            } catch (InvalidLastNameException e) {
                System.out.println(e.getMessage());
            }

            // Validate email address
            System.out.print("Enter your email address: ");
            String email = scanner.nextLine();

            try {
                validateEmail(email);
                System.out.println("Valid email address");
            } catch (InvalidEmailException e) {
                System.out.println(e.getMessage());
            }

            // Validate mobile number
            System.out.print("Enter your mobile number: ");
            String mobileNumber = scanner.nextLine();

            try {
                validateMobileNumber(mobileNumber);
                System.out.println("Valid mobile number");
            } catch (InvalidMobileNumberException e) {
                System.out.println(e.getMessage());
            }

            // Validate password
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            try {
                validatePassword(password);
                System.out.println("Valid password");
            } catch (InvalidPasswordException e) {
                System.out.println(e.getMessage());
            }
        }

        public static void validateFirstName(String firstName) throws InvalidFirstNameException {
            Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
            Matcher matcher = pattern.matcher(firstName);
            if (!matcher.matches()) {
                throw new InvalidFirstNameException("Invalid first name");
            }
        }

        public static void validateLastName(String lastName) throws InvalidLastNameException {
            Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
            Matcher matcher = pattern.matcher(lastName);
            if (!matcher.matches()) {
                throw new InvalidLastNameException("Invalid last name");
            }
        }

        public static void validateEmail(String email) throws InvalidEmailException {
            Pattern pattern = Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+.[a-z]{2,}$");
            Matcher matcher = pattern.matcher(email);
            if (!matcher.matches()) {
                throw new InvalidEmailException("Invalid email address");
            }
        }

        public static void validateMobileNumber(String mobileNumber) throws InvalidMobileNumberException {
            Pattern pattern = Pattern.compile("^[0-9]{2} [0-9]{10}$");
            Matcher matcher = pattern.matcher(mobileNumber);
            if (!matcher.matches()) {
                throw new InvalidMobileNumberException("Invalid mobile number");
            }
        }

        public static void validatePassword(String password) throws InvalidPasswordException {
            Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$");
            Matcher matcher = pattern.matcher(password);

            if (!matcher.matches()) {
                throw new InvalidPasswordException("Invalid Password");
            }
        }


    }
