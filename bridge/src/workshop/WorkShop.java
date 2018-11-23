package workshop;

import vehicle.Vehicle;

/**
 * Shows how the Bridge pattern can help to resolve problems where both abstraction and implementation can vary.
 * Example from: <a>https://dzone.com/articles/bridge-design-pattern-in-java</a>
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */

public abstract class WorkShop {
    public abstract void work(Vehicle vehicle);
}
