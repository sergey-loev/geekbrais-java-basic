package geekbrains.basic.main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcActionListener implements ActionListener {
    private final JTextField inputField;

    public CalcActionListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = inputField.getText();
        String[] splittedValues;
        int sum = 0;
        double sumD = 0;

        if (text.contains("+")) {
            splittedValues = text.split("\\+");
            sum = Integer.parseInt(splittedValues[0]) + Integer.parseInt(splittedValues[1]);
        } else if (text.contains("-")) {
            splittedValues = text.split("-");
            sum = Integer.parseInt(splittedValues[0]) - Integer.parseInt(splittedValues[1]);
        }else if (text.contains("*")) {
            splittedValues = text.split("\\*");
            sum = Integer.parseInt(splittedValues[0]) * Integer.parseInt(splittedValues[1]);
        }else if (text.contains("/")) {
            splittedValues = text.split("/");
            sumD = (double)Integer.parseInt(splittedValues[0]) / Integer.parseInt(splittedValues[1]);
        }else if (text.contains("^")) {
            splittedValues = text.split("\\^");
            sum = Integer.parseInt(splittedValues[0]);
            for(int i = 1; i < Integer.parseInt(splittedValues[1]); i++){
                sum = sum * Integer.parseInt(splittedValues[0]);
            }
        }

        if (text.contains("/")) inputField.setText(String.valueOf(sumD));
        else inputField.setText(String.valueOf(sum));
    }
}

