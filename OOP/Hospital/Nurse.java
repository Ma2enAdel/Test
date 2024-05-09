package Hospital;

public class Nurse extends Employee{

        // Nurse attributes
        private String department;
        private int yearsOfExperience;
    
        // Constructor
    
        public Nurse( String name, double age, int phonenumber, String gender, int id, String dateofhiring, String jobpostion, int salary,String department, int yearsOfExperience) {
           super (name,age,phonenumber,gender,id,dateofhiring,jobpostion,salary);
            this.department = department;
            this.yearsOfExperience = yearsOfExperience;
        }
    
    
        // Getter methods
        @Override
        public String getName() {
            return name;
        }
    
        @Override
        public double getAge() {
            return age;
        }
    
    
        @Override
        public String getGender() {
            return gender;
        }
    
        public String getDepartment() {
            return department;
        }
    
        public int getYearsOfExperience() {
            return yearsOfExperience;
        }
    
        // Setter methods
        @Override
        public void setName(String name) {
            this.name = name;
        }
    
        public void setAge(int age) {
            this.age = age;
        }
    
        @Override
        public void setGender(String gender) {
            this.gender = gender;
        }
    
        public void setDepartment(String department) {
            this.department = department;
        }
    
        public void setYearsOfExperience(int yearsOfExperience) {
            this.yearsOfExperience = yearsOfExperience;
    }
    
    }
    

