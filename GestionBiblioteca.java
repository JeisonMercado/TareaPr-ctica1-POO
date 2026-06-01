/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionbiblioteca;

/**
 *
 * @author jeiso
 */
public class GestionBiblioteca {

    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-0307474728");
        Libro libro2 = new Libro("1984", "George Orwell", "978-0451524935");
        
        Usuario usuario1 = new Usuario("Jeison Mercado", "2025-2079");
        
        System.out.println("Disponibilidad de '" + libro1.getTitulo() + "': " + 
                           (libro1.isDisponible() ? "Disponible" : "Prestado"));
        
        System.out.println("\n--- Iniciando proceso de préstamo ---");
        Prestamo prestamo1 = new Prestamo(usuario1, libro1);
        prestamo1.realizarPrestamo();
        
        
        System.out.println("Disponibilidad de '" + libro1.getTitulo() + "': " + 
                           (libro1.isDisponible() ? "Disponible" : "Prestado"));
        
        System.out.println("\n--- Iniciando proceso de devolucion ---");
        prestamo1.devolverLibro();
        
        System.out.println("Disponibilidad final de '" + libro1.getTitulo() + "': " + 
                           (libro1.isDisponible() ? "Disponible" : "Prestado"));
    }
}
