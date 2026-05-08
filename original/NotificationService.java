/*
This class is responsible for preparing and sending the final outcome
notification to the Researcher actor according to the sequence diagram.
*/

public class NotificationService
{
    public void notifyAcceptance()
    {
        System.out.println("Acceptance notification prepared.");
        sendNotification();
    }

    public void notifyRejection()
    {
        System.out.println("Rejection notification prepared.");
        sendNotification();
    }

    public void notifyRevision()
    {
        System.out.println("Revision notification prepared.");
        sendNotification();
    }

    public void sendNotification()
    {
        System.out.println("Notification sent to researcher.");
    }
}