package vehicle; /**
 * Shows how the Bridge pattern can help to resolve problems where both abstraction and implementation can vary.
 * Example from: <a>https://dzone.com/articles/bridge-design-pattern-in-java</a>
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
import workshop.WorkShop;

import java.util.ArrayList;
import java.util.List;
public abstract class Vehicle {
    // assempbly line for the workshops
    protected List<WorkShop> workshops = new ArrayList<WorkShop>();
    public Vehicle() {
        super();
    }
    public boolean joinWorkshop(WorkShop workshop) {
        return workshops.add(workshop);
    }
    public abstract void manufacture();
    public abstract int minWorkTime();
}
