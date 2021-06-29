package example.di;

import example.EchoLogger;
import example.Logger;
import example.MainLogger;
import dagger.Module;
import dagger.Provides;

import javax.inject.Inject;
import javax.inject.Singleton;

@Module
public class MainModule {

    @Provides
    @Singleton
    MainLogger provideLogger() {
        return new MainLogger();
    }

    @Provides
    @Singleton
    @Inject
    Logger provideEcho(MainLogger mainLogger) {
        return new EchoLogger(mainLogger);
    }
}
