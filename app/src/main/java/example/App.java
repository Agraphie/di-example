package example;

import example.di.DaggerMainComponent;

public class App {
    public static void main(String[] args) {
        Logger logger = DaggerMainComponent.create().buildLogger();
        new InputReader(logger).startReader();
    }
}
