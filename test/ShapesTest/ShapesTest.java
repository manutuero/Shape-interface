package ShapesTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import classes.Circle;
import classes.Rectangle;
import classes.Triangle;
import interfaces.Shape;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Manu_
 */
public class ShapesTest {
    
    @Test
    public void getArea_fromACircleWithPositiveRadio_returnAnPositiveArea() {
    
        Shape aShape = new Circle(1);
        
        assertEquals(Math.PI,aShape.getArea(),1);
    }
    
    @Test
    public void getArea_fromARectangleWithBaseAndHeightPositive_returnAnPositiveArea() {
    
        Shape aShape = new Rectangle(2,4);
        
        assertEquals(8,aShape.getArea(),2);       
    }
    
    @Test
    public void getArea_fromATriangleWithBaseAndWeightPositive_returnAnPositiveArea() {
    
        Shape aShape = new Triangle(3,6);
        
        assertEquals(9,aShape.getArea(),2);       
    }
}
