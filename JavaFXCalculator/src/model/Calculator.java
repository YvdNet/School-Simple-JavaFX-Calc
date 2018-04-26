/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Laptop2
 */
public class Calculator {

    ArrayList<Number> invoer = new ArrayList<>();

    int operator = 0;

    public Answer setNumber(int number) {
        Answer answer = new Answer();

        if (invoer.isEmpty()) {
            invoer.add(number);
            answer.setValue(number);
        } else {
            int tmp = invoer.get(invoer.size() - 1).intValue();
            invoer.set(invoer.size() - 1, tmp * 10 + number);
            answer.setValue(tmp * 10 + number);
        }

        return answer;
    }

    public Answer count() {
        invoer.add(0);

        operator = 1;
        return new Reset();

    }

    public Answer divide() {
        invoer.add(0);

        operator = 2;
        return new Reset();
    }

    public Answer deduct() {
        invoer.add(0);

        operator = 3;
        return new Reset();
    }

    public Answer multiply() {
        invoer.add(0);

        operator = 4;
        return new Reset();
    }

    public Answer answer() {
        Result result = new Result();
        switch (operator) {
            case 1:
                CountUp countUp = new CountUp();
                result.has(countUp.count(invoer));
                break;
            case 2:
                Divide divide = new Divide();
                result.has(divide.divide(invoer));
                break;
            case 3:
                Subtract deduct = new Subtract();
                result.has(deduct.deduct(invoer));
                break;
            case 4:
                Multiply multiply = new Multiply();
                result.has(multiply.multiply(invoer));
                break;

        }
        invoer.clear();
        return result;
    }

}
