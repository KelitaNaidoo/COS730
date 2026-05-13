/*
This class acts as the use-case controller for the submission process.
It coordinates the overall workflow but delegates specialised responsibilities
to Validator, Repository, ReviewerManager, and EvaluationManager.
*/

import java.io.File;
import java.util.List;

public class SubmissionController 
{
    private UI ui;
    private Validator validator;
    private Repository repository;
    private ReviewerManager reviewerManager;
    private EvaluationManager evaluationManager;

    public SubmissionController(UI ui) 
	{
        this.ui = ui;
        repository = new Repository();
        validator = new Validator();
        reviewerManager = new ReviewerManager(repository);
        evaluationManager = new EvaluationManager(repository);
    }

    public void submit(File data) 
	{
        System.out.println("Submitted artefact passed to controller");

        boolean valid = validator.validateFormat(data);

        if (!valid) 
		{
            ui.returnError();
            ui.displayResult();
        } 
		else 
		{
            boolean confirmation = repository.saveSubmission(data);
            if (confirmation) 
			{
                List<Reviewer> assignedReviewers = reviewerManager.assignSuitableReviewers(data);

                if (assignedReviewers.isEmpty()) 
				{
                    ui.returnNoReviewerError();
                } 
				else 
				{
                    evaluationManager.startEvaluation(data, assignedReviewers);
                }

                System.out.println("Submission is processed");
                ui.displayResult();
            }
        }
    }
}