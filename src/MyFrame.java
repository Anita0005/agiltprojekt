import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JPasswordField password;
    JLabel registrationLabel, passwordLabel, userNameLabel, emailLabel;
    JTextField userName, eMail;
    JButton registerButton;
    JCheckBox passwordVisible;

    MyFrame() {
        this.setSize(600, 700);
        this.setTitle("Platform");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        //Frame created.

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
        registrationLabel.setBounds(120, 40, 350, 550);
        //Title created.

        this.add(userNameLabel);
        this.add(userName);
        this.add(password);
        this.add(passwordLabel);
        this.add(registerButton);
        this.add(registrationLabel);
        this.add(emailLabel);
        this.add(eMail);
        this.add(passwordVisible);
        this.setVisible(true);
        //Adds everything to the frame.
	    
	    
	this.setSize(200, 300) ;
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(null);
	this.setVisible(true);    
    }

	@Override
	public void actionPerformed(ActionEvent e) {
        if(e.getSource()== registerButton) {
            String userInput = userName.getText();
            String passInput = new String(password.getPassword());
        }

        if(e.getSource() == passwordVisible) {
            if (password.getEchoChar() == '\0') {
                password.setEchoChar('*');
            } 
            else {
                password.setEchoChar('\0');
            }
        }
		
	}

}
    

