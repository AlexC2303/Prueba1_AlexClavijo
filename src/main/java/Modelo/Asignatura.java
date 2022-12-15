/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author esteb
 */
public class Asignatura {
    private int codigo;
    private String nombre;
    private String libroGuia;
    private int numHoras;
    private int numUnidades;

    public Asignatura(int codigo, String nombre, String libroGuia, int numHoras, int numUnidades) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.libroGuia = libroGuia;
        this.numHoras = numHoras;
        this.numUnidades = numUnidades;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLibroGuia() {
        return libroGuia;
    }

    public void setLibroGuia(String libroGuia) {
        this.libroGuia = libroGuia;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public int getNumUnidades() {
        return numUnidades;
    }

    public void setNumUnidades(int numUnidades) {
        this.numUnidades = numUnidades;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "codigo=" + codigo + ", nombre=" + nombre + ", libroGuia=" + libroGuia + ", numHoras=" + numHoras + ", numUnidades=" + numUnidades + '}';
    }

    
    
    
}
