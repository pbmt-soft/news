package com.pbmt.s_budget.utils.viewState

import com.pbmt.s_budget.model.Transaction

sealed class ViewState {

    object Loading : ViewState()

    object Empty : ViewState()

    data class Success(val transaction: List<Transaction>) : ViewState()

    data class Error(val exception: Throwable) : ViewState()

}