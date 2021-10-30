package legs;


public class SamsungLegs implements ILeg {
    @Override
    public void step() {
        System.out.println("i samsungstep!");
    }

    @Override
    public int getPrice() {
        return 40;
    }
}
