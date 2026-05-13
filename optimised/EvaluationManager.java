/*
This class manages the evaluation process.
It collects reviewer scores, saves them through the Repository,
requests an outcome from the DecisionTable, and triggers notification.
*/

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class EvaluationManager 
{
    private Repository repository;
    private DecisionTable decisionTable;
    private NotificationService notificationService;
    private List<Double> scoreList;

    public EvaluationManager(Repository repository) 
	{
        this.repository = repository;
        decisionTable = new DecisionTable();
        notificationService = new NotificationService();
        scoreList = new ArrayList<>();
    }

    public void startEvaluation(File data, List<Reviewer> assignedReviewers) 
	{
        System.out.println("Starting evaluation...");

        scoreList.clear();

        // Sample scores used to simulate reviewer evaluation.
        double[] sampleScores = {80.5, 77.0, 82.0};

        for (int i = 0; i < assignedReviewers.size(); i++) 
		{
            double score = sampleScores[i % sampleScores.length];
            assignedReviewers.get(i).submitScore(this, score);
        }

        repository.saveScores(scoreList);
        String outcome = decisionTable.determineOutcome(scoreList);
        notificationService.notifyOutcome(outcome);
    }


    public void submitScore(double score) 
	{
        scoreList.add(score);
        System.out.println("Score recieved");
    }
}