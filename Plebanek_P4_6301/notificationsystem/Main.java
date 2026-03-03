package notificationsystem;

import java.util.Scanner;

/**
 * Main class to test project's interface and classes to make sure they function
 * properly. This program is executable using CLI (directions below this paragraph).
 * This program will demonstrate the functionality of the AlertSystem and allow
 * users to interface between notification methods (either through email or SMS service)
 * and, thusly, send messages.
 * 
 * CLI EXECUTABLE INSTRUCTIONS: on the command prompt, (1) Navigate to the Project folder (what should be inside
 * is just the notificationsystem folder with the program files inside it), (2) Enter 
 * javac notificationsystem/ *.java (there should be no space between the / and *), (3)
 * then enter: java notificationsystem.Main
 * 
 * JAVADOC INSTRUCTIONS: (1) navigate to the project folder (where the only thing inside is
 * the program folder notificationsystem), (2) enter javadoc -d docs notificationsystem/ *.java (just no space 
 * between the / and *).
 * 
 * GENAI DOCUMENTATION: My first implementation on utilizing AI for this project
 * was to ask the program how to structure my folders for this assignment. I 
 * started running into issues because my program only has the notificationsystem
 * folder and not a larger umbrella folder holding that file. Thus, GENAI informed
 * me that I need to revise my folder structure to look like project-folder --> 
 * notificationsystem --> project files. Then, I noticed that despite declaring 
 * the package for all of the project files, none of them would connect to the interface
 * project file. I asked GENAI for guidance on this matter to which it suggested
 * eventually to check my files in the folder itself (it kept thinking I wasn't declaring
 * the package information properly). I noticed that, for some reason, only while looking
 * at my notificationsystem folder on my File Explorer that my interface was not considered 
 * a Java file (but it appeared as a java file on VSCode). Thus, I had to recreate the file 
 * and my problem was solved. I was a bit confused on how the AlertSystem was supposed to work. Looking back
 * now and overall how this program is supposed to be represented, it all makes sense (o.o),
 * but anyways! I asked for help mapping how the AlertSystem and Main
 * classes should be structured and it informed me via guidance as commented out sections on how to 
 * do the program, to which I then inputted my code and the GENAI software informed me where 
 * to make improvements and where I could make small fixes. For example, one of these 
 * fixes came in the form of utilizing switch (choice) instead of if-statements.
 * 
 * @author Natalie Plebanek
 * @version 1.0.0
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
            System.out.println("3. Send Message(s)");
            System.out.println("4. View Messages Sent ");
            System.out.println("5. Exit Notification System");
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

                    System.out.print("Enter message: ");
                    String message = scanner.nextLine();
                    alertSystem.notifyUser(message);
                    break;

                case 4:

                    alertSystem.printLog();
                    break;

                case 5:

                    running = false;
                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        }

        scanner.close();

    }
}