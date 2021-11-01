import java.util.Random;

public class Shuttle implements IStart {

    @Override
    public boolean checkSystems() {

        Random random = new Random();
        int q = random.nextInt(11);
        if (q > 3) {
            System.out.println("Checksystem success");
            return true;
        } else {
            System.out.println("Checksystem false");
            return false;
        }

    }


    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }

    @Override
    public void startEngines() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме");

    }
}
