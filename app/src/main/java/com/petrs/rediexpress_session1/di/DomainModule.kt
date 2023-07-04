package com.petrs.rediexpress_session1.di

import com.petrs.rediexpress_session1.domain.interactors.StartInteractor
import com.petrs.rediexpress_session1.domain.interactors.impl.StartInteractorImpl
import org.koin.dsl.module

val domainModule = module {

    factory<StartInteractor> {
        StartInteractorImpl(
            repository = get(),
            sharedPrefs = get()
        )
    }
}