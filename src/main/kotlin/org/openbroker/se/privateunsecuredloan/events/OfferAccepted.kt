package org.openbroker.se.privateunsecuredloan.events

import org.openbroker.se.model.BankAccount
import org.openbroker.common.model.Reference
import org.openbroker.common.requireMin

data class OfferAccepted @JvmOverloads constructor(
    override val brokerReference: Reference,
    val offerId: Reference? = null,
    val bankAccount: BankAccount? = null,
    val requestedCredit: Int? = null
): PrivateUnsecuredLoanEvent
{
    init {
        requestedCredit.requireMin(1, "requestedCredit")
    }
}