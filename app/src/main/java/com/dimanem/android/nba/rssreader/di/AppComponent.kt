package com.dimanem.android.nba.rssreader.di

import android.app.Application
import com.dimanem.android.nba.rssreader.NBAReaderApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by dimanemets on 09/02/2018.
 */
@Singleton
@Component(modules = arrayOf(
        AndroidSupportInjectionModule::class,
        AppModule::class,
        MainActivityModule::class)
)
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
    fun inject(nbaReaderApp: NBAReaderApp)
}
