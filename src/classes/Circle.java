/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.Shape;

/**
 *
 * @author Manu_
 */
public class Circle implements Shape{
    
    private double ratio;
    
    public Circle(double aRatio) {
    this.ratio = aRatio;
} 
    
    public double getArea() {
        return Math.PI * Math.pow(ratio, 2);
    }
}
