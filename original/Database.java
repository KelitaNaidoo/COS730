/*
This class simulates the system database.
It stores submitted artefacts, retrieves reviewer information,
and saves reviewer scores according to the sequence diagram.  
*/

import java.io.*;
import java.util.*;

public class Database
{
	public boolean saveSubmission(File data)
	{
		System.out.println("Submission saved.");
		return true;
	}
	
	public List<Reviewer> fetchReviewers()
	{
		 List<Reviewer> reviewerList = new ArrayList<>();
		 
		//sample reviewers
		//additional attributes can be added such as conflicts
		reviewerList.add(new Reviewer(1));
		reviewerList.add(new Reviewer(2));
		reviewerList.add(new Reviewer(3));
		
		return reviewerList;
	}
	
	public void saveScore(double score)
	{
		System.out.println("Score saved.");
	}
}
