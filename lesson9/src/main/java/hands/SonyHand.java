package hands;


public class SonyHand implements IHand {
    @Override
    public void upHand() {
        System.out.println("Uphand sonyh");
    }

    @Override
    public int getPrice() {
        return 150;
    }
}
