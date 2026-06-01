/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbiblioteca;

/**
 *
 * @author jeiso
 */

import java.time.LocalDate;

public class Prestamo {
    private LocalDate fecha;
    private Usuario usuario;
    private Libro libro;
    
    
    public Prestamo(Usuario usuario, Libro libro) {
        this.fecha = LocalDate.now();
        this.usuario = usuario;
        this.libro = libro;
    }
    
    public void realizarPrestamo() {
        if (libro.isDisponible()) {
            libro.setDisponible(false);
            usuario.agregarLibro(libro);
            System.out.println("Préstamo exitoso: " + libro.getTitulo() + " para " + usuario.getNombre());
        } else {
            System.out.println("El libro no está disponible.");
        }
    }
    
    public void devolverLibro() {
        libro.setDisponible(true);
        usuario.removerLibro(libro);
        System.out.println("El libro " + libro.getTitulo() + " ha sido devuelto.");
    }
}
