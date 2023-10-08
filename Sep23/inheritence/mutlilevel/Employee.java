package Sep23.inheritence.mutlilevel;

public class Employee {
    private final int salary;
    public Employee(int salary){
        this.salary = salary;
    }
    //Write a Java program to create a class called Employee with methods called work() and getSalary().
    // Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
    public void work(){
        System.out.println("Working as an Employee");
    }
    public int getSalary(){
       return salary;
    }
}
class HRManager extends Employee {
    public HRManager(int salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("\nManaging employees");
    }

    public void addEmployee() {
        System.out.println("\nAdding new employee!");
    }

    public static void main(String[] args) {
        Employee emp = new Employee(50000);
        HRManager mgr = new HRManager(70000);
        emp.work();
        System.out.println("Employee salary:" + emp.getSalary());
        mgr.work();
        System.out.println("Manager salary: " + mgr.getSalary());
        mgr.addEmployee();
    }
}
