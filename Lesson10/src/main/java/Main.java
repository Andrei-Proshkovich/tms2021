import com.tms.model.CarType;
import com.tms.model.Engine;
import com.tms.model.TankFuel;
import com.tms.service.CarIsNotReadyException;
import com.tms.service.CarServiceImpl;

public class Main {
    public static void main(String[] args) throws CarIsNotReadyException {


        CarServiceImpl car1 = new CarServiceImpl("bmv", CarType.HB, new Engine(), new TankFuel(5));
        CarServiceImpl car2 = new CarServiceImpl("audi", CarType.SD, new Engine(), new TankFuel(5));
        car1.startCar();
        car2.startCar();

    }

}
