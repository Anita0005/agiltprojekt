public class Main {
    public static void main(String[] args)  {
        MyFrame frame = new MyFrame();
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.Statement;
        import java.sql.ResultSet;
        
        public static void main(String[] args)  {
        
        try {
            
            Connection connection =
        DriverManager.getConnection("jdbc:mysql://localhost:3 306/demo","root", "Root123");
        
        Statement statement = connection.createStatement();
            
        System.out.printIn(resultSet.getString("firstname"));
        
        }
         
        } catch (Exceprion e) {
            e.printStackTrace();
        }
    }
}
