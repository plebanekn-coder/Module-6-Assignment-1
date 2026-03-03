# **Notification System Patch 1**
## **Project Purpose**
Notification System with WhatsApp extension.

This version extends the original Notification System (as seen in the initial branch), adding support for WhatsApp messaging capabilities (Patch 1). 
The AlertSystem and NotificationMedium interface are not modifiend, maintaining compliance with maintenance requirements (utilizing 
composition).

### **New Feature**
- Added WhatsAppService class file
- Fully integrates into the notification system without altering existing code

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
2) Navigate to folder directory on your device. For example: cd C:\Users\...\Plebanek_Project 5
3) Input javac notificationsystem/*.java
4) Input: java notificationsystem.Main

## **Licensing**
Check LICENSE file for more information.
