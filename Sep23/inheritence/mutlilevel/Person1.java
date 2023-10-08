package Sep23.inheritence.mutlilevel;

//Write a Java program to create a class known as Person with methods called getFirstName() and getLastName().
// Create a subclass called Employee that adds a new method named getEmployeeId() and
// overrides the getLastName() method to include the employee's job title.

public class Person1 {
    private final String FirstName;
    private final String LastName;

    public Person1(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }
}

class Employee1 extends Person1 {
    private final int employeeid;
    private final String JobTitle;

    public Employee1(String FirstName, String LastName, int employeeid, String JobTitle) {
        super(FirstName, LastName);
        this.employeeid = employeeid;
        this.JobTitle = JobTitle;
    }

    public static void main(String[] args) {
        Employee1 employee1 = new Employee1("Shrikant", "Nandanwar", 1234, "QA Manager");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " (" + employee1.getEmployeeid() + " )");
        Employee1 employee2 = new Employee1("Rahul", "Nandanwar", 4321, "Software Manager");
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " (" + employee2.getEmployeeid() + ")");
    }

    public int getEmployeeid() {
        return employeeid;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + ", " + JobTitle;
    }
}
