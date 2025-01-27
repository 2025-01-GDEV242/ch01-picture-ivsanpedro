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
    private Square wall2;
    private Square window;
    private Square grass;
    private Triangle roof;
    private Circle sun;
    private Circle sun2;
    private Person pers;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        wall2 = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        sun2 = new Circle();
        pers = new Person();
        grass = new Square();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-200);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            wall2.moveVertical(-20);
            wall2.moveHorizontal(-200);
            wall2.changeSize(120);
            wall2.makeVisible();
            
            window.changeColor("blue");
            window.moveHorizontal(-140);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(-40);
            roof.moveVertical(-80);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-60);
            sun.changeSize(100);
            sun.makeVisible();
            
            pers.makeVisible();
            pers.moveHorizontal(20);
            pers.changeSize(50,50);
            pers.moveVertical(40);
            
            grass.makeVisible();
            grass.changeSize(300);
            grass.moveVertical(60);
            grass.changeColor("green");
            grass.moveHorizontal(-200);
            
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
}
