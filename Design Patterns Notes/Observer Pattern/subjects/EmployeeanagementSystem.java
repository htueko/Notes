import java.util.List;

public class Employeeanagementsystem implements ISubject{

    private List<IObserver> observers;
    private List<Employee> employees; 
    private EmployeeDAO emplyoeeDAO;
    private Employee employee;
    private String msg;


    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(IObserver department : observers){
            department.callMe(employee, msg);
        }
    }

    public void hireNewEmployee(Employee e){
        employee = e;
        msg = "New Hire: ";
        employees.add(e);
        notifyObserver();
    }

}