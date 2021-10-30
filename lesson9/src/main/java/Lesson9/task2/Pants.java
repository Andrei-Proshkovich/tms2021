package Lesson9.task2;

public class Pants implements IPants {
    int razmer;

    public Pants(int razmer) {
        this.razmer = razmer;
    }

    @Override
    public void putOn() {
        System.out.println("Put on the pants!");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off on the pants!");

    }
}
