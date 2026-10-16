/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatapp;
import java.util.Scanner;

/**
 *
 * @author mogal
 */
public class Chatapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner yolz = new Scanner(System.in);
        Message5 mess = new Message5();
        
        
        // TODO code application logic here
        

        // Registration information
        System.out.println("REGISTRATION");

        System.out.println("Enter your name: ");
        String firstName = yolz.nextLine();

        System.out.println("Enter your surname: ");
        String lastName = yolz.nextLine();

        System.out.println("Enter your username: ");
        String username = yolz.nextLine();

        System.out.println("Enter your password: ");
        String password = yolz.nextLine();

        System.out.println("Enter your cellphone number: ");
        String cellPhone = yolz.nextLine();

        // Creating the users information
        Registration1ogin user = new Registration1ogin(
                username,
                password,
                cellPhone,
                firstName,
                lastName
        );

        // Check registration
        System.out.println();
        System.out.println(user.registerUser());

        // Login information to be entered
        System.out.println();
        System.out.println("LOGIN");

        System.out.print("Enter your username: ");
        String loginUsername = yolz.nextLine();

        System.out.print("Enter your password: ");
        String loginPassword = yolz.nextLine();

        // Checking the login details
        boolean loginStatus = user.loginUser(
                loginUsername,
                loginPassword
        );

        // Display of thelogin result
        System.out.println();
        System.out.println(user.returnLoginStatus(loginStatus));
    
        mess.displayInfo();
    
}
}

    
    

