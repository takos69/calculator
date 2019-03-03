package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Engine implements ActionListener {
    Main parent;
    char selectedAction = ' ';
    double currentResult = 0;

    Engine(Main parent){
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        // Получаем Источник текущего события (действия).
        // Приводим Источник текущего события (действия) e.getSource() типа Object к типу JButton.
        // И передаем приведенный к типу JButton Источник события переменной clickedButton JButton.
        // Только после этого можно использовать метод getText().

        String displayFienld = parent.displayFienld.getText();
        // Получаем текущего Текст из Текстового поля(находящиеся в нем данные).

        double displayValue = 0.0;

        if (!"".equals(displayFienld)){
            displayValue = Double.parseDouble(displayFienld);
            // Получаем число из дисплея калькулятора, если он не пустой.
        }

        Object src = e.getSource();
        // Для каждого дествия сохраним текущее состояние в переменной currentResult

        if (src == parent.buttonPlus){
            selectedAction = '+';
            currentResult = displayValue;
            parent.displayFienld.setText("");

        } else if (src == parent.buttonMinus){
            selectedAction = '-';
            currentResult = displayValue;
            parent.displayFienld.setText("");

        } else if (src == parent.buttonMultiply){
            selectedAction = '*';
            currentResult = displayValue;
            parent.displayFienld.setText("");

        } else if (src == parent.buttonDivide){
            selectedAction = '/';
            currentResult = displayValue;
            parent.displayFienld.setText("");

        } else if (src == parent.buttonEqual){

            //совешаем арифметическое дествие обновляем currentResult и выводим результат на экран

            if (selectedAction == '+'){
                currentResult += displayValue;
                parent.displayFienld.setText("" + currentResult);

                //сконвентируем результат в строку, добавляем к пустой строке и вывыдим ее

            } else if (selectedAction == '-'){
                currentResult -= displayValue;
                parent.displayFienld.setText("" + currentResult);

            } else if (selectedAction == '*'){
                currentResult *= displayValue;
                parent.displayFienld.setText("" + currentResult);

            } else if (selectedAction == '/'){
                currentResult /= displayValue;
                parent.displayFienld.setText("" + currentResult);
            }
        } else{
            String clickedButtonLabel = clickedButton.getText();
            parent.displayFienld.setText(displayFienld + clickedButtonLabel);
            // получаем надпись с кнопки, соединяем ее с текстом в текстовом поле и передаем его в Текстовое поле через parent
        }


    }
}

