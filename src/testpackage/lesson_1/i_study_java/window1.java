package testpackage.lesson_1.i_study_java;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class window1 extends JFrame {
    private JButton button1 = new JButton("Нажми сюда");
    private JLabel label = new JLabel("    Как твое настроение?");
    private JCheckBox checkBox1 = new JCheckBox("Хочу потестировать калькулятор", false);
    private JTextField input = new JTextField("", 5);

    public window1 () {
        super("Сверим часы");

        this.setBounds(100, 100, 280, 150);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(4, 1, 2, 2));
        container.add(label);
        container.add(input);
        container.add(checkBox1);
        button1.addActionListener(new ButtonEventListener());
        container.add(button1);
    } //constructor window1

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Настроение " + input.getText() + "\n";
            message += "Желание потестировать калькулятор " + ((checkBox1.isSelected())?
                    "есть!\nТогда смело вводи цифру 2 в консоль!" :
                    "отсутствует(((\nТогда можешь ничего не вводить в консоль и просто нажать Enter");
            JOptionPane.showMessageDialog(null, message, "А вот и результат:", JOptionPane.PLAIN_MESSAGE);
        } //actionPerformed
    } //class ButtonEventListener
} //class window1
