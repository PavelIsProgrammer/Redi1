package com.petrs.rediexpress_session1.domain

import com.petrs.rediexpress_session1.data.ErrorType

sealed class DomainResult<out T> {
    data class Success<T>(val data: T) : DomainResult<T>()
    data class Error(val type: ErrorType, val errors: String) : DomainResult<Nothing>()
    data class Loading(val state: LoadingState) : DomainResult<Nothing>()
}

enum class LoadingState {
    INITIAL,
    REQUEST_LOADING
}