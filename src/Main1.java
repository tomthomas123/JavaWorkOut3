abstract class Car
{
    int noOfWheels;
    abstract void ignition();
    void chargeGear()
    {
        System.out.println("welcome");
    }
}
class Sedan extends Car
{
    void ignition()
    {
        System.out.println("to home"+noOfWheels);
    }
}


public class Main1 {
    public static void main(String[] args) {
        Sedan se = new Sedan();
        se.ignition();
        se.chargeGear();

    }
}
