import java.util.concurrent.atomic.AtomicInteger;

public class Employee{

    private String name;
    private String department;
    private int salary;
    private int id;
    private boolean working;
    private static final AtomicInteger count = new AtomicInteger(0);

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public boolean getWorking() {
        return this.working;
    }

    public Employee(String name, String department, int salary, boolean working) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = id + count.incrementAndGet();
        this.working = working;
    }



}