/*
This class recieves the artefact from the researcher and submits it
to the SubmissionController for format validation and returns an error if invalid.
*/

import java.io.*;

public class UI
{
	private SubmissionController submissionController;
	
	public UI()
	{
		submissionController = new SubmissionController(this);
	}
	
	public void submitResearchOutput(File data)
	{
		submissionController.submit(data);
	}
	
	public void returnError() 
	{
        System.out.println("Ivalid submission.");
	}
} 