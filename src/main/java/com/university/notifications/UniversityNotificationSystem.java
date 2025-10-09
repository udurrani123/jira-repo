package com.university.notifications;

import java.util.ArrayList;
import java.util.List;

// Interface for Notification
interface Notification {
    String getMessage();
}

// Concrete Notifications
class AssignmentDeadlineNotification implements Notification {
    private String assignmentName;
    private String deadline;

    public AssignmentDeadlineNotification(String assignmentName, String deadline) {
        this.assignmentName = assignmentName;
        this.deadline = deadline;
    }

    @Override
    public String getMessage() {
        return "Reminder: Assignment '" + assignmentName + "' deadline is on " + deadline;
    }
}

class ClassCancellationNotification implements Notification {
    private String className;
    private String date;

    public ClassCancellationNotification(String className, String date) {
        this.className = className;
        this.date = date;
    }

    @Override
    public String getMessage() {
        return "Alert: Class '" + className + "' is cancelled on " + date;
    }
}

class ImportantAnnouncementNotification implements Notification {
    private String announcement;

    public ImportantAnnouncementNotification(String announcement) {
        this.announcement = announcement;
    }

    @Override
    public String getMessage() {
        return "Announcement: " + announcement;
    }
}

// Notification Service
class NotificationService {
    private List<Notification> notifications = new ArrayList<>();

    public void addNotification(Notification notification) {
        notifications.add(notification);
    }

    public void sendNotifications() {
        for (Notification notification : notifications) {
            send(notification);
        }
    }

    private void send(Notification notification) {
        // In real-world, integrate with push notification API
        System.out.println("Sending notification: " + notification.getMessage());
    }
}

// Main class to test notifications
public class UniversityNotificationSystem {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        service.addNotification(new AssignmentDeadlineNotification("Math Homework", "2025-11-01"));
        service.addNotification(new ClassCancellationNotification("Physics 101", "2025-10-15"));
        service.addNotification(new ImportantAnnouncementNotification("Campus will be closed on 2025-10-20 for maintenance"));

        service.sendNotifications();
    }
}
