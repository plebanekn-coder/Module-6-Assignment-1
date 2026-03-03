# Module-6-Assignment-1
Within this repository are the Module's 4 and 5 Assignments. For the Module 4 folder, a flexible notification system was created. For the Module 5 Assignment, an extension was created to accommodate and add a WhatsApp notification method.

## **Main File Purpose**
This Main file is used to test additional branches/patches that are made to the code. Main branch main file is important for regression testing of the software branches/patches made for this repository to make sure additional classes do not impact portion of the code that should not be changed.

## **Additional READMEs**
Within each of the branches and their respective folders are additional README files to understand further project functionality.

# **Notification System**
## **Project Purpose**
This project includes a notification system that sends messages through different communication methods.
In this initial branch, the communication mediums that are possible are via email, SMS, and WhatsApp.

## **Prerequisites**
- Made using Java Version 24.0.2.
- Java JDK 17+ needed.
- Can run from CLI or a Java IDE.

## **Code Features**
- Sends notifications (string messages) through multiple mediums:
  - Initial Branch: SMS and Email mediums
  - Patch 01: WhatsApp medium
- Uses a shared NotificationMedium interface
- Central AlertSystem class manages delivery
- Designed using composition and open-closed approach

## **Architecture**
**NotificationMedium:** Interface; defines contract for all notification services.
 - **Implementations:** EmailService and SMSService implements send() method with their own delivery logic.

**AlertSystem:** Accepts the NotificationMedium, sends the messages based on the utilized medium.

## **Design Principles**
- **Open Closed Principle:** new notification types can be added with modifying the AlertSystem file.
- **Composition:** creates instances of the respective class files to reuse their functionality, allows for dynamic behavior changes of the code.

## **Testing Suite**
Currently, this project does not utilize a separate unit test framework. To test this branch, one can utilize the main 
file in this branch or via the main branch. One can conduct regression testing via the Main file in the Main branch.

## **How To Run**
**Via Java IDE:**
1) Download repository or pull branch
2) Open Project folder
3) Run Main file

**Via CLI:**
1) Download repository or pull branch
2) Navigate to folder directory on your device. For example: cd C:\Users\...\Plebanek_Project 4
3) Input javac notificationsystem/*.java
4) Input: java notificationsystem.Main

## **Licensing**
Check LICENSE file for more information.

