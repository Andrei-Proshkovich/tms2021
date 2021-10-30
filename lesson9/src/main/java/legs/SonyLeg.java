package legs;


public class SonyLeg implements ILeg {
    @Override
    public void step() {
        System.out.println("I am sonystep");
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
