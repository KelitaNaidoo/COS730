/*
This class manages the evaluation stage of the process.
It starts the evaluation, receives reviewer scores, saves scores
to the database, calculates the average, checks consensus,
applies decision rules, and triggers the appropriate notification.
*/

import java.util.*;

public class EvaluationManager
{
    private Database database;
    private NotificationService notificationService;
    private List<Double> scores;
	private double average;
    private boolean consensus;

    public EvaluationManager()
    {
        database = new Database();
        notificationService = new NotificationService();
        scores = new ArrayList<>();
    }

    public void startEvaluation()
    {
        System.out.println("Starting evaluation.");
        Reviewer reviewer1 = new Reviewer(1);
        Reviewer reviewer2 = new Reviewer(2);
        Reviewer reviewer3 = new Reviewer(3);
        reviewer1.submitScore(this, 80.5);
        reviewer2.submitScore(this, 65.0);
        reviewer3.submitScore(this, 55.5);

        average = calculateAverage();
        consensus = checkConsensus();
        String result = applyRules();

        if (result.equals("accepted"))
        {
            notificationService.notifyAcceptance();
        }
        else if (result.equals("rejected"))
        {
            notificationService.notifyRejection();
        }
        else
        {
            notificationService.notifyRevision();
        }
    }

    public void submitScore(double score)
    {
        scores.add(score);
        database.saveScore(score);
    }

    public double calculateAverage()
    {
        double total = 0;
        for (double score : scores)
        {
            total += score;
        }

        return total / scores.size();
    }

 
    public boolean checkConsensus()
    {
        System.out.println("Checking consensus.");
        return true;
    }

    public String applyRules()
    {
        System.out.println("Applying decision rules.");
        if (average >= 75 && consensus)
        {
            return "accepted";
        }
        else if (average < 50)
        {
            return "rejected";
        }
        else
        {
            return "revision";
        }
    }
}