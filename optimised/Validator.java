/*
This class validates the submitted artefact format.
*/

import java.io.File;

public class Validator 
{
    public boolean validateFormat(File data) 
	{
        System.out.println("Validating format");
        return data.getName().toLowerCase().endsWith(".pdf");
    }
}