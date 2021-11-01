import java.util.Scanner;

public class Spaceport implements IStart {
    private IStart start;


    public void launching() {

        boolean b = true;

        if (b == checkSystems()) {
            startEngines();
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
            }
            start();
        } else {
            System.out.println("Предстартовая проверка провалена!");
        }


    }


    @Override
    public boolean checkSystems() {
        boolean check;
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 1) {
            System.out.println("systems check");
            check = true;
        } else {
            System.out.println("systems neispravna!");
            check = false;
        }
        return check;
    }


    @Override
    public void start() {
        System.out.println("Мы полетели в космос!");
    }

    @Override
    public void startEngines() {
        System.out.println("StartEngines");
    }

    public Spaceport(IStart start) {
        this.start = start;
    }


    public Spaceport() {

    }

    public IStart getStart() {
        return start;
    }

    public void setStart(IStart start) {
        this.start = start;
    }
}
