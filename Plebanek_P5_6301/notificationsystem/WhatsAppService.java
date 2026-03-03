
package notificationsystem;

/**
 * The WhatsAppService allows the user to send a notification via WhatsApp. The 
 * class implements the interface NotificationMedium to send the message in the 
 * notification.
 * 
 * @author Natalie Plebanek
 * @version 1.0.0
 * @since Week 5 of CSC 6301
 */

public class WhatsAppService implements NotificationMedium {

    /**
     * Sends the message via "WhatsApp" via using the interface NotificationMedium's 
     * send method.
     * 
     * @param message string; message to be sent to the user receiving a WhatsApp notification.
     */

    @Override
    public void send(String message) {

        System.out.println("[WhatsApp] Sending message:  " + message);

    }

}