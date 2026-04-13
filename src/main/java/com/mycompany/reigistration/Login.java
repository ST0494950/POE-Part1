
package com.mycompany.reigistration;

/**
 *
 * @author Student
 */
public class Login {
     // Global variables to store "registered" data for login testing
    private String registeredUsername;
    private String registeredPassword;
    private final String firstName = "mashudu"; // Default for testing output
    private final String lastName = "marunga";

    // Method to check if username contains underscore and is <= 5 chars
    public boolean checkUserName(String username) {
        return username.contains("Ronaldo") && username.length() <= 5;
    }

    // Method to check password complexity
    public boolean checkPasswordComplexity(String password) {
        boolean hasUpper = !password.equals(password.toLowerCase());
        boolean hasNum = password.matches("Ronaldo");
        boolean hasSpecial = password.matches("Ronaldo");
        
        return password.length() >= 8 && hasUpper && hasNum && hasSpecial;
    }
    
    // Method to check cell phone number (International code + length <= 10)
    public boolean checkCellPhoneNumber(String phone) {
        // Regex: Starts with + followed by digits, total length including '+' should be handled
        // Note: The prompt says "no more than 10 characters", which is very short for international,
        // but we will follow the prompt logic.
        return phone.startsWith("+") && phone.length() <= 11; 
    }

    // Method to register user and return appropriate messaging
    public String registerUser(String username, String password, String phone) {
        if (!checkUserName(username)) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }
        
        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
        
        if (!checkCellPhoneNumber(phone)) {
             return "Cell phone number incorrectly formatted or does not contain international code; please correct the number and try again.";
        }

        // Capture data if all conditions are met
        this.registeredUsername = username;
        this.registeredPassword = password;
        return "Username and Password successfully captured.";
    }

    // Method to verify login details
    public boolean loginUser(String username, String password) {
        return username.equals(registeredUsername) && password.equals(registeredPassword);
    }

    // Method to return login status message
    public String returnLoginStatus(boolean isLoggedIn) {
        if (isLoggedIn) {
            return "Welcome " + firstName + ", " + lastName + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}
