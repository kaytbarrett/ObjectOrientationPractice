// Class to represent a vehicle 
public class Vehicle implements Drawable, Resizable, Rotatable, Sounds {
    
    private String name;    // Vehicle name
    private int age;        // Vehicle age

    // Default constructor with default values
    Vehicle()
    {
        this.name = "un-named";
        this.age = 00;
    }

    // Parameterized constructor with name and age
    Vehicle(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Returns a string with vehicle information
    public String toString()
    {
        return("\nThis is a vehicle named " + name +
                "with age " + age);
    }

    // Setter method to set name
    public void setName(String name)
    {
        this.name = name;
    }

    // Setter method to set age
    public void setAge(int age)
    {
        this.age = age;
    }

    // Getter method to get name
    public String getName()
    {
        return name;
    }

    // Getter method to get age
    public int getAge()
    {
        return age;
    }

    // Implementation of Drawable interface method to draw vehicle
    @Override
    public void drawObject() {
        System.out.println("Drawing a Vehicle");
    }

    // Implementation of Resizable interface method to resize vehicle
    @Override
    public void resizeObject() {
        System.out.println("Resizing a Vehicle");
    }

    // Implementation of Rotatable interface method to rotate vehicle
    @Override
    public void rotateObject() {
        System.out.println("Rotating a Vehicle");
    }

    // Implementation of Sounds interface method to play sound
    @Override
    public void playSound() {
        System.out.println("Vehicle sound");
    }
}
