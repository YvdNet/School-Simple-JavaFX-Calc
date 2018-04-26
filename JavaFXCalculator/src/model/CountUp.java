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
public class CountUp {
      int count(ArrayList<Number> invoer) {
        int total = 0;
        for (Number i : invoer) {
            total = total + i.intValue();
        }
        return total;
    }
}