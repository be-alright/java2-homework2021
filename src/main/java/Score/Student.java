package Score;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student extends JFrame {
    private JPanel contentPane;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6,btn7,btn8,btn9,btn10;


    Student() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 550, 300);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout
                (new FlowLayout(FlowLayout.CENTER, 50, 50));
        btn1 = new JButton("Tom");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "You're pass!",
                        "Tom", JOptionPane.PLAIN_MESSAGE);
            }
        });
        contentPane.add(btn1);

        btn2 = new JButton("Andy");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You're pass!",
                        "Andy", JOptionPane.PLAIN_MESSAGE);
            }
        });
        contentPane.add(btn2);

        btn3 = new JButton("Cindy");
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You're pass!",
                        "Cindy!", JOptionPane.PLAIN_MESSAGE);
            }
        });
        contentPane.add(btn3);

        btn4 = new JButton("Jenny");
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You're pass!",
                        "Jenny", JOptionPane.PLAIN_MESSAGE);
            }
        });
        contentPane.add(btn4);

        btn5 = new JButton("Anthony");
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You're pass!",
                        "Anthony", JOptionPane.PLAIN_MESSAGE);
            }
        });
        contentPane.add(btn5);

        btn6 = new JButton("Ivy");
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You're pass!",
                        "Ivy", JOptionPane.PLAIN_MESSAGE);
            }
        });
        contentPane.add(btn6);
        btn7 = new JButton("Oliver");
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You're pass!",
                        "Oliver", JOptionPane.PLAIN_MESSAGE);
            }
        });contentPane.add(btn7);
        btn8 = new JButton("Sofia");
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You're pass!",
                        "Sofia!", JOptionPane.PLAIN_MESSAGE);
            }
        });contentPane.add(btn8);
        btn9 = new JButton("Alice");
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You're pass!",
                        "Alice", JOptionPane.PLAIN_MESSAGE);
            }
        });contentPane.add(btn9);
        btn10 = new JButton("William");
        btn10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You're pass!",
                        "William", JOptionPane.PLAIN_MESSAGE);
            }
        });contentPane.add(btn10);

        setVisible(true);
    }
}

class JOptionPaneDemo {
    public static void main(String[] args){
        Student student= new Student();
    }
}
