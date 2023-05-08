import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args)  {
        MyFrame frame = new MyFrame();
        
        try {
            
        Connection connection =
        DriverManager.getConnection("jdbc:mysql://localhost:3 306/demo","root", "Root123");
        
        Statement statement = connection.createStatement();
            
         
        } catch (Exception e) {
        e.printStackTrace();
        }
    

        
    }
}
