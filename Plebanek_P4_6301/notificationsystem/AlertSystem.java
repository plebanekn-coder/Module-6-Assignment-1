package notificationsystem;

import java.util.ArrayList;

/**
 * AlertSystem class acts as a container and is what manages the flexibile notification system's deliveries
 * via composition. This class allows for swapping between types of notification
 * services using the class's method setMedium to swap between email and SMS service. The class
 * has another method of notifyUser that calls the send method of the respective
 * service that is currently active.
 * 
 * @author Natalie Plebanek
 * @version 1.0.0
 * @since Week 4 of CSC 6301
 */

public class AlertSystem {

    private NotificationMedium medium;
    private ArrayList<String> messageLog;

    /**
     * The method AlertSystem constructs an AlertSystem instance and initializes 
     * the message log to hold the actions of the user. 
     */

    public AlertSystem() {
        messageLog = new ArrayList<>();
    }

    /**
     * Declares the notification medium as called upon to switch or declare
     * which notification medium is in use, whether that is the email service or 
     * SMS service medium.
     * 
     * @param medium the name of the notification medium that is to be declared, i.e.
     * calling upon the SMS or Email Service to be the medium where messages travel through.
     */

    public void setMedium(NotificationMedium medium) {
        this.medium = medium;
    }

    /**
     * The notifyUser method sends the message that the user wishes to send and 
     * utilizes the specified current medium's method for sending said message. It 
     * also records the sent message in the message log.
     * 
     * @param message string; message that user would like to send.
     * @return if the user has not selected one of the specified notification mediums,
     * then the method will exit the method by calling upon a return (which in practice
     * would look like returning the user to the menu options to pick again).
     */

    public void notifyUser(String message) {
        if (medium == null) {
            System.out.println("No notification medium selected.");
            return;
        }

        medium.send(message);
        messageLog.add(message);
    }

    /**
     * The method printLog prints/displays to the user all of the messages
     * sent while actively using the program for that session.
     */

    public void printLog() {
        System.out.println("\nNotification Log: ");
        for (String msg : messageLog) {
            System.out.println(msg);
        }
    }

}