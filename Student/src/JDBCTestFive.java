import java.sql.*;
import java.util.*;

public class JDBCTestFive {
       public static void main(String[] args){
              //int inp;
              
              try {
                     Class.forName("oracle.jdbc.driver.OracleDriver");
                     
                     Connection conn1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr" ,"hr");
                     System.out.println("Connection created");
                     CallableStatement cst = conn1.prepareCall("{? = call get_sal(?)}");
                     cst.setInt(2,107);
                     cst.registerOutParameter(1, Types.BIGINT);
                     cst.execute();

                     float f = cst.getFloat(1);
                     System.out.println(f);
              } catch (ClassNotFoundException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
              }
              
              catch (SQLException e2){
                     e2.printStackTrace();
                     System.out.println("SQL Exception has arised because connectin aint created");
              }
       
       }
       
}
