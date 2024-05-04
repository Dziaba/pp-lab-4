public class Company{
    public static void main(String[] args){
        Employee [] employees = new Employee[5];

        employees[0] = new Employee("Damian Kowalski", 4500);
        employees[1] = new Employee("Jan Nowak", 5700);
        employees[2] = new Employee("Marek M", 2100);
        employees[3] = new Employee("Hubert W", 9000);
        employees[4] = new Employee(" Bob", 7600);

        System.out.println("PRacownik 3:" + employees[3]);

        employees[3].setSalary(25000);

        System.err.println("Wszyscy pracownicy:");

        for (int i=0; i<employees.length; i++){
            System.out.println(employees[i]);
        }
    }
}