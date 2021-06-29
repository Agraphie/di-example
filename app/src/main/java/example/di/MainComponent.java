package example.di;

import example.Logger;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = MainModule.class)
public interface MainComponent {
    Logger buildLogger();
}
