package Test;
public class Employee extends Person {

    protected int Salary;
    protected String Rank;
    protected String Job;


    public Employee(){
        super();
        this.Salary = 0;
        this.Rank = "null";
        this.Job = "null";
    }

    public Employee(String Name,String Address,String Nationality, int Age,int Salary,String Rank,String Job){
        super(Name, Address, Nationality, Age);
        this.Salary = Salary;
        this.Rank = Rank;
        this.Job = Job;
    }


    
    public void setSalary(int Salary){
        if(Salary <= 0){
            System.out.println("Invalid Salary");}
        else{
        this.Salary = Salary;}
    }

    public int getAge(){
        return Salary;
    }

    public void setRank(String Rank){
        this.Rank = Rank;
    }

    public String getRank(){
        return Rank;
    }

    public void setJob(String Job){
        this.Job = Job;
    }

    public String getJob(){
        return Job;
    }
    
}
