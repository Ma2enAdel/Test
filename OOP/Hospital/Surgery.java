package Hospital;

public class Surgery {
    
    private String type;
    private int day; // day of the current month of the surgery
    private int noOfStaff;

    

    public Surgery(String type, int day, int noOfStaff) {
        this.type = type;
        this.day = day;
        this.noOfStaff = noOfStaff;

       

    }

    // Method to reserve a surgery


    // Method to cancel a surgery
    public void cancelSurgery() {
       
    System.out.println("Surgery reservation for day " + this.day + " cancelled.");

    
        
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getNoOfStaff() {
        return noOfStaff;
    }

    public void setNoOfStaff(int noOfStaff) {
        this.noOfStaff = noOfStaff;
    }


}

