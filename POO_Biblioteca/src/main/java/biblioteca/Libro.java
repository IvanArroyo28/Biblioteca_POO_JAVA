/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author IVAN
 */
public class Libro {
    private String nombre;
    private String descripcion;
    private Autor autorLibro;
    private Genero generoLibro;

    public Libro(String nombre, String descripcion, Autor autorLibro, Genero generoLibro) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.autorLibro = autorLibro;
        this.generoLibro = generoLibro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Autor getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(Autor autorLibro) {
        this.autorLibro = autorLibro;
    }

    public Genero getGeneroLibro() {
        return generoLibro;
    }

    public void setGeneroLibro(Genero generoLibro) {
        this.generoLibro = generoLibro;
    }
    
    
    
}
