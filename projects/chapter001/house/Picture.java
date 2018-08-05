/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Person alan; 
   
   
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        
        wall = new Square();
        window = new Square();
        roof = new Triangle();
        sun = new Circle();
        alan = new Person(); 
              
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
                Circle circle1 = new Circle();
            circle1.changeSize(500);
            circle1.makeVisible();
            circle1.moveDown();
            circle1.moveLeft();
            circle1.moveLeft();
            circle1.moveVertical(50);
            circle1.moveVertical(10);
            circle1.moveHorizontal(-50);
            circle1.moveHorizontal(-100);
            circle1.changeSize(800);
            circle1.moveHorizontal(-100);
            circle1.moveHorizontal(-50);
            circle1.moveVertical(100);
            circle1.moveVertical(-20);
                Circle circle2 = new Circle();
            circle2.changeSize(800);
            circle2.moveHorizontal(-340);
            circle2.moveVertical(180);
            circle2.changeColor("green");
            circle2.makeVisible();
            circle2.moveVertical(-100);
            circle2.moveVertical(100);
            circle2.moveHorizontal(100);
            circle2.moveHorizontal(-300);
            circle2.moveVertical(-30);
                   
            
            alan.makeVisible();
            alan.moveHorizontal(-400);
            alan.moveVertical(10); 
            
     
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
    
    /**
     * Sunset feature
     */
    public void sunSet()
    {
        sun.slowMoveVertical(5); 
        sun.slowMoveHorizontal(-5); 
        
        sun.slowMoveVertical(10); 
        sun.slowMoveHorizontal(-10); 
        
       
        sun.slowMoveVertical(10); 
        sun.slowMoveHorizontal(-10); 
       
                sun.slowMoveVertical(10); 
        sun.slowMoveHorizontal(-10); 
        
                sun.slowMoveVertical(10); 
        sun.slowMoveHorizontal(-10); 
        
                sun.slowMoveVertical(10); 
        sun.slowMoveHorizontal(-10); 
        
                sun.slowMoveVertical(10); 
        sun.slowMoveHorizontal(-10); 
        
                sun.slowMoveVertical(10); 
        sun.slowMoveHorizontal(-10); 
        
                sun.slowMoveVertical(10); 
        sun.slowMoveHorizontal(-10); 
        
                sun.slowMoveVertical(10); 
        sun.slowMoveHorizontal(-10); 
        
                sun.slowMoveVertical(10); 
        sun.slowMoveHorizontal(-10); 
        
                sun.slowMoveVertical(10); 
        sun.slowMoveHorizontal(-10); 
        
                sun.slowMoveVertical(10); 
        sun.slowMoveHorizontal(-10); 
        
                sun.slowMoveVertical(10); 
        sun.slowMoveHorizontal(-10); 
        sun.changeColor("red");
        
        
                sun.slowMoveVertical(10); 
        sun.slowMoveHorizontal(-10); 
     
        
                sun.slowMoveVertical(10); 
        sun.slowMoveHorizontal(-10); 
        
                
                sun.slowMoveVertical(10); 
        sun.slowMoveHorizontal(-10); 
        
                
                sun.slowMoveVertical(10); 
        sun.slowMoveHorizontal(-10); 
        
                
                        
                sun.slowMoveVertical(10); 
        sun.slowMoveHorizontal(-10);
        
                sun.slowMoveVertical(10); 
        sun.slowMoveHorizontal(-10); 
        
        sun.changeColor("green");
        
        
                alan.makeVisible(); 
        alan.slowMoveHorizontal(250);
      
}

    /**
     * Sunset feature
     */
    public void walker()
    {
        alan.makeVisible(); 
        alan.slowMoveHorizontal(100);
}
} 
