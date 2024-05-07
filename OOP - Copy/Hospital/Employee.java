package Hospital;

public class Employee extends Person {


        //class attributes
        protected int id ; 
        protected String dateofhiring;
        protected String jobpostion;
        protected int salary;
        // no argument constructor
        public Employee(){
            
        }
        //argumentative constructor
        public Employee(int id, String dateofhiring, String jobpostion, int salary, String name, double age, int phonenumber, String gender) {
            super(name, age, phonenumber, gender);
            this.id = id;
            this.dateofhiring = dateofhiring;
            this.jobpostion = jobpostion;
            this.salary = salary;
        }
        // method to get the id
        public int getId() {
            return id;
        }
        // method to modify the id
        public void setId(int id) {
            this.id = id;
        }
        //  method to get the date of the date hiring 
        public String getDateofhiring() {
            return dateofhiring;
        }
        // method to modify the date of hiring
        public void setDateofhiring(String dateofhiring) {
            this.dateofhiring = dateofhiring;
        }
        // method to get the job postion
        public String getJobpostion() {
            return jobpostion;
        }
        // method to modify the job postion
        public void setJobpostion(String jobpostion) {
            this.jobpostion = jobpostion;
        }
        // method to get the salary
        public int getSalary() {
            return salary;
        }
        // method to modify the salary
        public void setSalary(int salary) {
            this.salary = salary;
        }
        // method to print all information
        @Override
        public String toString() {
            return "employee{" +"name="+name+",age= "+age+",phonemumber="+phonenumber+",gender="+gender+",id=" + id + ", dateofhiring=" + dateofhiring + ", jobpostion=" + jobpostion + ", salary=" + salary + '}';
      }
    
    }
    

