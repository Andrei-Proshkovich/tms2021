import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("serial"))) {

            Car car = new Car("sedan", "pejo", "red", new Car.Engine(4, "4 cylunders"), new Car.GasTank(40, "benzin"));
            objectOutputStream.writeObject(car);
            System.out.println("car1=" + car.toString());
        } catch (Exception ex) {
            System.out.println("Serialization exception");
        }
        Car car2 = new Car();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("serial"))) {

            car2 = (Car) objectInputStream.readObject();

        } catch (Exception e) {
            System.out.println("Deserialization exception");
        }
        System.out.println(car2.getColor() + " " + car2.getMarka() + car2.getEngine());
    }

}
