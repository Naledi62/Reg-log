/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mogal
 */
public class Message5 {
      static Scanner scan = new Scanner(System.in);

    public void displayInfo() {
        int option;
        do {

            System.out.println("Welcome to QuickChat");
            System.out.println("Option 1" + "Send Messages");
            System.out.println("Option 2" + "Coming Soon");
            System.out.println("Option 3" + "Quit");
            option = scan.nextInt();

            if (option == 1) {

            } else if (option == 2) {
                System.out.println("Coming soon.");
            } else if (option == 3) {
                System.out.println("Thank You for using QuickChat");
                break;
            } else {
                System.out.println("Invalid options chosen!");
            }

        } while (option != 3);

    }
    // FOR LOOP

    public static void sendMessage() {
        Random no = new Random();
        System.out.print(" enter number of messages you want to send");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int messageID = no.nextInt();
        }
        System.out.print(" enter the recipient number");
        String number = scan.nextLine();
        if (number.startsWith("+27") && number.length() == 12) {
            System.out.println("correct format");

            System.out.println("Write a message");
            String message = scan.nextLine();
            if (message.length() < 250) {

            } else {

            }
        } else {
            System.out.println("Incorrect");
            System.out.println();
        }
    }

    public class Methodfunctionality {

    }

    public boolean checkMessage() {
        return false;
    }

    public boolean checkRecipientCell(String recipients) {
        return false;
    }

    public boolean sentMessage(String message) {
        return false;
    }

    public boolean printMessage() {
        return false;
    }

    public int returnTotalMesssages(int num) {
        return num;
    }
}


