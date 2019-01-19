public class App{

    public static void main(String[] args) {
    
        IObserver payroll = new PayrollDepartment();
        IObserver hrSystem = new HRDepartment();
        Employeeanagementsystem ems = new Employeeanagementsystem();

        ems.registerObserver(payroll);
        ems.registerObserver(hrSystem);

        ems.hireNewEmployee(new Employee("bob", "Android Dev", 1200, true));

    }

}