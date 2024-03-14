package org.pebiblioteca

import java.util.*

class UtilidadesBiblioteca {
    companion object {
        fun generarIdentificadorUnico() {
            val uniqueID: String = UUID.randomUUID().toString()
        }
    }
}