package school_portal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class db 
{
    //database connection
    public static Connection myCon()
    {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/school_system?allowPublicKeyRetrieval=true&useSSL=false";
        String user = "Tshepo";
        String password = "&RWjJH/8A6q$B/B";

        Connection connection = null;
        try
        {
            // Register the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            connection = DriverManager.getConnection(url, user, password);
        }
        catch(ClassNotFoundException | SQLException e) 
        {
            e.printStackTrace();

        }
        finally
        {
            try
            {
                // close connection
                if(connection == null)
                {
                    connection.close();
                }
            }
            catch(SQLException sqe)
            {
                JOptionPane.showMessageDialog(null, "Something went wrong");
            }
        }
        return connection;
    }
}
