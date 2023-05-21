import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
public class MyFrameThree extends JFrame implements ActionListener{

    JLabel AboutUsTitle, projectname3, projectsloga3, introduction, developers, guiTitle, depressionTitle;
    JTextArea introduction_text, developers_text, depression_text, page3_text, page4_text, page5_text;
    JScrollPane scrollPane, scrollPane2, scrollPane3, scrollPane4, scrollPane5;
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
        
        button4 = new JButton("Anxiety");
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

        logOut = new JButton("Sign Out");
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
        //First page created.

        page2 = new JPanel();
        page2.setBounds(0,50,900,680);
        page2.setOpaque(true);
        page2.setLayout(null);
        page2.setBackground(new Color(202, 236, 252));
        layPane.add(page2);

        depressionTitle = new JLabel("Depression");
        depressionTitle.setFont(new Font("Times New Roman", Font.BOLD, 30));
        depressionTitle.setBounds(340,0,150, 30);
        page2.add(depressionTitle);

        depression_text = new JTextArea();
        depression_text.setLineWrap(true);
        depression_text.setWrapStyleWord(true);
        depression_text.setText("\n Depresson is a serious diagnosis that can affect peoples lives in many  different ways. In Sweden approximately 1 out of 10 develop depression  during at some point during their life. This article contains scientific  information about depression, symptoms and factors. \n\n Cause of depression:\n- Genetic factors: The risk of getting depression increases if your parents have or had it.\n - Chemical inbalance in the brain: Lack of serotonin, noradrenaline and dopamine can cause depression.\n - Stress: Stress in life and on regular basis can be a reason.\n\nSymptoms of depression:\n\n - Feeling dejected: Sadness, hopelessness or emptiness that lasts atleast 2  weeks.\n - Decreased interest for loved activities: No desire or feeling to do what  you like. \n - Tirredness: Feeling tirred all day, even after you have slept. \n - Loss of concentration: More dificult to focus, think or make decisions. \n - Changed apetite: Increased or decreased appetite and weight change. \n\n\n Treatment for depression: \n - Psychotherapy: Therapy can help patients to understand their thoughts  and feelings as well as how to deal with their depression. \n - Medicine: Antidepressives can help restore the chemical imbalance in the  brain and decrease the symptoms along with therapy. \n - Electroconvulsive therapy (ECT): ECT is used in rare cases of very deep  depression where other threatment methods haven't had any effect. \n\n\n Sources: \n\n 'Depression' by Maria Faresjö on Netdoktor.se - \n\n\n 'Depression' by Åsa Melin on 1177 Vårdguiden - \n\n\n 'Behandling av depression' by Karin Dahlberg on Läkemedelsverket - \n\n\n");
        depression_text.setEditable(false);
        depression_text.setFont(new Font("Times New Roman", Font.PLAIN,20));
        depression_text.setBackground(new Color(230, 243, 250));
        
        scrollPane2 = new JScrollPane(depression_text);
        scrollPane2.setBounds(120, 50, 620, 540);
        scrollPane2.setHorizontalScrollBar(null);
        scrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        page2.add(scrollPane2);
        //Second page created.


        page3 = new JPanel();
        page3.setBounds(0,50,900,680);
        page3.setOpaque(true);
        page3.setLayout(null);
        page3.setBackground(new Color(202,236,252));

        page3_text = new JTextArea();
        page3_text.setText(""); // Text in Addiction page
        page3_text.setEditable(false);
        page3_text.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        page3_text.setBackground(new Color(230, 243, 250));

        scrollPane3 = new JScrollPane(page3_text);
        scrollPane3.setBounds(120, 50, 620, 540);
        scrollPane3.setHorizontalScrollBar(null);
        scrollPane3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        page3.add(scrollPane3);
        //Page 3 created.

        page4 = new JPanel();
        page4.setBounds(0,50,900,680);
        page4.setOpaque(true);
        page4.setLayout(null);
        page4.setBackground(new Color(202, 236, 252));

        page4_text = new JTextArea();
        page4_text.setText(""); //Text i anxiety rutan
        page4_text.setEditable(false);
        page4_text.setFont(new Font("Times New Roman", Font.PLAIN,20));
        page4_text.setBackground(new Color(230, 243, 250));

        scrollPane4 = new JScrollPane(page4_text);
        scrollPane4.setBounds(120, 50, 620, 540);
        scrollPane4.setHorizontalScrollBar(null);
        scrollPane4.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        page4.add(scrollPane4);

        layPane.add(page4);

        //Page 4 created.

        page5 = new JPanel();
        page5.setBounds(0,50,900,680);
        page5.setOpaque(true);
        page5.setLayout(null);
        page5.setBackground(new Color(202, 236, 252));

        page5_text = new JTextArea();
        page5_text.setText(""); //Text i support-rutan
        page5_text.setEditable(false);
        page5_text.setFont(new Font("Times New Roman", Font.PLAIN,20));
        page5_text.setBackground(new Color(230, 243, 250));

        scrollPane5 = new JScrollPane(page5_text);
        scrollPane5.setBounds(120, 50, 620, 540);
        scrollPane5.setHorizontalScrollBar(null);
        scrollPane5.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        page5.add(scrollPane4);

        layPane.add(page5);
       
        this.add(layPane);
       
        this.add(layPane);
        this.setVisible(true);        

    }
    @Override
	public void actionPerformed(ActionEvent e){

        
        if (e.getSource() == button1) {
            layPane.removeAll();
            layPane.add(page1);
            layPane.repaint();
        }

        if (e.getSource() == button2) {
            layPane.removeAll();
            layPane.add(page2);
            layPane.repaint();
        }

        if (e.getSource() == button3) {
            layPane.removeAll();
            layPane.add(page3);
            layPane.repaint();
        }

        
        if (e.getSource() == button4) {
            layPane.removeAll();
            layPane.add(page4);
            layPane.repaint();
        }

        if (e.getSource() == button5) {
            layPane.removeAll();
            layPane.add(page5);
            layPane.repaint();
        }

        if (e.getSource() == logOut) {
            
            int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?","Sign out", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (option == JOptionPane.YES_OPTION) {
                System.exit(0);
            }



        }


        

    }

}