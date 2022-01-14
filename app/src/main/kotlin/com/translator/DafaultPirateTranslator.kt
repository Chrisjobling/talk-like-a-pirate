package com.translator

class DefaultPirateTranslator: PirateTranslator {
    private val translations = mapOf(
        "Hello" to "Ahoy!",
        "Yes" to "Aye",
        "Captain!" to "AYE AYE!"
    )

    override fun translate(message: String): String {
        var result = message
        translations.forEach { (t, u) -> result = result.replace(t,u) }
        return result
    }
}