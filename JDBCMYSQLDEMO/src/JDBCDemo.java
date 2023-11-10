//import java.sql.DriverManager;
import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "root";
        //REGISTER THE DRIVERS
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //MAKING THE CONNECTION
            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from student");

            while(resultSet.next())
            {
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3));
            }

            connection.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
