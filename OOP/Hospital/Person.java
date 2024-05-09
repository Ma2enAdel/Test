package Hospital;

public abstract  class  Person {
    //class attributes
    protected String name;
    protected double age ;
    protected int phonenumber;
    protected String gender;
    // no argument constructor
    public Person(){

    }
    //argumentative constructor
    public Person(String name ,double age, int phonenumber, String gender) {
        this.name=name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.gender = gender;
    }
    // method to get the name of the person
    public String getName() {
        return name;
    }
    // method to modify the name
    public void setName(String name) {
        this.name = name;
    }
    // method to get the age of the person
    public double getAge() {
        return age;
    }
    // method to modify the age 
    public void setAge(double age) {
        this.age = age;
    }
    // method the get the phone number
    public int get_Phone_number() {
        return phonenumber;
    }
    // method to modify the phone number
    public void set_Phone_number(int phonenumber) {
        this.phonenumber = phonenumber;
    }
    // method to get the gender of the person
    public String getGender() {
        return gender;
    }
    // method to modify the gender
    public void setGender(String gender) {
        this.gender = gender;
    }
    // an abstract method to print all information
    public abstract String toString();
}