
import java.sql.*;
import java.sql.DriverManager;

public class JDBCCrudDemo {

    public static void main(String[] args) {

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "1234"
            );

            // 3. INSERT
            PreparedStatement ps1 =
                con.prepareStatement("INSERT INTO student VALUES (?, ?, ?)");
            ps1.setInt(1, 18);
            ps1.setString(2, "godaz imim Vikrant");
            ps1.setInt(3, 24);
            ps1.executeUpdate();

            // 4. SELECT
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            System.out.println("ID  NAME   AGE");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + "  " +
                    rs.getString("name") + "  " +
                    rs.getInt("age")
                );
            }

            // 5. UPDATE
            PreparedStatement ps2 =
                con.prepareStatement("UPDATE student SET age=? WHERE id=?");
            ps2.setInt(1, 23);
            ps2.setInt(2, 3);
            ps2.executeUpdate();

            // 6. DELETE
            PreparedStatement ps3 =
                con.prepareStatement("DELETE FROM student WHERE id=?");
            ps3.setInt(1, 3);
            ps3.executeUpdate();

            // 7. Close Connection
            con.close();
            System.out.println("JDBC Operations Completed Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}