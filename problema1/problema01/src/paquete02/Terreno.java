/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author denis
 */
public class Terreno {
    private double costoTerreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    public void establecerAncho(double a) {
        ancho = a;
    }

    public void establecerLargo(double a) {
        largo = a;
    }

    public void establecerValorMetroCuadrado(double a) {
        valorMetroCuadrado = a;
    }

    public void establecerArea() {
        area = largo * ancho;
    }

    public void establecerCostoTerreno() {
        costoTerreno = valorMetroCuadrado * area;
    }

    public double obtenerCosto_terreno() {
        return costoTerreno;
    }

    public double obtenerAncho() {
        return ancho;
    }

    public double obtenerLargo() {
        return largo;
    }

    public double obtenerArea() {
        return area;
    }

    public double obtenerValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

}

