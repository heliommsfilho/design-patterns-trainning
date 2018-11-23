/**
 * [[ Descrição da classe aqui ]]
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public class WinnerChecker implements LoteryObserver {

    private int chosenNumber;

    public WinnerChecker(int number) {
        this.chosenNumber = number;
    }

    @Override
    public void numberSorted(int number) {

        if (this.chosenNumber == number) {
            System.out.println("You won!");
        } else {
            System.out.println("You lose!");
        }
    }
}
