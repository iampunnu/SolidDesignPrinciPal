package MainFunction.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Student s=new Student("praveen");
        Connection con=Cp.createC();
        String q="insert into students(sname) values(?)";
        // psmt.setString(1,s.getSname());
      //  psmt.executeUpdate();
        String dq="delete from students where sid=?";
        PreparedStatement psmt=con.prepareStatement(dq);

       psmt.setString(1,"3");
      //  psmt.setInt(1,1);
        psmt.executeUpdate();
    }
}
