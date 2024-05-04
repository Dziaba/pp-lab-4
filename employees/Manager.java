package employees;

public class Manager extends Employee{

    public int numberOfSubordinates;

    public Manager(String fullName, double salary, int numberOfSubordinates){
        super(fullName, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    } 

    public int getNumberOfSubordinates(){
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int newNumberOfSubordinates){
        this.numberOfSubordinates = newNumberOfSubordinates;
    }
    public String toString(){
        return "Manager:" + getName() + " ,Salaryy: " + getSalary() + " Subordinates: " + getNumberOfSubordinates(); 
    }
    
}