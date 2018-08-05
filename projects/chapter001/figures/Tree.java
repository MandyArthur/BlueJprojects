
/**
 * Create a simple tree c;ass that has a field type Triangle called leaves and a field type square
 * called trunk
 * 
 * @author M Arthur 
 * @version 2018
 */
    public class Tree
{
    private Triangle leaves;
    private Triangle leaves1;
    private Triangle leaves2;
    private Triangle leaves3;
    private Circle decor; 
    private Circle decor1;
    private Circle decor2;
    private Person star; 
    private Triangle star1; 
    private Square trunk;

    /**
     * Constructor for objects of class Picture
     */
    public Tree()
    {
        leaves = new Triangle();
        leaves1 = new Triangle();
        leaves2 = new Triangle();
        leaves3 = new Triangle();
        decor = new Circle(); 
        decor1 = new Circle(); 
        decor2 = new Circle(); 
        star = new Person(); 
        star1 = new Triangle(); 
        trunk = new Square();
           setup();
    }

    /**
     * Draw this picture.
     */
    public void setup()
    {
        trunk.moveHorizontal(-80);
        trunk.moveVertical(150);
        trunk.changeSize(40);
        trunk.changeColor("black"); //black instead of brown
        trunk.makeVisible();
        
        leaves.moveHorizontal(38);
        leaves.moveVertical(-50);
        leaves.changeSize(180,150);
        leaves.changeColor("green");
        leaves.makeVisible();
        
        leaves1.moveHorizontal(38);
        leaves1.moveVertical(-80);
        leaves1.changeSize(180,150);
        leaves1.changeColor("green");
        leaves1.makeVisible();
        
        leaves2.moveHorizontal(38);
        leaves2.moveVertical(-100);
        leaves2.changeSize(180,150);
        leaves2.changeColor("green");
        leaves2.makeVisible();
        
        leaves3.moveHorizontal(38);
        leaves3.moveVertical(-120);
        leaves3.changeSize(120,100);
        leaves3.changeColor("green");
        leaves3.makeVisible();
        
        decor.moveHorizontal(38); 
        decor.moveVertical(80); 
        decor.changeSize(20); 
        decor.changeColor("red"); 
        decor.makeVisible(); 
        
        star1.moveHorizontal(32); 
        star1.moveVertical(-130); 
        star1.changeSize(30,50); 
        star1.changeColor("blue"); 
        star1.makeVisible();
        
        star.moveHorizontal(-34); 
        star.moveVertical(-170); 
        star.changeSize(40,25); 
        star.changeColor("black"); 
        star.makeVisible(); 
        
            

    
        
        
        
    }
}

