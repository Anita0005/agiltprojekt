import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MyFrame extends JFrame implements ActionListener{

    JPasswordField password;
    JLabel registrationLabel, passwordLabel, userNameLabel, emailLabel, projectname, projectsloga;
    JTextField userName, eMail;
    JButton registerButton;
    JCheckBox passwordVisible;

    MyFrame() {
        this.setSize(600, 700);
        this.setTitle("Platform");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
	    this.getContentPane().setBackground(new Color(202, 236, 252));
        //Frame created. 22222

        userNameLabel = new JLabel("Username");
        userNameLabel.setBounds(100, 200, 100, 40);
        userName = new JTextField();
        userName.setBounds(170, 200, 300, 40);
        userName.setFont(new Font("Roboto", Font.PLAIN, 15));
        //Username field created.

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(100, 300, 100, 40);
        password = new JPasswordField();
        password.setBounds(170, 300, 300, 40);
        password.setFont(new Font("Roboto", Font.PLAIN, 15));
	    password.setToolTipText("password must be at least 8 characters");
        //Password field created.

        passwordVisible = new JCheckBox("Show password");
        passwordVisible.setBounds(170, 340, 500, 30);
        passwordVisible.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        passwordVisible.addActionListener(this);
	    passwordVisible.setBackground(new Color(202, 236, 252));
        //If user want to se password.

        emailLabel = new JLabel("Email");
        emailLabel.setBounds(100, 400, 300, 40);
        eMail = new JTextField();
        eMail.setBounds(170, 400, 300, 40);
        eMail.setFont(new Font("Roboto,", Font.PLAIN, 15));
        //Email field created.

        registerButton = new JButton("Sign in");
        registerButton.setBounds(170, 500, 90, 30);
        registerButton.addActionListener(this);
        //Sign in button is created

        registrationLabel = new JLabel();
        registrationLabel.setText("Registration");
        registrationLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        registrationLabel.setVerticalAlignment(JLabel.TOP);
        registrationLabel.setHorizontalAlignment(JLabel.CENTER);
        registrationLabel.setBounds(120, 130, 350, 550);
        //Title created.

        projectname = new JLabel();
        projectname.setText("Hjärnans Hälsa");
        projectname.setFont(new Font("Times New Roman", Font.BOLD, 30));
        projectname.setVerticalAlignment(JLabel.TOP);
        projectname.setHorizontalAlignment(JLabel.CENTER);
        projectname.setBounds(120, 50, 350, 550);

        projectsloga = new JLabel();
        projectsloga.setText("STÄRK DIN HJÄRNA, STÄRK DITT LIV");
        projectsloga.setFont(new Font("Times New Roman", Font.BOLD, 10));
        projectsloga.setVerticalAlignment(JLabel.TOP);
        projectsloga.setHorizontalAlignment(JLabel.CENTER);
        projectsloga.setBounds(120, 85, 350, 550);

        this.add(userNameLabel);
        this.add(userName);
        this.add(password);
        this.add(passwordLabel);
        this.add(registerButton);
        this.add(registrationLabel);
        this.add(projectname);
        this.add(projectsloga);
        this.add(emailLabel);
        this.add(eMail);
        this.add(passwordVisible);
        this.setVisible(true);
        //Adds everything to the frame.
	     
    }

	@Override
	public void actionPerformed(ActionEvent e) {
    
    if (e.getSource() == registerButton) {

        String userinput = new String(userName.getText());
        String password_input = new String(password.getPassword());
        String email_input = new String(eMail.getText());

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javagui", "root", "Root123");
            String query = "INSERT into user_info values('" + userinput + "','" + password_input + "','" + email_input + "')";
            Statement statement = connection.createStatement();
            int insert = statement.executeUpdate(query);


        } catch (Exception exception) {

            exception.printStackTrace();
            
        }

        this.dispose();
        MyFrameTwo frametwo = new MyFrameTwo();
        }
    }

}






















//         String name = new String(userName.getText());
// 	    String passWord = new String(password.getPassword());
// 		String emailadress = new String(eMail.getText());
        
		
// 		try {
//             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/grupp17", "root", "password");
            
//             if(e.getSource() == registerButton) {
//                 String query = "INSERT INTO user VALUES('"+ name +"','" + passWord + "','"+ emailadress +"')";
//                 Statement statement = connection.createStatement();
//                 int ins = statement.executeUpdate(query);
							    
// 	        }
//             } catch(Exception exception){
// 		         exception.printStackTrace();
		
// 	    }	

    
		
// 	}
// }



// if(e.getSource() == passwordVisible) {
//     if (password.getEchoChar() == '\0') {
//         password.setEchoChar('*');
//     } 
//     else {
//         password.setEchoChar('\0');
//     }
// }           