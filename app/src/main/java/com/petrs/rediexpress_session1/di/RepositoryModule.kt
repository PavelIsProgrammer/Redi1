package com.petrs.rediexpress_session1.di

import com.petrs.rediexpress_session1.data.repository.RediRepository
import com.petrs.rediexpress_session1.data.repository.SharedPrefsRepository
import com.petrs.rediexpress_session1.data.repository.impl.RediRepositoryImpl
import com.petrs.rediexpress_session1.data.repository.impl.SharedPrefsRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {

    single<SharedPrefsRepository> {
        SharedPrefsRepositoryImpl(
            handler = get()
        )
    }

    single<RediRepository> {
        RediRepositoryImpl(
            service = get()
        )
    }
}