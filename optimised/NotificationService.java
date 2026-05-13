/*
This class sends the final outcome notification.
A single notifyOutcome method replaces separate acceptance, rejection, and revision methods.
*/
public class NotificationService 
{
    public void notifyOutcome(String outcome) 
	{
        System.out.println("Notifying outcome(" + outcome + ")");
        sendNotification(outcome);
    }

    private void sendNotification(String outcome) 
	{
        System.out.println("Notification sent to researcher.");
        System.out.println("Final outcome: " + outcome);
    }
}