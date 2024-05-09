package Test;
public class Student extends Person {


    protected int StudyLevel;
    protected String specialization;
    protected float GPA;


    public Student(){
        super();
        this.StudyLevel = 0;
        this.specialization = "null";
        this.GPA = 0;
    }
    
    public Student(String Name,String Address,String Nationality, int Age,int StudyLevel,String specialization,float GPA){
        super(Name,Address,Nationality,Age);
        this.StudyLevel = StudyLevel;
        this.specialization = specialization;
        this.GPA = GPA;
    }


    public void setStudyLevel(int StudyLevel){
        if(StudyLevel <= 0){
        System.out.println("Invalid Study Level");}
        else{
          this.StudyLevel = StudyLevel;
        }
    }

    public int getStudyLevel(){
        return StudyLevel;
    }


    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }

    public String getSpecialization(){
        return specialization;
    }


    public void setGPA(float GPA){
        if(GPA <= 0){
        System.out.println("Invalid GPA");}
        else{
            this.GPA = GPA;
        }
    }



}
