package heads;


public class SamsungHead implements IHead {
    @Override
    public void speek() {
        System.out.println("Hello i am Samsunghead");
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
