import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO{

    List<Employee> employeeList;

    Employee emp1 = new Employee("Pal", "IT", 2000, true);
    Employee emp2 = new Employee("Dave", "IT", 2020, true);
    Employee emp3 = new Employee("Steve", "Dev Ops", 3000, true);
    Employee emp4 = new Employee("John", "Android Dev", 4000, true);
    Employee emp5 = new Employee("Smith", "Apple Dev", 4000, true);

    public List<Employee> generateEmployees(){
        employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        return employeeList;
    }

    public void addEmployee(Employee emp){
        employeeList.add(emp);
    }

}