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
public class Triangle implements Shape {
    
    //attributes
    private double base;

    private double height;
    
    //methods
    public Triangle(double base, double height) {
        
        this.base = base;
        
        this.height = height;
    }
    
    public double getArea() {
        return (this.base * this.height)/2;
    }
}
