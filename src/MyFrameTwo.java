import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;

public class MyFrameTwo extends JFrame implements ActionListener{

    JLabel projectname2;

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
        projectname2.setText("Hjärnans Hälsa");
        projectname2.setFont(new Font("Times New Roman", Font.BOLD, 30));
        projectname2.setVerticalAlignment(JLabel.TOP);
        projectname2.setHorizontalAlignment(JLabel.CENTER);
        projectname2.setBounds(120, 50, 350, 550);



        this.add(projectname2);
        this.setVisible(true);




    }
    @Override
	public void actionPerformed(ActionEvent e){
    }
}
