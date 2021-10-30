package heads;


public class ToshibaHead implements IHead {
    @Override
    public void speek() {
        System.out.println("hello i Toshibahead");
    }

    @Override
    public int getPrice() {
        return 80;
    }
}
