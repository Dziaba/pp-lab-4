import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company{
    public static void main(String[] args){
        Employee [] employees = new Employee[5];

        employees[0] = new Manager("Kowalski", 76000, 0);
        employees[1] = new Worker("Jan Nowak", 5700 , "Worker");
        employees[2] = new Worker("Marek M", 2100, "Worker");
        employees[3] = new Employee("Hubert W", 9000);
        employees[4] = new Worker(" Bob", 7600, "Worker");


        int nonMenager = 0;
        
        for (int i=0; i<employees.length; i++){
            if(!(employees[i] instanceof Manager)){
                nonMenager ++;
            }
        }
        System.out.println("Number of non menagers:" + nonMenager);

        if (employees[0] instanceof Manager){
            Manager manager = (Manager) employees[0];
            manager.setNumberOfSubordinates(nonMenager);
            manager.setSalary(5000);

        }


        System.out.println("Wszyscy pracownicy:");

        for (int i=0; i<employees.length; i++){
            System.out.println(employees[i]);
        }
    }
}