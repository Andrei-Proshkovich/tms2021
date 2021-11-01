import java.util.Scanner;

public class SpaceX implements IStart {
    @Override
    public boolean checkSystems() {

        String green = "green";
        Scanner scan = new Scanner(System.in);
        String output = scan.nextLine();
        if (output.equals(green)) {
            System.out.println("Can fly");
            startEngines();
            return true;
        } else {
            System.out.println("You cannot fly");
            return false;
        }
    }

    @Override
    public void start() {
        System.out.println("SpaceX fly");

    }

    @Override
    public void startEngines() {
        System.out.println("Engines start");
        start();
    }
}
