package workshop;

import vehicle.Vehicle;

import java.util.concurrent.TimeUnit;

/**
 * Shows how the Bridge pattern can help to resolve problems where both abstraction and implementation can vary.
 * Example from: <a>https://dzone.com/articles/bridge-design-pattern-in-java</a>
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */

public class AssembleWorkShop extends WorkShop {
    
    public AssembleWorkShop() {
        super();
    }
    @Override
    public void work(Vehicle vehicle) {
        System.out.print("Assembling... ");
        long timeToTake = 200 * vehicle.minWorkTime();
        try {
            TimeUnit.MILLISECONDS.sleep(timeToTake); // Thread.sleep(timeToTake);
        } catch (InterruptedException exp) {
            // nothing to do for now.
        }
        System.out.printf("(Time taken: %d millis), Done.\n", timeToTake);
    }
}
