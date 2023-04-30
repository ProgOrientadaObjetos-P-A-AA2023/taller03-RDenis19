/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author denis
 */
public class Instituciones {

    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosEstudiante;
    private double presupuesto;

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerTipo(String t) {
        tipoInstitucion = t;
    }

    public void establecerNumeroAlumnos(int n) {
        numeroAlumnos = n;
    }

    public void establecerNumeroDocentes(int n) {
        numeroDocentes = n;
    }

    public void establecerNumeroSedes(int n) {
        numeroSedes = n;
    }

    public void establecerGastosEstudiante(double g) {
        gastosEstudiante = g;
    }
    public  void  establecerPresupuesto () {
        presupuesto = gastosEstudiante * numeroAlumnos ;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipo() {
        return tipoInstitucion;
    }

    public int obtenerNumeroAlumnos() {
        return numeroAlumnos;
    }

    public int obtenerNumeroDocentes() {
        return numeroDocentes;
    }

    public int obtenerNumeroSedes() {
        return numeroSedes;
    }

    public double obtenerGastosEstudiante() {
        return gastosEstudiante;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }
}
