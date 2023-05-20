import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;

public class MyFrameThree extends JFrame implements ActionListener{

    MyFrameThree() {
        this.setSize(600, 700);
        this.setTitle("Platform");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(202, 236, 252));

    }
    @Override
	public void actionPerformed(ActionEvent e){

    }

}