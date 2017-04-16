package loki.project.com.loki.src.dagger;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import loki.project.com.loki.src.SampleAppication;

/**
 * Created by User on 4/16/2017.
 */
@Module
public class AppModule {

    private final SampleAppication app;

    public AppModule(SampleAppication app) {
        this.app = app;
    }

    @Provides @Singleton
    public Context provideContext(){
        return app;
    }

}
