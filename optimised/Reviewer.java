/*
This class represents a reviewer.
A reviewer can be assigned a review and can submit a score to the EvaluationManager.
*/
import java.io.File;

public class Reviewer 
{
    private int reviewerID;
    private int activeReviews;
    private boolean conflictDetected;

    public Reviewer(int reviewerID, int activeReviews, boolean conflictDetected) 
	{
        this.reviewerID = reviewerID;
        this.activeReviews = activeReviews;
        this.conflictDetected = conflictDetected;
    }

    public int getReviewerID() 
	{
        return reviewerID;
    }

    public int getActiveReviews() 
	{
        return activeReviews;
    }

    public boolean hasConflict() 
	{
        return conflictDetected;
    }

    public void assignReview(File data) 
	{
        System.out.println("Reviewer " + reviewerID + " assigned review");
    }

    public void submitScore(EvaluationManager evaluationManager, double score) 
	{
        System.out.println("Reviewer " + reviewerID + " submitted score");
        evaluationManager.submitScore(score);
    }
}