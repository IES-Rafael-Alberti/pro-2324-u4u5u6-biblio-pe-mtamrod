package org.pebiblioteca

import java.awt.List

/**
 * La clase GestorBiblioteca se encarga de la gestión de los libros sobre el catalogo-
 */
class GestorBiblioteca(libro: libro) {
    val catalogo = mutableListOf(libro)
    val registro = listOf(libro.estado)
    /**
     * El método agregarLibro se encarga de añadir el nuevo libro que se indique al catálogo (lista) de libros existentes.
     */
    fun agregarLibro (libro: libro) {
        catalogo.add(libro)
    }

    /**
     * El método eliminarLibro se encarga de quitar un libro del catálogo (lista) de libros existentes.
     */
    fun eliminarLibro (libro: libro) {
        catalogo.remove(libro)
    }

    /**
     * El método registrarPrestamo se encarga de cambiar el estado de un libro a prestado si el libro si verifica que está disponible. En caso de que el libro no esté disponible no se podrá cambiar el estado a prestado.
     */
    fun registrarPrestamo (libro: libro) {
        if (libro.estado == "disponible") {
            libro.estado = "prestado"
        } else {
            println("El libro indicado no se encuentra disponible")
        }
    }

    /**
     * El método devolverLibro se encarga de modificar el estado del libro a disponible y si este estaba prestado. En caso contrario su estado se quedará como disponible.
     */
    fun devolverLibro (libro: libro) {
        if (libro.estado == "prestado") {
            libro.estado = "disponible"
        }
    }

    /**
     * El método disponibilidadLibro se encarga comprobar el estado actual de un libro sin modificarlo.
     */
    fun disponibilidadLibro (libro: libro) {
        print("El libro se encuentra ${libro.estado}")
    }

    /**
     * El método mostrarLibro se encarga de mostrar todos los libros que se encuentren en un estado fitrados por:
     * "todos": que muestra todos los libros.
     * "disponible": que muestra todos los libros disponibles.
     * "prestado": que muestra todos los libros prestados.
     */
    fun mostrarLibro (libro: libro) {

    }
}