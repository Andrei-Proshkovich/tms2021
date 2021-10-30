package Lesson9.task2;

public class Shoes implements IShoes {
    int razm;

    public Shoes(int razm) {
        this.razm = razm;
    }

    @Override
    public void putOn() {
        System.out.println("Put on the shoes!");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off the shoes");
    }
}
