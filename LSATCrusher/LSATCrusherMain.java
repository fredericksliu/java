

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LSATCrusherMain extends JFrame {

    JFrame frame = new JFrame("My LSAT Crusher");
    JLabel MainLabel = new JLabel("MY LSAT CRUSHER!");
    Font font = new Font("AppleGothic", Font.BOLD, 14);
    Font fontmain = new Font("AppleMyungjo", Font.BOLD, 30);
    Font fontRC = new Font("AppleGothic", Font.BOLD, 10);
    JButton LSATLRButton = new JButton("Logical Reasoning");
    JButton LSATLGButton = new JButton("Logical Games");
    JButton LSATRCButton = new JButton("Reading Comprehension");


    public LSATCrusherMain() {

        LSATRCButton.setBounds(180,250,120,30);
        LSATRCButton.setFont(fontRC);
        LSATRCButton.setBorder(new LineBorder(Color.BLACK));
        LSATRCButton.setContentAreaFilled(false);

        LSATRCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new LSATRC();
            }
        });

        LSATRCButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LSATRCButton.setContentAreaFilled(true);
                LSATRCButton.setBackground(Color.lightGray);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LSATRCButton.setContentAreaFilled(false);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                LSATRCButton.setBackground(Color.GRAY);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LSATRCButton.setBackground(Color.lightGray);
            }
        });

        LSATLGButton.setBounds(180,200,120,30);
        LSATLGButton.setFont(font);
        LSATLGButton.setBorder(new LineBorder(Color.BLACK));
        LSATLGButton.setContentAreaFilled(false);

        LSATLGButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new LSATLG();
            }
        });

        LSATLGButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LSATLGButton.setContentAreaFilled(true);
                LSATLGButton.setBackground(Color.lightGray);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LSATLGButton.setContentAreaFilled(false);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                LSATLGButton.setBackground(Color.GRAY);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LSATLGButton.setBackground(Color.lightGray);
            }
        });

        LSATLRButton.setBounds(180,300,120,30);
        LSATLRButton.setFont(font);
        LSATLRButton.setBorder(new LineBorder(Color.BLACK));
        LSATLRButton.setContentAreaFilled(false);

        LSATLRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new LSATLR();
            }
        });

        LSATLRButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LSATLRButton.setContentAreaFilled(true);
                LSATLRButton.setBackground(Color.lightGray);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LSATLRButton.setContentAreaFilled(false);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                LSATLRButton.setBackground(Color.GRAY);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LSATLRButton.setBackground(Color.lightGray);
            }
        });

        MainLabel.setBounds(100,5,400,120);
        MainLabel.setFont(fontmain);

        frame.add(LSATRCButton);
        frame.add(MainLabel);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(LSATLGButton);
        frame.add(LSATLRButton);

    }


}
