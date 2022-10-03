import java.util.Random;

class Medicine
{
    static int num;
    String Name = "KMCH";
    String Address = "KMCH KOVAI";
    //Medicine()
    //{
      //  num = num + 1;
        //System.out.println(num);
    //}
    void displayLabel()
    {
        System.out.println(Name);
        System.out.println(Address);
    }
}
class Tablet extends Medicine
{
    void displayLabel()
    {
        System.out.println("store in a cool dry place");
    }
}
class Syrup extends Medicine
{
    void displayLabel()
    {
        System.out.println("store away from sunlight");
    }
}
class Ointment extends Medicine
{
    void displayLabel()
    {
        System.out.println("for external use only");
    }
}

public class TestMedicine {
    public static void main(String[] args) {
        Medicine med = new Medicine();
        med.displayLabel();
        Random ran = new Random();
        int num = ran.nextInt(1,4);
        if (num == 1)
        {
            Tablet med1 = new Tablet();
            med1.displayLabel();
        } else if (num == 2) {
            Syrup med2 = new Syrup();
            med2.displayLabel();
        } else if (num == 3) {
            Ointment med3 = new Ointment();
            med3.displayLabel();
        }


    }
}
