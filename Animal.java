// Class to represent an animal
public class Animal implements Drawable, Resizable, Rotatable, Sounds{

    private String name;    // Animal name

    // Default constructor with default values
    Animal()
    {
        this.name = "unassigned";
    }

    // Parameterized constructor with name initialized
    Animal(String name)
    {
        this.name = name;
    }

    // Setter method to set name
    public void setName(String name)
    {
        this.name = name;
    }

    // Getter method to get name
    public String getName()
    {
        return this.name;
    }

    // Returns a string with animal information
    public String toString()
    {
        return ("\nThis animal is named: " + name);
    }

    // Implementation of Drawable interface method to draw animal
    @Override
    public void drawObject() {
        System.out.println("Drawing an Animal");
    }

    // Implementation of Resizable interface method to resize animal
    @Override
    public void resizeObject() {
        System.out.println("Resizing an Animal");
    }

    // Implementation of Rotatable interface method to rotate animal
    @Override
    public void rotateObject() {
        System.out.println("Rotating an Animal");
    }

    // Implementation of Sounds interface method to play animal sound
    @Override
    public void playSound() {
        System.out.println("Animal sound");
    }
    
}
