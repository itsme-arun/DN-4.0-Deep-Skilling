package org.example;

public class NotificationService {

    private final MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void notifyUser(String userId, String message) {
        if (userId != null && message != null) {
            messageSender.send(userId, message);
        }
    }
}
