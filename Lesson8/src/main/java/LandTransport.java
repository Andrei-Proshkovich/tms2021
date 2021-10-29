import java.util.Scanner;

public class LandTransport extends Transport {
    byte countWheels;
    double consumption;//rashod

}

class PassengerTransport extends LandTransport {
    private String bodyType;//tip kuzova
    private byte countPassengers;
    private double distance;
    private int maxSpeed = 230;
    private double time;

    private double consumption() {
        double consumption = 0.1;
        return consumption;
    }


    protected void time(double time) {
        distance = time * maxSpeed;
        double rashod = consumption() * distance;

        Scanner sc = new Scanner(System.in);
        bodyType = sc.nextLine();
        System.out.println("За время " + time + ", автомобиль " + bodyType + " " + "двигаясь с максимальной скоростью " + maxSpeed + " км/ч, проедет " + distance + " км и израсходует " + rashod + " литров топлива");


    }

    void description() {
        Scanner sc = new Scanner(System.in);

        countPassengers = sc.nextByte();
        System.out.println("bodyType, " + bodyType + "," + "countPassengers " + countPassengers);
    }
}

class FreightTransport extends LandTransport {
    private double liftingCapacity;

    void checkCargo(double liftingCapacity) {
        if (liftingCapacity > 5) {
            System.out.println("Вам нужен грузовик побольше");
        }
        if (liftingCapacity > 0 && liftingCapacity < 5) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("mistake!");
        }

    }

    void description() {
        System.out.println("liftingCapacity, " + liftingCapacity);
    }
}