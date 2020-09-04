package utils

inline fun Boolean?.ifTrue(block: Boolean.() -> Unit): Boolean? {
    if (this == true) {
        block()
    }
    return this
}

inline fun Boolean?.ifFalse(block: Boolean?.() -> Unit): Boolean? {
    if (null == this || !this) {
        block()
    }
    return this
}