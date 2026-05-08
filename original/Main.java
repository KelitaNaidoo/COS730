/*
This class is the entry point of the program.
It simulates the Researcher actor submitting a research artefact
to the system through the UI.
*/

import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        UI ui = new UI();
        File data = new File("research_output.pdf");
        ui.submitResearchOutput(data);
    }
}