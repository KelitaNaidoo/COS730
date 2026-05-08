/*
This class is responsible for managing reviewer retrieval and filtering.
It obtains reviewer information from the database, applies conflict filtering
and workload checks, and returns the filtered reviewer list to the
SubmissionController.
*/

import java.util.*;
public class ReviewerManager
{
	private Database database;
	
	public ReviewerManager(Database database)
	{
		this.database = database;
	}
	
	public List<Reviewer> getAvailableReviewers()
	{
		System.out.println("Getting available reviewers..");
		List<Reviewer> reviewerList = database.fetchReviewers();
		reviewerList = filterConflicts(reviewerList);
		reviewerList = checkWorkload(reviewerList);
		return reviewerList;
	}
	
	public List<Reviewer> checkWorkload(List<Reviewer> reviewerList)
	{
		System.out.println("Checking reviewer workload.");
		// Reviewer workload checking rules would be implemented here
		return reviewerList;
	}
	
	public List<Reviewer> filterConflicts(List<Reviewer> reviewerList)
	{
		System.out.println("Checking reviewer conflicts.");
		// Reviewer conflict filtering rules would be implemented here
		return reviewerList;
	}
}