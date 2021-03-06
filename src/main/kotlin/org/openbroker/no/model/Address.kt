package org.openbroker.no.model

data class Address(
    val firstName: String,
    val lastName: String,
    val address: String,
    val city: String,
    val postalCode: String,
    val careOf: String? = null
) {
    init {
        require(firstName.isNotBlank())
        require(lastName.isNotBlank())
        require(address.isNotBlank())
        require(city.isNotBlank())
        require(postalCode.matches(postalCodeRegex)) {
            "Invalid postal code: '$postalCode'"
        }
        careOf?.let { require(it.isNotBlank()) }
    }

    companion object {
        val postalCodeRegex = Regex("^\\d{4}$")
    }
}