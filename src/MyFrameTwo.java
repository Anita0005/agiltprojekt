import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;

public class MyFrameTwo extends JFrame implements ActionListener{


    MyFrameTwo() {
        this.setSize(600, 700);
        this.setTitle("Platform");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        //Frame created.
    }
    @Override
	public void actionPerformed(ActionEvent e){
    }
}
