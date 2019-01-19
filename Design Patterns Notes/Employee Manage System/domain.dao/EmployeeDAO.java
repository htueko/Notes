import java.sql.PreparedStatement;

import com.sun.media.sound.SF2Soundbank;

public class EmployeeDAO{

    public void saveEmployee(Employee employee){
        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
        connectionManager.connect();
        connectionManager.getConnectionObject().PreparedStatement("insert_into_Employee_tbl");
        connectionManager.disconnect();
        System.out.println("saved employee to database..." + employee);
    }

    public void deleteEmployee(Employee employee){
        System.out.println("deleted employee to database..." + employee);
    }

}