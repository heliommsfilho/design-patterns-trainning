package vehicle;

/**
 * Shows how the Bridge pattern can help to resolve problems where both abstraction and implementation can vary.
 * Example from: <a>https://dzone.com/articles/bridge-design-pattern-in-java</a>
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public class Bus extends Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Manufactoring vehicle.Bus");
        workshops.stream().forEach(workshop -> workshop.work(this));
        System.out.println("Done.");
        System.out.println();
    }
    @Override
    public int minWorkTime() {
        return 20;
    }
}
