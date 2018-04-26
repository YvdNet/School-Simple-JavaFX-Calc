/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Laptop2
 */
public class Answer {

    private int value;
    int getValue() {
        return this.value;
    }
  
    void setValue(int value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return "" + this.value;
    }
}
