package notificationsystem;

/**
 * SMSService class is used to send a notification to a user via "SMS." The 
 * class implements the interface NotificationMedium to send the message in the 
 * notification.
 * 
 * @author Natalie Plebanek
 * @version 1.0.0
 * @since Week 4 of CSC 6301
 */

public class SMSService implements NotificationMedium {

    /**
     * Sends the message via "SMS," via using the interface NotificationMedium's 
     * send method.
     * 
     * @param message string; message to be sent to the user receiving a SMS notification.
     */

    @Override
    public void send(String message) {

        System.out.println("SMS(s) Delivered: " + message);

    }

}