/*
This class is responsible for validating the submission format
*/

import java.io.*;

public class Validator
{
	public boolean validateFormat(File data)
	{
		System.out.println("Validating submission format.");
		return data.getName().endsWith(".pdf");
	}
}
