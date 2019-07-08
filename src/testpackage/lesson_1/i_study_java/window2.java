package testpackage.lesson_1.i_study_java;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class window2 extends window1 {

    /**set all components */
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonPoint = new JButton(".");
    JButton buttonEqual = new JButton("=");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonDivide = new JButton("/");
    JButton buttonMultiply = new JButton("*");
    JPanel windowContent = new JPanel();
    JTextField displayField = new JTextField(35);

    /**create the constructor: */
    window2() {
        /**set the layout manager*/
        BorderLayout b1 = new BorderLayout();
        windowContent.setLayout(b1);
        windowContent.add("North", displayField);

        /**create a panel p1 with buttons using GridLayout*/
        JPanel p1 = new JPanel();
        GridLayout g1 = new GridLayout(4, 3);
        p1.setLayout(g1);
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(button0);
        p1.add(buttonPoint);
        p1.add(buttonEqual);
        /**add panel p1 to the center of the frame*/
        windowContent.add("Center", p1);
        /**create a panel p2 with buttons using GridLayout*/
        JPanel p2 = new JPanel();
        GridLayout g2 = new GridLayout(4, 1);
        p2.setLayout(g2);
        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonMultiply);
        p2.add(buttonDivide);
        /**add panel p2 to the right side of the frame*/
        windowContent.add("East", p2);

        /**create frame and set its main panel (add everything to it)*/
        JFrame frame = new JFrame("Я - калькулятор. Испытай меня!");
        frame.setContentPane(windowContent);

        /**adjust the frame size to include all components and set it visible*/
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        /**create an ActionListener Object (see the CalculatorEngine class) and register it for every button*/
        CalculatorEngine calcEngine = new CalculatorEngine(this);
        button0.addActionListener(calcEngine);
        button1.addActionListener(calcEngine);
        button2.addActionListener(calcEngine);
        button3.addActionListener(calcEngine);
        button4.addActionListener(calcEngine);
        button5.addActionListener(calcEngine);
        button6.addActionListener(calcEngine);
        button7.addActionListener(calcEngine);
        button8.addActionListener(calcEngine);
        button9.addActionListener(calcEngine);
        buttonPoint.addActionListener(calcEngine);
        buttonPlus.addActionListener(calcEngine);
        buttonMinus.addActionListener(calcEngine);
        buttonDivide.addActionListener(calcEngine);
        buttonMultiply.addActionListener(calcEngine);
        buttonEqual.addActionListener(calcEngine);
    }  //constructor test_calc3
}  //public class test_calc3
