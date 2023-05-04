import java.sql.*;

public class Main {
    private static final String db_url="jdbc:mysql://localhost:3306/MYDB";
    private static final String db_name="root";
    private static final String db_pwd="@Piya123";
    private static final String qry="INSERT INTO TBL1 VALUES(1,'PIYA','PATNA')";
    public static void main(String[] args)throws Exception {

            System.out.print("hey....welcome");
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn= DriverManager.getConnection(db_url,db_name,db_pwd);
            Statement stmt=cn.createStatement();
            stmt.executeUpdate(qry);
            cn.close();
    }
}