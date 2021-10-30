package heads;


public class SonyHead implements IHead {
    @Override
    public void speek() {
        System.out.println("I am Sonyhead");
    }

    @Override
    public int getPrice() {
        return 150;
    }
}
