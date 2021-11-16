package task4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SwingDemo {

    private int RealMadridCount = 0;
    private int MilanCount = 0;

    SwingDemo() {
        JFrame frame = new JFrame("Football");  //Контейнер (окна) JFrame.
        frame.setSize(300, 200); //Размер окна
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Завершние работы программы при закрытии приложения.
        frame.setVisible(true);

        JButton milanButton = new JButton("AC Milan");
        milanButton.setBounds(140,70,120, 20);

        JButton realMadridButton = new JButton("Real Madrid");
        realMadridButton.setBounds(20,70,120, 20);

        JLabel resultLabel = new JLabel("Result: 0 X 0");
        resultLabel.setBounds(30, 40, 220, 20);
        resultLabel.setVerticalAlignment(JLabel.BOTTOM);
        resultLabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel lastScoreLabel = new JLabel("Last Scorer: N/A");
        lastScoreLabel.setBounds(100, 90, 220, 20);
        lastScoreLabel.setVerticalAlignment(JLabel.CENTER);
        lastScoreLabel.setHorizontalAlignment(JLabel.LEFT);

        JLabel winnerLabel = new JLabel("Winner: DRAW");
        winnerLabel.setBounds(100, 100, 220, 20);
        winnerLabel.setVerticalAlignment(JLabel.CENTER);
        winnerLabel.setHorizontalAlignment(JLabel.LEFT);

        frame.add(milanButton);
        frame.add(realMadridButton);
        frame.add(resultLabel);
        frame.add(lastScoreLabel);
        frame.add(winnerLabel);

        frame.setLayout(null);

        realMadridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RealMadridCount++;
                resultLabel.setText("Result: " + RealMadridCount + " X " + MilanCount);
                lastScoreLabel.setText("Last Scorer: Real Madrid");
                if (RealMadridCount > MilanCount)
                    winnerLabel.setText("Winner: Real Madrid");
                else if (RealMadridCount == MilanCount)
                    winnerLabel.setText("Winner: DRAW");
                else
                    winnerLabel.setText("Winner: AC Milan");
            }
        });

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MilanCount++;
                resultLabel.setText("Result: " + RealMadridCount + " X " + MilanCount);
                lastScoreLabel.setText("Last Scorer: AC Milan");
                if (RealMadridCount > MilanCount)
                    winnerLabel.setText("Winner: Real Madrid");
                else if (RealMadridCount == MilanCount)
                    winnerLabel.setText("Winner: DRAW");
                else
                    winnerLabel.setText("Winner: AC Milan");
            }
        });
    }

    public static void main(String[] args) {
//Создание объекта SwingDemo
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}
