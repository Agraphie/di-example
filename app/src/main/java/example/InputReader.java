package example;

import javax.inject.Inject;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputReader {
    private final Logger logger;

    @Inject
    public InputReader(Logger logger) {
        this.logger = logger;
    }

    public void startReader() {
        System.out.println("Speak with me! (exit to quit)");
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                String line = scanner.nextLine();
                logger.log(String.format("You said: %s%n", line));
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
            }
        } catch (IllegalStateException | NoSuchElementException e) {
            // System.in has been closed
            System.out.println("System.in was closed; exiting");
        }
    }
}
