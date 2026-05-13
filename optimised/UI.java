/*
This class represents the user interface boundary.
It receives the research artefact from the Researcher actor
and passes the request to the SubmissionController.
*/

import java.io.File;

public class UI 
{
    private SubmissionController submissionController;

    public UI() 
	{
        submissionController = new SubmissionController(this);
    }

    public void submitResearchOutput(File data) 
	{
        System.out.println("Artefact is submitted by Researcher");
        submissionController.submit(data);
    }

    public void returnError() 
	{
        System.out.println("Invalid format. Only PDF submissions are accepted.");
    }

    public void returnNoReviewerError() 
	{
        System.out.println("No suitable reviewers are available.");
    }

    public void displayResult() 
	{
        System.out.println("Displaying result to researcher.");
    }
}