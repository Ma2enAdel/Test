package Test;
public class Person {

    protected String Name;
    protected String Address;
    protected String Nationality;
    protected int Age;

    public Person(){
        this.Name = "null";
        this.Address = "null";
        this.Nationality = "null";
        this.Age = 0;
    }

    public Person(String Name,String Address,String Nationality, int Age){
        this.Name = Name;
        this.Address = Address;
        this.Nationality = Nationality;
        this.Age = Age;
    }


    public void setAge(int Age){
        this.Age = Age;
    }

    public int getAge(){
        return Age;
    }

    public void setAddress(String Address){
        this.Address = Address;
    }

    public String getAddress(){
        return Address;
    }

    public void setNationality(String Nationality){
        this.Nationality = Nationality;
    }

    public String getNationality(){
        return Nationality;
    }
    
}
