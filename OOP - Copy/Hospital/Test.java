package Hospital;

import hellofx.MyGUI;
import javafx.application.Application;

public class Test {

    public static void main(String[] args) {

        //Create Objects for classes
        Hospital h = new Hospital();
        LoginSystem r = new LoginSystem();
        MainMenu m = new MainMenu();

        Application.launch(MyGUI.class, args);




        h.AddPatient(new Patient("Fever", "No significant history", "Penicillin", "2024-05-05", "John Doe", 35, 123456789, "Male"));
        h.AddPatient(new Patient("Asthma", "Had pneumonia last year", "None", "2024-05-04", "Alice Smith", 42, 987654321, "Female"));


        
        while (true) {
            m.MainPrompt();
            m.StartMenu(r, h);  
}
    }
}
