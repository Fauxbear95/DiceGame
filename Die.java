import java.util.*;

public class Die
{

    String type;
    int numOfSides;
    int result;

    public Die()
    {
        type = "d6";
        numOfSides = 6;
        result = (int)(Math.random() * numOfSides + 1);
    }

    public Die(int sides)
    {
        numOfSides = sides;
        type = assignType(sides);
        result = (int)(Math.random() * numOfSides + 1);
    }

    public Die(int sides, String nameType)
    {
        numOfSides = sides;
        type = nameType;
        result = (int)(Math.random() * numOfSides + 1);
    }

    public void roll()
    {
        result = (int)(Math.random() * numOfSides + 1);
        System.out.println("You rolled a " + this.type + " and it was a: " + result);
    }
    public void setSideUp(int value)
    {
        if(value > 0 && value <= numOfSides)
        {
            result = value;
        }
    }

    public int getCurrentSide()
    {
        return result;
    }
    public String assignType(int numOfSides)
    {
        return "d"+numOfSides;
    }
}
