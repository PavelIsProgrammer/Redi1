package com.petrs.rediexpress_session1.di

import com.petrs.rediexpress_session1.data.sharedPrefs.SharedPrefsHandler
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val sharedPreferencesModule = module {
    single { SharedPrefsHandler(androidContext().applicationContext) }
}