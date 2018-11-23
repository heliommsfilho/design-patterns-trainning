import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Shows how Observer Pattern helps to solve problems related to notify objects interested in some particular event.
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public class Lotery {

    List<LoteryObserver> loteryObservers = new ArrayList<>();

    public void sortNumber() {
        Random random = new Random();
        int sorted = random.nextInt(10) + 1;
        notify(sorted);
    }

    private void notify(int sortedNumber) {
        loteryObservers.forEach(o -> o.numberSorted(sortedNumber));
    }

    public void addObserver(LoteryObserver o) {
        this.loteryObservers.add(o);
    }

    public void clearObservers() {
        this.loteryObservers.clear();
    }
}
