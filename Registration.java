package Hospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Registration {

    private String Username;
    private String Password;

    public Registration(){
        Username = "null";
        Password = "null";
    }

    Scanner input = new Scanner(System.in);
    HashMap<String, String> RegistrationInfo = new HashMap<String, String>();


    public void Register(){
        try {
        
        System.out.println("Please enter your registeration info");

        System.out.print("Username:");
        this.Username = input.nextLine();

        if(RegUsername(Username)){
            System.out.print("Password:");
            this.Password = input.nextLine();

            if(RegPassword(Password)){
            System.out.println("Registration Successful!");
            RegistrationInfo.put(Username, Password);
            }
        }
    }  catch(Exception e) { 
        System.out.println("An error occurred during registration: " + e.getMessage()); 
    }   
}


    public boolean RegUsername(String Username){

        try {

        while(RegistrationInfo.containsKey(Username)){
            System.out.println("Username already taken\nPlease choose a different username");
            this.Username = input.nextLine();
        }
    } catch (Exception e) {
        System.out.println("An error occurred while checking username availability: " + e.getMessage());
    }
    return true;
    }   

    public boolean RegPassword(String Password){
        try {
            while (this.Password.length() < 6) {
                System.out.println("Password needs to have a minimum of 6 characters, Please choose a longer password\nPassword:");
                this.Password = input.nextLine();
            }
        } catch (Exception e) {
            System.out.println("An error occurred while setting password: " + e.getMessage());
        }
        return true;
    }



    public boolean Login(){

        try {
            System.out.print("Username:");
            this.Username = input.nextLine();
    
            if (LoginUsername(Username)) {
                System.out.print("Password:");
                this.Password = input.nextLine();
    
                if (LoginPassword(Password)) {
                    System.out.println("Login Successful");
                    return true;
                } else {
                    System.out.println("Incorrect Password");
                    return false;
                }
            } else {
                System.out.println("Username doesn't exist, Please Register first");
                return false;
            }
        } catch (Exception e) {
            System.out.println("An error occurred during login: " + e.getMessage());
            return false;
        }
    }
    





    public boolean LoginUsername(String Username){     
    try {
        if (RegistrationInfo.containsKey(Username)) {
            return true;
        } else {
            return false;
        }
    } catch (Exception e) {
        System.out.println("An error occurred while checking username during login: " + e.getMessage());
        return false;
    }
}

 
    public boolean LoginPassword(String Password){
        try {
            if (RegistrationInfo.get(Username).equals(Password)) {
                return true;
            } else {
                while (!RegistrationInfo.get(Username).equals(this.Password)) {
                    System.out.println("Password does not match Email, Please Try again");
                    this.Password = input.nextLine();
                }
                return false;
            }
        } catch (Exception e) {
            System.out.println("An error occurred while checking password during login: " + e.getMessage());
            return false;
        }
    }
}
