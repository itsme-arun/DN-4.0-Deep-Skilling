public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification n1 = factory.createNotification("sms");
        n1.notifyUser();

        Notification n2 = factory.createNotification("email");
        n2.notifyUser();

        Notification n3 = factory.createNotification("push");
        n3.notifyUser();


    }
}