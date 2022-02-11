public class DiceGame
{
    public static void main(String[] args)
    {
        Die d6 = new Die();
        Die d12 = new Die(12);
        Die d20 = new Die(20, "20 sided die");

        int d6CurrentSide = d6.getCurrentSide();
        System.out.println("The original side up for the d6 is: " + d6CurrentSide);
        d6.roll();
        System.out.println();

        int d12CurrentSide = d12.getCurrentSide();
        System.out.println("The original side up for the d12 is: " + d12CurrentSide);
        d12.roll();
        System.out.println();

        int d20CurrentSide = d20.getCurrentSide();
        System.out.println("The original side up for the d20 is: " + d20CurrentSide);
        d20.roll();
        System.out.println();

        d20.setSideUp(128);
        System.out.println("Setting the d20 to max value: " + d20.getCurrentSide());
    }
}
