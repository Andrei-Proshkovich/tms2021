public class AirTransport extends Transport {
    private double wingspan;
    private int minLength;
}

class CivilTransport extends AirTransport {
    private int countPassengers;
    private boolean biznessClass;

    void checkPasseengers(int countPassengers) {
        if (countPassengers >= 0 && countPassengers < 221) {
            System.out.println("Пассажирам хватает места");
        }
        if (countPassengers > 221) {
            System.out.println("Самолет перегружен");
        }
        if (countPassengers < 0) {
            System.out.println("mistake!");
        }
    }

    void description() {
        System.out.println("countPassengers " + countPassengers + "," + "biznessClass " + biznessClass);
    }
}

class MilitaryTransport extends AirTransport {
    private boolean ejection;
    private byte countRocket;

    public void shot(int countRocket) {
        if (countRocket > 0 && countRocket < 30) {
            System.out.println("Ракета пошла...");
            if (countRocket == 0) {
                System.out.println("Боеприпасы отсутствуют");
            } else {
                System.out.println("Mistake");
            }
        }
    }

    public void bailout(boolean ejection) {
        if (ejection == true) {
            System.out.println("Катапультирование прошло успешно");
        }
        if (ejection == false) {
            System.out.println("У вас нет такой системы");
        }
    }

    void description() {
        System.out.println("ejection " + ejection + " ," + "countRocket " + countRocket);
    }
}