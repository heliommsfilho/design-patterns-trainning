import jdk.nashorn.internal.parser.JSONParser;
import jdk.nashorn.internal.runtime.JSONFunctions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Defines a template to read and write a file to disk with the possibility
 * to apply a different steps to process before save.
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public abstract class SaveToFile {

    public final void readAndSave() {
        Log log = new Log();
        String logPath;
        Scanner sc = new Scanner(System.in);

        System.out.println("When the error happened?");
        System.out.print("DD/MM/YYYY HH:MM:SS: ");
        log.setWhenHappened(LocalDateTime.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

        System.out.println("Describe what happened:");
        log.setWhatHappened(sc.nextLine());

        System.out.println("What's your IP address?");
        log.setIp(sc.nextLine());

        System.out.println("What's your name?");
        log.setLoggedUser(sc.nextLine());

        System.out.println("Where to save the log?");
        logPath = sc.nextLine();
        writeToDisk(log, logPath);

    }

    public abstract void writeToDisk(Log log, String logPath);
}
