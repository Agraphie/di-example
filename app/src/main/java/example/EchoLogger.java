package example;

import javax.inject.Inject;

public class EchoLogger implements Logger {
    private final MainLogger logger;

    @Inject
    public EchoLogger(MainLogger logger) {
        this.logger = logger;
    }

    public void log(String log) {
        logger.log(log);
        System.out.println("Echo: " + log);
    }
}
