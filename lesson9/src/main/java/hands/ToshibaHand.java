package hands;


public class ToshibaHand implements IHand {
    @Override
    public void upHand() {
        System.out.println("uphand toshiba");
    }

    @Override
    public int getPrice() {
        return 80;
    }
}
