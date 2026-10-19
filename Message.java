/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions*;
/**
 *
 * @author mogal
 */
public class Message {

    private Message(String string, int i, String string0, String hi_Vuyo_can_we_go_to_lunch_sometime) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Message() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Test 
    public void testCheckMessageID(){
        Message message = new Message (
        "1234567890", 0,
        "+276785460148",
        "Hi Vuyo, can we go to lunch sometime?"
        );
      assertTrue
        (message.checkMessageID()
      );          
    }
    
    @Test 
    public void testCheckRecipientCellCorrect(){
        Message message = new Message(
        "1234567890", 0,
        "+276785460148",
        "Hello"
        );
        assertEquals(
                "Cell phone number succesffuly captured.",
                message.checkRecipientCell()
        );
    }
    
    @Test
    public void testCheckRecipientCellIncorrect(){
        Message message = new Message(
         "1234567890", 0,
        "+276785460148",
        "Hello"
        );
        assertEquals(
              "Cell phone number is incorrectly formated or doesnt have country code.Please try again.",
              message.checkRecipientCell()
        );
    }
    
    @Test
    public void testCreateMessageHash(){
         Message message = new Message(
          "1234567890", 0,
        "+276785460148",
        "Hi Vuyo, can we go to lunch sometime?"
         );
         assertEquals(
         "00:0:HITONIGHT",
               message.createMessageHash()
         );
    }
    
    @Test
    public void testCheckMessageLength(){
        Message message = new Message(
         "1234567890", 0,
        "+276785460148",
        "Hi Vuyo."    
        );
        assertEquals(
        "Message is ready to be sent.",
        message.checkMessageLength()
           );
    }
    
    @Test 
    public void testSendMessage(){
        Message message = new Message(
        "1234567890", 0,
        "+276785460148",
        "Hello"  
        );
        assertEquals(
        "Message succesfully sent.",
        message.SendMessage(1)
            );
    }
    
    @Test
    public void testDisregardMessage(){
         Message message = new Message(
        "1234567890", 0,
        "+276785460148",
        "Hello"  
        );
         assertEquals(
           "Press 0 to delete the message.",
                 message.SendMessage(2)
         );
    }
    
    @Test
    public void testStoreMessage(){
         Message message = new Message(
        "1234567890", 0,
        "+276785460148",
        "Hello"  
        );
       message.createMessageHash();
       assetEquals(
        "Message succefully stored.",
           message.StoreMessage()
       );
    }

    private void SendMessage(int n) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
