import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyFrameThree extends JFrame implements ActionListener{

    JLabel AboutUsTitle, projectname3, projectsloga3, introduction, developers, guiTitle;
    JTextArea introduction_text, developers_text;
    JScrollPane scrollPane;
    JLayeredPane layPane;
    JButton button1, button2, button3, button4, button5, button6, logOut;
    JPanel menu, page1, page2, page3, page4, page5, page6;

    MyFrameThree() {
        this.setSize(900, 800);
        this.setTitle("The Brains Health");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(202, 236, 252));

        menu = new JPanel();
        menu.setBounds(0,0,900,120);
        menu.setBackground(Color.WHITE);
        menu.setOpaque(true);
        menu.setLayout(null);
        this.add(menu);

        guiTitle = new JLabel("The Brains Health");
        guiTitle.setBounds(280,7,300,30);
        guiTitle.setFont(new Font("Times New Roman", Font.BOLD, 30));
        menu.add(guiTitle);
        //Menu created.

        button1 = new JButton("About Us");
        button1.setBounds(10,55, 110, 35);
        button1.setFont(new Font("Times New Roman", Font.BOLD, 17));
        button1.setContentAreaFilled(false);
        button1.setFocusPainted(false);
        button1.addActionListener(this);
        menu.add(button1);

        button2 = new JButton("Depression");
        button2.setBounds(125,55,130,35);
        button2.setFont(new Font("Times New Roman", Font.BOLD, 17));
        button2.setContentAreaFilled(false);
        button2.setFocusPainted(false);
        button2.addActionListener(this);
        menu.add(button2);

        button3 = new JButton("Addiction");
        button3.setBounds(260,55,130, 35);
        button3.setFont(new Font("Times New Roman", Font.BOLD, 17));
        button3.setContentAreaFilled(false);
        button3.setFocusPainted(false);
        button3.addActionListener(this);
        menu.add(button3);
        
        button4 = new JButton("PTSD");
        button4.setBounds(395,55,100,35);
        button4.setFont(new Font("Times New Roman", Font.BOLD, 17));
        button4.setContentAreaFilled(false);
        button4.setFocusPainted(false);
        button4.addActionListener(this);
        menu.add(button4);

        button5 = new JButton("Support");
        button5.setBounds(500, 55,100, 35);
        button5.setFont(new Font("Times New Roman", Font.BOLD, 17));
        button5.setContentAreaFilled(false);
        button5.setFocusPainted(false);
        button5.addActionListener(this);
        menu.add(button5);

        button6 = new JButton("Journal");
        button6.setBounds(605, 55, 100, 35);
        button6.setFont(new Font("Times New Roman", Font.BOLD, 17));
        button6.setContentAreaFilled(false);
        button6.setFocusPainted(false);
        button6.addActionListener(this);
        menu.add(button6);

        logOut = new JButton("Log Out");
        logOut.setBounds(780, 55, 100, 35);
        logOut.setFont(new Font("Times New Roman", Font.BOLD, 17));
        logOut.setContentAreaFilled(true);
        logOut.setFocusPainted(false);
        logOut.addActionListener(this);
        menu.add(logOut);
        //Menu buttons created.
        //------------------------

        layPane = new JLayeredPane();
        layPane.setBounds(0,120,900,680);
        

        page1 = new JPanel();
        page1.setBounds(0,50,900,680);
        page1.setOpaque(true);
        page1.setLayout(null);
        page1.setBackground(new Color(202, 236, 252));
        layPane.add(page1);

        
        AboutUsTitle = new JLabel("About Us");
        AboutUsTitle.setBounds(355, 0, 200, 30);
        AboutUsTitle.setFont(new Font("Times New Roman", Font.BOLD, 30));
        page1.add(AboutUsTitle);

        
        introduction = new JLabel();
        introduction.setText("Introduction");
        introduction.setFont(new Font("Times New Roman", Font.BOLD, 30));
        introduction.setBounds(15, 80, 200, 30);
        page1.add(introduction);

        developers = new JLabel();
        developers.setText("Developers");
        developers.setFont(new Font("Times New Roman", Font.BOLD, 30));
        developers.setBounds(15, 290, 200, 50);
        page1.add(developers);

        String text = "Welcome to The Brains Health, a web application that provides users with access to articles, videos, and other resources for learning about mental health and \nwellness. The app can include courses, quizzes, and other features to help users build knowledge and skills related to mental health.";
        introduction_text = new JTextArea(text);
        introduction_text.setEditable(false);
        introduction_text.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        scrollPane = new JScrollPane(introduction_text);
        introduction_text.setBackground(new Color(230, 243, 250));
        scrollPane.setBounds(20, 130, 800, 150);
        page1.add(scrollPane);

        String text2 = "\nAnita Vujica\nZakaria Majkouma\nMarcelo Alejandro Guajardo Colipi";
        developers_text = new JTextArea(text2);
        developers_text.setEditable(false);
        developers_text.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        developers_text.setBackground(new Color(230, 243, 250));
        developers_text.setBounds(20, 350, 350, 150);
        page1.add(developers_text);

       
        this.add(layPane);
        this.setVisible(true);        

    }
    @Override
	public void actionPerformed(ActionEvent e){

    }

}