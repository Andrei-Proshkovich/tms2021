package Lesson9.task2;

public class Task2 {
    public static void main(String[] args) {

        Human human = new Human("df", new Jacket("sds"), new Pants(32), new Shoes(2));

        human.putOnAll();
        human.takeOffAll();
    }
}
