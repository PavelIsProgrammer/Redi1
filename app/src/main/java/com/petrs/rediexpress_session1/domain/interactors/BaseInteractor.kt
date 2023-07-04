package com.petrs.rediexpress_session1.domain.interactors

import com.petrs.rediexpress_session1.data.DataResult
import com.petrs.rediexpress_session1.domain.DomainResult

abstract class BaseInteractor {

    protected inline fun <reified T> returnDomainResult(noinline resultFunc: () -> DataResult<T>): DomainResult<T> {
        val result = resultFunc()

        return if (result is DataResult.Success<*>) {
            DomainResult.Success(result.data as T)
        } else {
            DomainResult.Error((result as DataResult.Error).errorType, result.errors)
        }
    }
}