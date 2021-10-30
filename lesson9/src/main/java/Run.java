import Robot.Robot;
import hands.SonyHand;
import hands.ToshibaHand;
import heads.SamsungHead;
import heads.SonyHead;
import heads.ToshibaHead;
import legs.SamsungLegs;
import legs.ToshibaLegs;

public class Run {
    private Robot robot;

    public static void main(String[] args) {

        Robot robot1 = new Robot();
        SonyHead sonyHead1 = new SonyHead();
        SamsungLegs samsungLegs1 = new SamsungLegs();
        ToshibaHand toshibaHand1 = new ToshibaHand();
        robot1.setHand(toshibaHand1);
        robot1.setLeg(samsungLegs1);
        robot1.setHead(sonyHead1);
        robot1.action();
        System.out.println(robot1.getPrice());
        System.out.println();

        Robot robot2 = new Robot();
        SamsungHead samsungHead = new SamsungHead();
        ToshibaLegs toshibaLegs = new ToshibaLegs();
        SonyHand sonyHand = new SonyHand();
        robot2.setLeg(toshibaLegs);
        robot2.setHand(sonyHand);
        robot2.setHead(samsungHead);
        robot2.action();

        System.out.println(robot2.getPrice());
        System.out.println();

        Robot robot3 = new Robot();
        ToshibaLegs toshibaLegs1 = new ToshibaLegs();
        ToshibaHand toshibaHand = new ToshibaHand();
        ToshibaHead toshibaHead = new ToshibaHead();
        robot3.setHead(toshibaHead);
        robot3.setHand(toshibaHand);
        robot3.setLeg(toshibaLegs1);
        robot3.action();

        System.out.println(robot3.getPrice());
        System.out.println();

        if (robot1.getPrice() > robot2.getPrice() && robot1.getPrice() > robot3.getPrice()) {
            System.out.println("Самый дорогой первый робот его цена " + robot1.getPrice());
        } else if (robot2.getPrice() > robot1.getPrice() && robot2.getPrice() > robot3.getPrice()) {
            System.out.println("Самый дорогой второй робот его цена  " + robot2.getPrice());
        } else {
            System.out.println("Самый дорогой третий робот его цена  " + robot3.getPrice());
        }


    }


}
