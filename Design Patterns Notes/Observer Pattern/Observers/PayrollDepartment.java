public class PayrollDepartment implements IObserver{
    @Override
    public void callMe(Employee emp, String msg) {
        System.out.println("Payroll Department Notified...");
        System.out.println(msg + " " + emp.getName());
    }
}