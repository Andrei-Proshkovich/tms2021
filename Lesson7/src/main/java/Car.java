public class Car {

    private String model;
    private String marka;
    private String color;
    public Engine engine;
    private boolean zavedena;

    private boolean move;
    public Benzobak benzobak;

    public static final int RASHOD = 5;

    public static int poezdka(int poezdka) {

    }

    public boolean isZavedena(boolean zavedena) {
        return zavedena = true;
    }

    public void vseRasstoznie(int chisloPoezdok) {

    }

    public void move(boolean move) {
        if (move == true) {

            System.out.println("Car move");
        } else {
            System.out.println("Car stop");
        }
    }


    public class Engine {
        private int type;

        public boolean isZavedena() {
            return zavedena = true;
        }

        public void start() {
            System.out.println("start");
            zavedena = true;
        }

        public void stop() {
            System.out.println("Car stop");
            zavedena = false;
        }

    }

    public class Benzobak {
        private int volumeBenzobak;

        public int nowBenzin(int now) {

        }

        public int dozapravka(int a) {

            return a;
        }

    }
}

  /*
 Напишите структуру классов и продемонстрируйте работу


 - Реализуйте методы включения машины, который в свою очередь включает её двигатель.
 - Реализуйте метод езды на машине (например просто печатаем на консоль, что машина поехала)
 - Если машина не заведена, ехать она не может.
 - Машину можно заглушить.
 - После каждой поездки считаем, что машина прошла фиксированное расстояние.
 - Реализовать возможность посмотреть, какое расстояние машина прошла за все время.
 - Чтобы создать машину обязательно нужно иметь двигатель и бензобак.
 - Марка машины, год выпуска, пройденное расстояние - не обязательны при создании машины и могут быть выставлены потом.
 (не обязательно задавать в конструкторе)
 - После создания поменять двигатель машине нельзя.
 - Чтобы машина завелась, у неё должно быть топливо в бензобаке, если топлива нет, машина не может завестись.
 - Машину можно дозаправить, можно проверить сколько топлива осталось.
 - Реализуйте пару полей для двигателя и бензобака, например: тип двигателя, общий объем бензобака,
 сколько бензина сейчас и т.д.
     */

// - Чтобы поехать, машину необходимо завести, т.е. включить двигатель.
//