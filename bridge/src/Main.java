import vehicle.Bike;
import vehicle.Bus;
import vehicle.Car;
import vehicle.Vehicle;
import workshop.*;

/**
 * Shows how the Bridge pattern can help to resolve problems where both abstraction and implementation can vary.
 * Example from: <a>https://dzone.com/articles/bridge-design-pattern-in-java</a>
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */

public class Main {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.joinWorkshop(new ProduceWorkShop());
        bike.joinWorkshop(new AssembleWorkShop());
        bike.joinWorkshop(new TestWorkShop());
        bike.manufacture();
        Vehicle car = new Car();
        car.joinWorkshop(new ProduceWorkShop());
        car.joinWorkshop(new AssembleWorkShop());
        car.joinWorkshop(new PaintWorkShop());
        car.joinWorkshop(new TestWorkShop());
        car.manufacture();
        Vehicle bus = new Bus();
        bus.joinWorkshop(new RepairWorkShop());
        bus.joinWorkshop(new AssembleWorkShop());
        bus.joinWorkshop(new TestWorkShop());
        bus.manufacture();
    }
}
