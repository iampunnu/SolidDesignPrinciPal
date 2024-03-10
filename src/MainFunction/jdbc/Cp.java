package MainFunction.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Cp {
    static Connection con;
    public static Connection createC() throws ClassNotFoundException, SQLException {
        //load the driver
    //    Class.forName("com.mysql.jdbc.Driver");
        String user="root";
        String password="password";
        String url="jdbc:mysql://localhost:3306/student_management";
        con= DriverManager.getConnection(url,user,password);
        return con;
    }
}
