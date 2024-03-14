package org.pebiblioteca

/**
 * La clase libro contiene todos los datos necesarios para los libros, no contiene ninguna lógica asociada.
 */
data class libro(var Id: Int = 0, val titulo: String = "", val autor: String = "", val ano_publicacion: Int = 0, val tematica: String = "", val estado: String = "disponible") {
}