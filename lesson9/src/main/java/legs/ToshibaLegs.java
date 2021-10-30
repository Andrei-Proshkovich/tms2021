package legs;


public class ToshibaLegs implements ILeg {
    @Override
    public void step() {
        System.out.println("i am Toshibastep");
    }

    @Override
    public int getPrice() {
        return 60;
    }
}
