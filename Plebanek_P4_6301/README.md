# **Notification System**
## **Project Purpose**
This project includes a notification system that sends messages through different communication methods.
In this initial branch, the communication mediums that are possible are via email and SMS.

## **Prerequisites**
- Made using Java Version 24.0.2.
- Java JDK 17+ needed.
- Can run from CLI or a Java IDE.

## **Code Features**
- Sends notifications (string messages) through multiple mediums: SMS and Email.
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
