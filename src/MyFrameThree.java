import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyFrameThree extends JFrame implements ActionListener{

    JLabel AboutUsTitle, projectname3, projectsloga3, introduction, developers;
    JTextArea introduction_text, developers_text;
    JScrollPane scrollPane;

    MyFrameThree() {
        this.setSize(900, 800);
        this.setTitle("Platform");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(202, 236, 252));

        AboutUsTitle = new JLabel();
        AboutUsTitle.setText("About us");
        AboutUsTitle.setFont(new Font("Times New Roman", Font.BOLD, 30));
        AboutUsTitle.setVerticalAlignment(JLabel.TOP);
        AboutUsTitle.setHorizontalAlignment(JLabel.CENTER);
        AboutUsTitle.setBounds(275, 100, 350, 50);

        projectname3 = new JLabel();
        projectname3.setText("The Brains Health");
        projectname3.setFont(new Font("Times New Roman", Font.BOLD, 30));
        projectname3.setVerticalAlignment(JLabel.TOP);
        projectname3.setHorizontalAlignment(JLabel.CENTER);
        projectname3.setBounds(275, 150, 350, 50);

        projectsloga3 = new JLabel();
        projectsloga3.setText("STRENGTHEN YOUR BRAIN, STRENGTHEN YOUR LIFE");
        projectsloga3.setFont(new Font("Times New Roman", Font.BOLD, 10));
        projectsloga3.setVerticalAlignment(JLabel.TOP);
        projectsloga3.setHorizontalAlignment(JLabel.CENTER);
        projectsloga3.setBounds(275, 200, 350, 50);

        introduction = new JLabel();
        introduction.setText("Introduction: ");
        introduction.setFont(new Font("Times New Roman", Font.BOLD, 30));
        introduction.setVerticalAlignment(JLabel.TOP);
        introduction.setHorizontalAlignment(JLabel.CENTER);
        introduction.setBounds(15, 250, 200, 50);

        developers = new JLabel();
        developers.setText("Developers: ");
        developers.setFont(new Font("Times New Roman", Font.BOLD, 30));
        developers.setVerticalAlignment(JLabel.TOP);
        developers.setHorizontalAlignment(JLabel.CENTER);
        developers.setBounds(5, 500, 200, 50);

        introduction_text = new JTextArea();
        introduction_text.setText("Mental health education platform: A web application that provides users with access to articles, videos, and other resources for learning about mental health and \nwellness. The app can include courses, quizzes, and other features to help users build knowledge and skills related to mental health.");
        introduction_text.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        introduction_text.setBackground(new Color(230, 243, 250));
        scrollPane = new JScrollPane(introduction_text);
        scrollPane.setBounds(5, 300, 885, 180);

        developers_text = new JTextArea();
        developers_text.setText("\nAnita Vujica\n\nZakaria Majkouma\n\nMarcelo Alejandro Guajardo Colipi");
        developers_text.setFont(new Font("Times New Roman", Font.BOLD, 22));
        developers_text.setBackground(new Color(230, 243, 250));
        developers_text.setBounds(5, 550, 500, 180);

        

        this.add(AboutUsTitle);
        this.add(projectname3);
        this.add(projectsloga3);
        this.add(introduction);
        this.add(developers);
        this.add(scrollPane);
        this.add(developers_text);
        this.setVisible(true);        

    }
    @Override
	public void actionPerformed(ActionEvent e){

    }

}