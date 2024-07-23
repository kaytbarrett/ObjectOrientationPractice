/**
 * Katherine (Katie) Barrett
 * EN.605.201.81.SU24
 * Assignment #8
 * 
 * References used for this assignment: 
 * Module 8 Office Hours Presentation
 * Stack Overflow for Java casting to interface to call methods (I knew the general concept, but not the java syntax)
 */

public class Main {
    
    public static void main (String[] args) {

        // Create two animals and two vehicles per assignment requirements
        Drawable[] objects = {
            new Animal("Arya"),
            new Animal("Tucker"),
            new Vehicle("honda", 12),
            new Vehicle("jeep", 10),
        };

        for (Drawable object : objects)
        {
            System.out.println();
            object.drawObject();                    // Object already set to type Drawable so able to call drawObject method
            ((Rotatable) object).rotateObject();    // Cast object to rotatable interface to call rotateObject method
            ((Resizable) object).resizeObject();    // Cast object to resizeable interface to call resizeObject method
            ((Sounds) object).playSound();          // Cast object to sounds interface to call playSound method
        }

    }
}
