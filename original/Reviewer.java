/*
This class represents a reviewer involved in the evaluation process.
A reviewer can be assigned to review a submitted artefact and can
submit evaluation scores to the EvaluationManager according to the
sequence diagram interactions.
*/

public class Reviewer
{
	private int reviewerID;
	
	public Reviewer(int reviewerID)
	{
		this.reviewerID = reviewerID;
	}
	
	public void assignReview()
	{
		System.out.println("Reviewer " + reviewerID + " assigned review.");
	}
	
	 public void submitScore(EvaluationManager evaluationManager, double score)
    {
        System.out.println("Reviewer " + reviewerID + " submitted score.");
        evaluationManager.submitScore(score);
    }
}