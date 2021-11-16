package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonStylesTest extends JFrame {
    int jta1 = 0;
    int jta2 = 0;
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    JButton button3 = new JButton("Result");
    final JLabel label1 = new JLabel("Result: " + jta1 + " X "+ jta2);
    final JLabel label2 = new JLabel("Last Scorer: N/A");
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    ButtonStylesTest()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,150);

        add(label1);

        add(label2);

        add(button1);
        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    jta1++;
                    label1.setText(String.valueOf("Result: " + jta1 + " X "+ jta2));
                    label2.setText(String.valueOf("AC Milan"));
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(button2);
        button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    jta2++;
                    label1.setText(String.valueOf("Result: " + jta1 + " X "+ jta2));
                    label2.setText(String.valueOf("Real Madrid "));
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(button3);
        button3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    if (jta1 > jta2)
                        JOptionPane.showMessageDialog(null, "Winner: AC Milan"+jta1,"Alert",JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, "Winner: Real Madrid"+jta2,"Alert",JOptionPane.INFORMATION_MESSAGE);

                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }

}
