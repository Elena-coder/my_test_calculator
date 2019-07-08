package testpackage.lesson_1.i_study_java;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**create the logic of the calculator using the methods of CalculatorEngine class*/
public class CalculatorEngine implements ActionListener {
    window2 parent;          //link to the calculator field
    char selectedAction = ' ';  // +, -, /, or *
    double currentResult = 0;

    /**create the constructor which stores the link to the calculator field in the class object*/
    CalculatorEngine(window2 parent) {
        this.parent = parent;
    }

    public void actionPerformed(ActionEvent e) {
        /**get the action source*/
        JButton clickedButton = (JButton) e.getSource();
        String dispFieldText=parent.displayField.getText();
        double displayValue = 0;
        /**get the number from the calculator display if it is not empty*/
        if (!"".equals(dispFieldText)) {
            displayValue = Double.parseDouble(dispFieldText);
        }
        Object src = e.getSource();

        /**remember the action for every action button (+, -, / or *),
         *save current number to the currentResult variable
         *and empty the display field*/

        if (src == parent.buttonPlus) {
            selectedAction = '+';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonMinus) {
            selectedAction = '-';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonDivide) {
            selectedAction = '/';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonMultiply) {
            selectedAction = '*';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonEqual) {

            /** perform the corresponding arithmetic action,
             * update the currentResult variable
             * and show the result on the display*/
            if (selectedAction == '+') {
                currentResult += displayValue;

                /**convert the current result into string, add to the null string and show*/
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '-') {
                currentResult -= displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '/') {
                currentResult /= displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '*') {
                currentResult *= displayValue;
                parent.displayField.setText("" + currentResult);
            }
        } else {
            /** the add the button's number to the value displayed for every numerical button*/
            String clickedButtonLabel = clickedButton.getText();
            parent.displayField.setText(dispFieldText +
                    clickedButtonLabel);

        }
    }  //method actionPerformed
} //public class CalculatorEngine