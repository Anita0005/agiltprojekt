import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;

public class MyFrameTwo extends JFrame implements ActionListener{

    JLabel projectname2, projectsloga2, registration_successful, question, image;
    JPanel register_message;
    JButton next,exit;
    ImageIcon icon;

    MyFrameTwo() {
        this.setSize(600, 700);
        this.setTitle("Platform");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(202, 236, 252));
        //Frame created.

        projectname2 = new JLabel();
        projectname2.setText("The Brains Health");
        projectname2.setFont(new Font("Times New Roman", Font.BOLD, 30));
        projectname2.setVerticalAlignment(JLabel.TOP);
        projectname2.setHorizontalAlignment(JLabel.CENTER);
        projectname2.setBounds(120, 50, 350, 550);

        projectsloga2 = new JLabel();
        projectsloga2.setText("STRENGTHEN YOUR BRAIN, STRENGTHEN YOUR LIFE");
        projectsloga2.setFont(new Font("Times New Roman", Font.BOLD, 10));
        projectsloga2.setVerticalAlignment(JLabel.TOP);
        projectsloga2.setHorizontalAlignment(JLabel.CENTER);
        projectsloga2.setBounds(120, 85, 350, 550);

        register_message = new JPanel();
        register_message.setLayout(null);
        register_message.setBackground(new Color(230, 243, 250));
        register_message.setBounds(120,200,350,370);

        registration_successful = new JLabel("Registration successful!");
        registration_successful.setBounds(66,30,350,40);
        registration_successful.setFont(new Font("Times New Roman", Font.BOLD, 22));
        register_message.add(registration_successful);

        question = new JLabel();
        question.setText("Do you wish to continue?");
        question.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        question.setBounds(85, 200, 370, 40);
        register_message.add(question);

        // icon = new ImageIcon("icon.png");
        // image = new JLabel(icon);
        // image.setSize(100, 100);
        // register_message.add(image);

        next = new JButton("Next");
        next.setBounds(133,250,90,30);
        next.addActionListener(this);
        register_message.add(next);

        exit = new JButton("Exit");
        exit.setBounds(133,300,90,30);
        exit.addActionListener(this);
        register_message.add(exit);


        this.add(register_message);
        this.add(projectname2);
        this.add(projectsloga2);

        this.setVisible(true);


    }
    @Override
	public void actionPerformed(ActionEvent e){
    

    if (e.getSource() == next) {

        this.dispose();
        MyFrameThree framethree = new MyFrameThree();
        }

    if (e.getSource() == exit) {
        System.exit(0);
    }
    }

}
