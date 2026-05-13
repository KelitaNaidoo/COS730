import java.io.File;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        File data = new File("research_output.pdf");
        ui.submitResearchOutput(data);
    }
}