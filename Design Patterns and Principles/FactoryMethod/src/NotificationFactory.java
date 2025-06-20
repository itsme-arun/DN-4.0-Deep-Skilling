public class NotificationFactory {
    public Notification createNotification(String type){
        if(type == null || type.isEmpty()){
            return null;
        }
        switch(type.toLowerCase()){
            case "sms":
                return new SmsNotification();

            case "email":
                return new EmailNotification();

            case "push":
                return new PushNotification();

            default:
                throw new IllegalArgumentException("Unknow Notification type");
        }
    }
}
