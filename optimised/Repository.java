/*
This class acts as the persistence abstraction.
It simulates storing submissions, retrieving reviewers, and saving scores.
This replaces direct database access and hides persistence details from workflow objects.
*/

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Repository 
{
    public boolean saveSubmission(File data) 
	{
        System.out.println("Saving data...");
        System.out.println("Saved");
        return true;
    }

    public List<Reviewer> fetchReviewers() 
	{
        System.out.println("fetching reviewers...");

        List<Reviewer> reviewerList = new ArrayList<>();
        // Sample reviewers: reviewerID, activeReviews, conflictDetected
        reviewerList.add(new Reviewer(1, 2, false));
        reviewerList.add(new Reviewer(2, 4, false));
        reviewerList.add(new Reviewer(3, 1, false));
        System.out.println("ReviewerList returned");
        return reviewerList;
    }

    public void saveScores(List<Double> scoreList) 
	{
        System.out.println("Saving scores...");
        System.out.println("Saved scores " + scoreList);
        System.out.println("Scores saved");
    }
}