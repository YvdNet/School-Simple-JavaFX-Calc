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
public class Subtract {
      int deduct(ArrayList<Number> invoer) {
        int total = invoer.get(0).intValue();
        invoer.remove(0);
        for (Number i : invoer) {
            total = total - i.intValue();
        }
        return total;
    }
}