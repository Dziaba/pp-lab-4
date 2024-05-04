package employees;

public class Worker extends Employee {
    public String position;

    public Worker (String fullName, double salary, String position) {
        super (fullName, salary);
        this.position = position;
    }

    public String getPosition(){
        return position;
    }
    public String setPosition(String newPosition){
        this.position = newPosition;
        return newPosition;
    }

    public String toString(){
        return "Worker :" + getName() + " Salary: " + getSalary() + " Position: " + getPosition();
    }
    
}
