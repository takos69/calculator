package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class Main {

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
    JTextField displayFienld = new JTextField(30);


    Main(){
        windowContent = new JPanel();

        //зададим схему размещения элементов
        BorderLayout borderLayout = new BorderLayout();
        windowContent.setLayout(borderLayout);

        //зададим отображение поля
        displayFienld =new JTextField();
        windowContent.add("North", displayFienld);

        //создем панель GridLayout
        JPanel panel = new JPanel();
        GridLayout gridLayout = new GridLayout(4,3);
        panel.setLayout(gridLayout);

        //добавляем все кнопки на эту панель
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button0);
        panel.add(buttonPoint);
        panel.add(buttonEqual);

        //помещаем панаель в центральную область окна
        windowContent.add("Center",panel);

        //создадим frame, который будет отображать графические элементы
        JFrame frame = new JFrame("Калькулятор");
        frame.setContentPane(windowContent);

        //задаем размер окна
        frame.pack();

        //отображаем окно
        frame.setVisible(true);

        Engine engine = new Engine(this);
        button0.addActionListener(engine);
        button1.addActionListener(engine);
        button2.addActionListener(engine);
        button3.addActionListener(engine);
        button4.addActionListener(engine);
        button5.addActionListener(engine);
        button6.addActionListener(engine);
        button7.addActionListener(engine);
        button8.addActionListener(engine);
        button9.addActionListener(engine);
        buttonPoint.addActionListener(engine);
        buttonEqual.addActionListener(engine);
        buttonMinus.addActionListener(engine);
        buttonPlus.addActionListener(engine);
        buttonMultiply.addActionListener(engine);
        buttonDivide.addActionListener(engine);

        //создаем панель для //+ - * /
        JPanel panel2 = new JPanel();
        GridLayout gridLayout2 = new GridLayout(4,1);

        //отображаем на ее кнопки //+ - * /
        panel2.setLayout(gridLayout2);
        panel2.add(buttonPlus);
        panel2.add(buttonMinus);
        panel2.add(buttonDivide);
        panel2.add(buttonMultiply);

        //зададим раположение панели //+ - * /
        windowContent.add("East",panel2);

    }

    public static void main(String[] args) {
        Main calc = new Main();


    }
}
