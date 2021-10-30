package Lesson9.task2;

public class Jacket implements IJacket {
    public Jacket(String color) {
        this.color = color;
    }

    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void putOn() {
        System.out.println("Put on the jacket!");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off the jacket");
    }
}
