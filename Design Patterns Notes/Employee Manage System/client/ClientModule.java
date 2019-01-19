import java.text.Normalizer.Form;

public class ClientModule{

    public static void main(String[] args) {
        Employee shady = new Employee("Shady", "IT Department", 12, true);
        ClientModule.hireNewEmployee(shady);
        printEmployeeReport(shady, FormatType.CSV);
    }

    public static void hireNewEmployee(Employee employee) {
        EmployeeDAO employeeDao = new EmployeeDAO();
        employeeDao.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee) {
        EmployeeDAO employeeDao = new EmployeeDAO();
        employeeDao.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType) {
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        formatter.getFormattedEmployee();
    }

}