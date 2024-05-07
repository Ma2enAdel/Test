package Hospital;
import java.util.Scanner;

public class MainMenu {


    Scanner input = new Scanner(System.in);
    int choice;

    public void MainPrompt(){

        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");

        choice = input.nextInt();
        input.nextLine();
        
    }

    public void LoginPrompt(){

        System.out.println("1. Add Patient");
        System.out.println("2. Search Patient");
        System.out.println("3. Remove Patient");
        System.out.println("4. Go Back");
        System.out.print("Choose an option: ");

        choice = input.nextInt();
        input.nextLine();

    }

    public boolean LoginMenu(Hospital h){
        
        switch (choice){

            case 1: 
            System.out.print("Enter the following information\nName:");

            String name = input.nextLine();
            System.out.print("Illness:");
            String illness = input.nextLine();
            System.out.print("Medical History:");
            String medicalHistory = input.nextLine();
            System.out.print("Allergy:");
            String allergy = input.nextLine();
            System.out.print("Admission:");
            String admission = input.nextLine();
            System.out.print("Age:");
            double age = input.nextDouble();
            System.out.print("Phone Number:");
            int phoneNumber = input.nextInt();

            input.nextLine();
            System.out.print("Gender:");
            String gender = input.nextLine();

            h.AddPatient(new Patient(illness, medicalHistory, allergy, admission, name, age, phoneNumber, gender));
            return true;
            
            case 2:
            System.out.println("Enter the name of the patient");
            name = input.nextLine();
            h.SearchPatient(name);
            return true;
   

            case 3:
            System.out.println("Enter the following information\nName:");
            name = input.nextLine();
            h.RemovePatient(name);
            return true;
            

            case 4:
            System.out.println("Exiting");
            return false;


            default:
            System.out.println("Invalid input, Please try again");
            return true;
    }
}


public void StartMenu(LoginSystem r,Hospital h){

    switch (choice) {

        case 1:
            r.Register();
            break;


        case 2:
        if(r.Login()){
            do {
                LoginPrompt();
            } while (LoginMenu(h));
            
        }
        break;


        case 3:
            System.out.println("Exiting...");
            System.exit(0);


        default:
            System.out.println("Invalid choice! Please enter a valid option.");
    }
}    
}

    

