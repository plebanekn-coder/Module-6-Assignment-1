package notificationsystem;

import java.util.Scanner;

/**
 * Main class to test project's interface and classes to make sure they function
 * properly. This program is executable using CLI (directions below this paragraph).
 * This program will demonstrate the functionality of the AlertSystem and allow
 * users to interface between notification methods (either through email, SMS, or WhatsApp service)
 * and, thusly, send messages.
 * 
 * CLI EXECUTABLE INSTRUCTIONS: on the command prompt, (1) Navigate to the Project folder (what should be inside
 * is just the notificationsystem folder with the program files inside it), (2) Enter 
 * javac notificationsystem/ *.java (there should be no space between the / and *), (3)
 * then enter: java notificationsystem.Main
 * 
 * JAVADOC CHANGES & INSTRUCTIONS: The only changes I made to the Javadocs were
 * in my WhatsAppService file, Main file, and AlertSystem file. I had to add Javadocs
 * to the WhatsAppService file to ensure proper documentation of the newly added file
 * for my future self or future developers to look back upon. As for the Main and AlertSystem files,
 * I had to modify the Javadocs only slightly because I had specifically written out in them
 * what services used to send messages are supported currently by the AlertSystem and the same goes
 * for the main. For instructions on how to produce the Javadocs: (1) navigate to the project folder
 * (where the only thing inside is the program folder notificationsystem), (2) enter javadoc -d docs
 * notificationsystem/ *.java (just no space between the / and *).
 * 
 * GENAI DOCUMENTATION: The prompt I used to guide me for this assignment was done
 * by feeding ChatGPT my previous code for the assignment and copy and pasting
 * the instructions given in the assignment, specifically Part 1: Implementation 
 * and steps 1, 2, and 3. Since I had already incorporated composition into my code
 * as a part of the previous assignment, there was not much changes that needed to be done.
 * Because of this strong foundation, the addition of the WhatsAppService file was easy 
 * to implement. GenAI outputted the code seen currently in the WhatsAppService file and 
 * suggested for me to make changes to my Main file which can be seen below with the 
 * addition of another case for the user to choose that is used to test the 
 * WhatsAppService file. To avoid a rewrite and ensure that the existing interface
 * and the GenAI output would be the same, I fed all of my current code for the notificationsystem
 * project and with having fed it the assignment requirements, I was able to test
 * and ensure the outputs matched.
 * 
 * @author Natalie Plebanek
 * @version 2.0.0
 * @since Week 4 of CSC 6301
 */


public class Main {

/**
 * Main method utilizing "public static void main" per CLI execution requirements.
 * Allows user to test notification system program :D .
 * 
 * @param args default parameter for a main - not used.
 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AlertSystem alertSystem = new AlertSystem();

        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to the Flexible Notification System");
            System.out.println("Menu - Select Notification Medium: ");
            System.out.println("1. Email ");
            System.out.println("2. SMS ");
            System.out.println("3. WhatsApp ");
            System.out.println("4. Send Message(s)");
            System.out.println("5. View Messages Sent ");
            System.out.println("6. Exit Notification System");
            System.out.println("Input Number of Your Selection: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    alertSystem.setMedium(new EmailService());
                    System.out.println("Email service selected.");
                    break;

                case 2:

                    alertSystem.setMedium(new SMSService());
                    System.out.println("SMS service selected.");
                    break;

                case 3:

                    alertSystem.setMedium(new WhatsAppService());
                    System.out.println("WhatsApp service selected.");
                    break;

                case 4:

                    System.out.print("Enter message: ");
                    String message = scanner.nextLine();
                    alertSystem.notifyUser(message);
                    break;

                case 5:

                    alertSystem.printLog();
                    break;

                case 6:

                    running = false;
                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        }

        scanner.close();

    }
}