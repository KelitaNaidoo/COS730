/*
This class manages the overall submission and review process.
It receives submission data from the UI, validates the submission format,
stores valid submissions in the database, retrieves and assigns reviewers,
and initiates the evaluation process.
*/

import java.io.*;
import java.util.*;

public class SubmissionController
{
	private UI ui;
	private Validator validator;
	private Database database;
	private ReviewerManager reviewerManager;
	private EvaluationManager evaluationManager;
	
	public SubmissionController(UI ui)
	{
		this.ui = ui;
		validator = new Validator();
		database = new Database();
		reviewerManager = new ReviewerManager(database);
		evaluationManager = new EvaluationManager();
	}
	
	public void submit(File data)
	{
		boolean valid = validator.validateFormat(data);
		
		if(!valid)
		{
			ui.returnError();
		}
		
		else
		{
			boolean confirmation = database.saveSubmission(data);
			List<Reviewer> filteredReviewers = reviewerManager.getAvailableReviewers();
			for (Reviewer reviewer : filteredReviewers)
			{
				reviewer.assignReview();
			}
			evaluationManager.startEvaluation();
		}
	}
}