package geekbrains.basic.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame {
    public CalculatorFrame() {
        setTitle("Calculator v1.0");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(150, 50, 400, 500);
        setLayout(new BorderLayout());

        JTextField inputField = new JTextField();
        add(inputField, BorderLayout.NORTH);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(6, 3));
        add(bottomPanel, BorderLayout.CENTER);

        DigitButtonActionListener digitButtonActionListener = new DigitButtonActionListener(inputField);
        for (int i = 0; i <= 8; i++) {
            JButton jButton = new JButton(String.valueOf(i+1));
            jButton.addActionListener(digitButtonActionListener);
            bottomPanel.add(jButton);
        }


        JButton plus = new JButton("+");
        plus.addActionListener(digitButtonActionListener);
        bottomPanel.add(plus);

        JButton jButton = new JButton(String.valueOf(0));
        jButton.addActionListener(digitButtonActionListener);
        bottomPanel.add(jButton);

        JButton minus = new JButton("-");
        minus.addActionListener(digitButtonActionListener);
        bottomPanel.add(minus);

        JButton multiplication = new JButton("*");
        multiplication.addActionListener(digitButtonActionListener);
        bottomPanel.add(multiplication);

        JButton division = new JButton("/");
        division.addActionListener(digitButtonActionListener);
        bottomPanel.add(division);

        JButton square = new JButton("^2");
        square.addActionListener(digitButtonActionListener);
        bottomPanel.add(square);


        JButton calc = new JButton("=");
        calc.addActionListener(new CalcActionListener(inputField));
        bottomPanel.add(calc);

        JButton clear = new JButton("C");
        ActionListener clearAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
            }
        };

        clear.addActionListener(clearAction);
        bottomPanel.add(clear);

        JButton na = new JButton("N\\A");
        bottomPanel.add(na);



        setVisible(true);
    }
}
