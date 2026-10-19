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
              sendMessage(); 
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
        System.out.print(" Enter number of messages you want to send");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int messageID = no.nextInt();
        }
        System.out.print(" Enter the recipient number");
        String number = scan.nextLine();
        if (number.startsWith("+27") && number.length() == 12) {
            System.out.println("Correct format");

            System.out.println("Write a message");
        }
            String message = scan.nextLine();
            if (message.length() < 250) {
                System.out.println("Send a message.");
             }
            else {
            System.out.println("Press 0 to delete the message.");
            } 
            else if {
            System.out.println("Message successfully stored.");
            }
    }

    public class Methodfunctionality {
        

    }

    public boolean checkMessage(String message) {
        System.out.println("It has to be 10 characters");
        
        if(message.length() == 10){
         System.out.println("Message length is entered correctly. ");
         return true;       
        }
        else{
            System.out.println("Message length is enetred inccorectly ,please try again.");
        return false;
        }
    }

    public boolean checkRecipientCell(String recipients) {
           String number = scan.nextLine();
        if (number.startsWith("+27") && number.length() == 12) {
            System.out.println("Correct format");
            return true;
        }
            else {
            System.out.println("Inncorrect format"); 
        return false;
    }
    }

    public boolean sentMessage(String message) {
        System.out.println("Choose: 1.Send  2.Store  3.Discard ");
        String choice = scan.nextLine().trim();
        
        switch(choice){
            case "1":  returnTotalMessage++;
            System.out.println("Message sent succssfully.");
            return true;
            case "2": StoreMessage(message);
            System.out.println("Message stored succefully.");
            return true;
            case "3": 
             System.out.println("Message discarded.");
             return false;
            default: 
              System.out.println("Invalid choice");
                return false;
        }
    }
    
    public boolean createMessageHash(int message, int messageNumber, String message){
        String [] words = message.trim.split("\\s+");
        String firstWord = words.length>0? words[0]:"";
        String lastWord = words.length >0? words[words.length -1]:"";
          boolean messageHash = (messageID.substring(0,2)+":"+ messageNumber +":" +firstWord +lastWord).toUpperCase();
       return messageHash;     
        }
    

    public boolean printMessage() {
        System.out.println("Write a message");
        String message = scan.nextLine();
        if (message.length() <250){
            System.out.println("Message sent");
            return true;
        }
        else{
           System.out.println("Enter a message with less than 250 characters");
                   return false;
        }
    }

    public int returnTotalMesssages(int num) {
        System.out.println("Add all the messages sent");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++)
        return num ;
          return n;
        }
    }


