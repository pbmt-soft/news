package com.pbmt.s_budget.utils.viewState

import com.pbmt.s_budget.model.Transaction

sealed class DetailState {

    object Loading : DetailState()

    object Empty : DetailState()

    data class Success(val transaction: Transaction) : DetailState()

    data class Error(val exception: Throwable) : DetailState()

}