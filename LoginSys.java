package Hospital;



import hellofx.MyController;

public class LoginSys {

        // Default Constructor
        public LoginSys() {

        }
    
        // Method for Registering
        public boolean Register(String username, String password) {
            try {
                if (MyController.usernames.contains(username)) {
                    return false; // Username already taken
                }
                
                if (password.length() < 6) {
                    return false; // Password too short
                }
    
                MyController.usernames.add(username);
                MyController.passwords.add(password);
                return true; // Registration successful
            } catch (Exception e) {
               System.out.println("Error "+ e);
                return false;
            }
        }
    
        // Method for logging in
        public boolean Login(String username, String password) {
            try {
                if (!MyController.usernames.contains(username)) {
                    return false; // Username doesn't exist
                }
    
                int index = MyController.usernames.indexOf(username);
                String storedPassword = MyController.passwords.get(index);
    
                if (!storedPassword.equals(password)) {
                    return false; // Incorrect password
                }
    
                return true; // Login successful
            } catch (Exception e) {
                System.out.println("Error " + e);
                return false;
            }
        }
    }

    

