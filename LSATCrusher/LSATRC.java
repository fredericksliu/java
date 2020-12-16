

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LSATRC extends JFrame implements ActionListener, MouseListener {
    protected JLabel Welcome = new JLabel();
    protected JTextArea userInputText = new JTextArea("", 10, 10);
    protected JButton checkQuestionType = new JButton();
    protected JButton Reset = new JButton();
    protected JLabel QuestionType = new JLabel();
    protected JLabel Creator = new JLabel();
    protected  JLabel Approach = new JLabel();
    protected JButton Exit = new JButton();

    public LSATRC(){
        JFrame frame = new JFrame("Reading Comprehension");
        Font font = new Font("AppleGothic", Font.BOLD, 14);

        Font createrfont = new Font("AppleGothic", Font.ITALIC, 10);
        Creator.setText("Created by Frederick Liu, more features to come...");
        Creator.setBounds(240,460,300,20);
        Creator.setFont(createrfont);

        Welcome.setText("Check your LSAT Reading Comprehension Question Type: ");
        Welcome.setBounds(30,30,400,30);
        Welcome.setFont(font);

        userInputText.setBounds(100,80,300,200);
        userInputText.setBorder(new TitledBorder(new EtchedBorder(), "Question: "));
        userInputText.setLineWrap(true);
        userInputText.setWrapStyleWord(true);
        userInputText.setToolTipText("Please enter your LSAT Reading Comprehension Question");
        userInputText.setFont(font);

        checkQuestionType.setBounds(100,300,120,30);
        checkQuestionType.addActionListener(this);
        checkQuestionType.setText("Check now!");
        checkQuestionType.setFont(font);
        checkQuestionType.setContentAreaFilled(false);
        checkQuestionType.setBorder(new LineBorder(Color.BLACK));
        checkQuestionType.addMouseListener(this);

        QuestionType.setText("Question Type: ");
        QuestionType.setBounds(20,330,400,60);
        QuestionType.setFont(font);

        Approach.setText("Approach: ");
        Approach.setBounds(20,370,450,100);
        Approach.setFont(font);

        Reset.setText("Reset");
        Reset.setBounds(250,300,120,30);
        Reset.setFont(font);
        Reset.setBorder(new LineBorder(Color.BLACK));
        Reset.setContentAreaFilled(false);
        Reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Reset.setContentAreaFilled(true);
                Reset.setBackground(Color.lightGray);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Reset.setContentAreaFilled(false);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                Reset.setBackground(Color.GRAY);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Reset.setBackground(Color.lightGray);
            }
        });
        Reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userInputText.setText("");
                checkQuestionType.setText("Check now!");
                QuestionType.setText("Question Type: ");
                Approach.setText("Approach: ");
            }
        });


        Exit.setText("Menu");
        Exit.setBounds(420,10,50,30);
        Exit.setFont(font);
        Exit.setBorder(new LineBorder(Color.BLACK));
        Exit.setContentAreaFilled(false);
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Exit.setContentAreaFilled(true);
                Exit.setBackground(Color.lightGray);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Exit.setContentAreaFilled(false);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                Exit.setBackground(Color.GRAY);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Exit.setBackground(Color.lightGray);
            }
        });
        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new LSATCrusherMain();
            }
        });

        frame.add(Exit);
        frame.add(Approach);
        frame.add(Creator);
        frame.add(Welcome);
        frame.add(checkQuestionType);
        frame.add(userInputText);
        frame.add(QuestionType);
        frame.add(Reset);


        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }









    @Override
    public void actionPerformed(ActionEvent e) {


//ALL LOGISTICS


    }

    @Override
    public void mouseClicked(MouseEvent e) { }

    @Override
    public void mousePressed(MouseEvent e) {
        checkQuestionType.setBackground(Color.GRAY);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        checkQuestionType.setBackground(Color.lightGray);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        checkQuestionType.setContentAreaFilled(true);
        checkQuestionType.setBackground(Color.lightGray);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        checkQuestionType.setContentAreaFilled(false);
    }
}
