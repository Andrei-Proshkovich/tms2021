package hands;

public class SamsungHand implements IHand {

    @Override
    public void upHand() {
        System.out.println("upHand samsung");
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
