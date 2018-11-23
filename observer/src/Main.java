import java.util.Scanner;

/**
 * Shows how Observer Pattern helps to solve problems related to notify objects interested in some particular event.
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lotery lotery = new Lotery();
        int guess = 0;

        while(guess != -1) {
            System.out.println("\nWhat's your guess (-1 to exit)?");
            guess = Integer.parseInt(sc.nextLine());
            lotery.addObserver(new ConsoleOutput());
            lotery.addObserver(new WinnerChecker(guess));
            lotery.sortNumber();
            lotery.clearObservers();
        }
    }
}
