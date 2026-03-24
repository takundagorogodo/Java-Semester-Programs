
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTest {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "1234"
            );

            System.out.println("Connected Successfully!");
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
