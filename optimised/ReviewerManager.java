/*
This class manages reviewer selection and assignment.
It retrieves reviewers through the Repository, filters suitable reviewers,
and assigns reviews to the remaining suitable reviewers.
*/

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReviewerManager 
{
    private Repository repository;

    public ReviewerManager(Repository repository) 
	{
        this.repository = repository;
    }

 
    public List<Reviewer> assignSuitableReviewers(File data) 
	{
        System.out.println("Assigning suitable reviewers...");
        List<Reviewer> reviewerList = repository.fetchReviewers();
        List<Reviewer> suitableReviewers = filterSuitableReviewers(reviewerList);

        if (suitableReviewers.isEmpty()) 
		{
            System.out.println("No suitable reviewers");
            return suitableReviewers;
        }

        for (Reviewer reviewer : suitableReviewers) 
		{
            reviewer.assignReview(data);
        }

        System.out.println("Reviewers assigned");
        return suitableReviewers;
    }

    private List<Reviewer> filterSuitableReviewers(List<Reviewer> reviewerList) 
	{
        System.out.println("Filtering suitable reviewers...");

        List<Reviewer> suitableReviewers = new ArrayList<>();

        for (Reviewer reviewer : reviewerList) 
		{
            boolean noConflict = !reviewer.hasConflict();
            boolean acceptableWorkload = reviewer.getActiveReviews() < 5;

            if (noConflict && acceptableWorkload) 
			{
                suitableReviewers.add(reviewer);
            }
        }

        return suitableReviewers;
    }
}