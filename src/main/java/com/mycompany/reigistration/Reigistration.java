/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reigistration;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Reigistration {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Login auth = new Login();

        // Displaying your Student ID and Name as requested
        System.out.println("ST10494950"); 
        
        System.out.print("Enter Username: "); // Changed "Ronaldo:" to "Enter Username:" for clarity
        String user = sc.nextLine();
        
        System.out.print("Enter Password: ");
        String pass = sc.nextLine();
        
        System.out.print("Enter Cell Phone (e.g., +27...): ");
        String cell = sc.nextLine();

        // FIX: Added the method name 'registerUser' here
        String regMessage = auth.registerUser(user, pass, cell); 
        System.out.println("\n" + regMessage);

        // 2. Only proceed to Login if registration was successful
        if (regMessage.equals("Username and Password successfully captured.")) {
            System.out.println("\n--- USER LOGIN ---");
            System.out.print("Enter Username: ");
            String loginUser = sc.nextLine();
            
            System.out.print("Enter Password: ");
            String loginPass = sc.nextLine();

            boolean loginSuccess = auth.loginUser(loginUser, loginPass);
            System.out.println(auth.returnLoginStatus(loginSuccess));
        }
    }
}
