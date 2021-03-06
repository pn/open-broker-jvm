package org.openbroker.se.privateunsecuredloan.model

import org.openbroker.common.requireMin

data class ExistingLoan(
    val loanAmount: Int,
    val monthlyPayment: Int,
    val shouldRefinance: Boolean,
    val existingLoanType: ExistingLoanType,
    val responsibility: Responsibility
) {
    init {
    	loanAmount.requireMin(1, "loanAmount")
        monthlyPayment.requireMin(1, "monthlyPayment")
    }
}