import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {
    private Model model;
    private String infForUser;

    public Controller(Model model) {
        this.model = model;
    }

    public void getInfFromUser(){
        System.out.println("Controller asks you enter data for model...");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            infForUser = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Controller change model data for " + infForUser);
        model.setStringFromController(infForUser);
    }
}
