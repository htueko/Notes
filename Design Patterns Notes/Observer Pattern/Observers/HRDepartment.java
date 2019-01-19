public class HRDepartment implements IObserver{
   @Override
   public void callMe(Employee emp, String msg) {
    System.out.println("HR Department Notified...");
    System.out.println(msg + " " + emp.getName());
   }
}