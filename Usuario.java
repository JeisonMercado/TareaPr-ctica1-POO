/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbiblioteca;

/**
 *
 * @author jeiso
 */
import java.util.ArrayList;

public class Usuario {
     private String nombre;
    private String matricula;
    private ArrayList<Libro> librosPrestados;
    
    public Usuario(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.librosPrestados = new ArrayList<>();
    }
    
    public void agregarLibro(Libro libro) { librosPrestados.add(libro); }
    public void removerLibro(Libro libro) { librosPrestados.remove(libro); }
    public String getNombre() { return nombre; }
}
