package Test;
import java.util.ArrayList;

public class SalariedEmployee extends Employee{

    ArrayList<Double> cars = new ArrayList<Double>();
    
    protected int Bonus;
    protected int Deductions;



    public SalariedEmployee(){
        super();
        this.Bonus = 0;
        this.Deductions = 0;
    }

    public SalariedEmployee(String Name,String Address,String Nationality, int Age,int Salary,String Rank,String Job,int Bonus,int Deductions){
        super(Name, Address, Nationality, Age, Salary, Rank, Job);
        this.Bonus = Bonus;
        this.Deductions = Deductions;
    }

    public void setWorkingHours(){
        

    }
}
