package Hospital;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginSystem {

    private String Username;
    private String Password;

    private ArrayList<String> usernames;
    private ArrayList<String> passwords;

    //Default Constructor
    public LoginSystem() {
        Username = "null";
        Password = "null";
        usernames = new ArrayList<>();
        passwords = new ArrayList<>();
    }

    Scanner input = new Scanner(System.in);

    //Method for Registering
    public void Register() {
        try {

            System.out.println("Please enter your registration info");

            System.out.print("Username:");
            this.Username = input.nextLine();

            //Asks user to enter a username that gets passed to Method RegUsername to return true or false
            if (RegUsername(Username)) {
                System.out.print("Password:");
                this.Password = input.nextLine();

                //If RegUsername returns true it proceeds to ask user to enter Password and passes it to RegPassword which returns true or false
                if (RegPassword(Password)) {
                    System.out.println("Registration Successful!");
                    usernames.add(Username);
                    passwords.add(Password);
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred during registration: " + e.getMessage());
        }
    }

    //Method RegUsername, used to check if username is already taken or not
    public boolean RegUsername(String Username) {
        try {

            //While loop is used to check if Username already exists inside the array
            //If it is inside the ArrayList the while loop will keep going until user enters a unique username
            while (usernames.contains(Username)) {
                System.out.println("Username already taken\nPlease choose a different username");
                this.Username = input.nextLine();
            }
        } catch (Exception e) {
            System.out.println("An error occurred while checking username availability: " + e.getMessage());
        }
        return true;
    }

    public boolean RegPassword(String Password) {
        try {

            //While loop that takes password and checks if the password has atleast 6 characters
            //If it has less than 6 characters, the while loop will keep going until user enters a long enough password
            while (this.Password.length() < 6) {
                System.out.println("Password needs to have a minimum of 6 characters, Please choose a longer password\nPassword:");
                this.Password = input.nextLine();
            }
        } catch (Exception e) {
            System.out.println("An error occurred while setting password: " + e.getMessage());
        }
        return true;
    }

    //Method using for logging in after User Registers
    public boolean Login() {

        try {
  
            System.out.print("Username:");
            this.Username = input.nextLine();

            //Asks user to enter a username and sends it to LoginUsername method
            if (LoginUsername(Username)) {
                System.out.print("Password:");
                this.Password = input.nextLine();

                //If LoginUsername returns true, it asks user to enter Password next and sends it and the Username to LoginPassword Method
                if (LoginPassword(Username,Password)) {
                    System.out.println("Login Successful");
                    return true;
                } else {
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

    //LoginUsername method used to check if ArrayList contains the username to check if the username is already registered

    public boolean LoginUsername(String Username) {
        try {
            if (usernames.contains(Username)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("An error occurred while checking username during login: " + e.getMessage());
            return false;
        }
    }


    //Login Password method used to check if the entered password is the correspondent to the entered username
    public boolean LoginPassword(String Username,String Password) {
        try {

            //Checks the index of the corresponding username and returns its password than checks for equality with the entered password
            //While loop won't stop until the user enters the correct password
                while(!passwords.get(usernames.indexOf(Username)).equals(Password)) {
                    System.out.println("Password does not match Username, Please Try again");
                    Password = input.nextLine();

                }
                return true;
            }
         catch (Exception e) {
            System.out.println("An error occurred while checking password during login: " + e.getMessage());
            return false;
        }
    }
}