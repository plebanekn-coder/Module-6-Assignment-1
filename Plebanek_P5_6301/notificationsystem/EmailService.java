package notificationsystem;

/**
 * EmailService class is used to send a notification to a user via "email." The 
 * class implements the interface NotificationMedium to send the message in the 
 * notification.
 * 
 * @author Natalie Plebanek
 * @version 1.0.0
 * @since Week 4 of CSC 6301
 */

public class EmailService implements NotificationMedium {

    /**
     * Sends the message via "email," via using the interface NotificationMedium's 
     * send method.
     * 
     * @param message string; message to be sent to the user receiving an email notification.
     */

    @Override
    public void send(String message) {

        System.out.println("Email(s) Delivered: " + message);

    }

}
