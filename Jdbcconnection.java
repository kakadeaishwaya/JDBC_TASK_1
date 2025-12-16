import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbcconnection {

    public static void main(String[] args) {


        System.out.println("Name:AISHWARYA KAKADE- Batch No -210");

        String oracleDriver = "oracle.jdbc.driver.OracleDriver";
        String oraclelUrl ="jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "PawarAR12";

        Connection con = null;
        try {

            //Step 1 :Load Oracle JDBC Driver
            Class.forName(oracleDriver);

            //Step 2:Establish Connection
            con = DriverManager.getConnection(oraclelUrl,username,password);

            //Step 3 Check Connection

            if (con != null) {
                System.out.println("Connection Successful!");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver not found.");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Database connection failed.");
            e.printStackTrace();

        } finally {
            // Step 4: Close Connection
            try {
                if ( con != null) {
                    con.close();
                    System.out.println("Connection Closed.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}





