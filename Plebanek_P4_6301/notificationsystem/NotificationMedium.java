package notificationsystem;

/** 
 * Interface NotificationMedium --> represents the ability for the program to send 
 * notifications under different communication methods, but this interface allows
 * for the basic understanding that a message will be sent.
 * 
 * @author Natalie Plebanek
 * @version 1.0.0
 * @since Week 4 of CSC 6301
 */

public interface NotificationMedium {

    /**
     * Sends the desired message via whatever medium is selected to notify the 
     * user receiving the message. 
     * 
     * @param message string; message/information that will be sent. 
     */
    
    void send(String message);

}
