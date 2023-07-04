package com.petrs.rediexpress_session1.app

import android.app.Application
import com.petrs.rediexpress_session1.di.domainModule
import com.petrs.rediexpress_session1.di.networkModule
import com.petrs.rediexpress_session1.di.repositoryModule
import com.petrs.rediexpress_session1.di.sharedPreferencesModule
import com.petrs.rediexpress_session1.di.uiModule
import org.koin.android.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.logger.Level

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            androidLogger(if (BuildConfig.DEBUG) Level.DEBUG else Level.NONE)
            modules(
                domainModule,
                repositoryModule,
                sharedPreferencesModule,
                uiModule,
                networkModule
            )
        }
    }
}