/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author denis
 */
public class Dispositivo {

    private String sistemaOperativo;
    private double pantalla;
    private double costoInicial;
    private int iva;
    private double ivaCostoInicial;
    private double costoFinal;
    private String imei;
    private String dirMac;

    public void establecerDireccionMac(String n) {
        dirMac = n;
    }

    public void establecerPantalla(double n) {
        pantalla = n;
    }

    public void establecerCostoInicial(double n) {
        costoInicial = n;
    }

    public void establecerIva(int n) {
        iva = n;
    }

    public void establecerIvaCostoInicial() {
        ivaCostoInicial = (costoInicial * iva) / 100;
    }

    public void establecerCostoFinal() {
        costoFinal = costoInicial + ivaCostoInicial;
    }

    public void establecerImei(String n) {
        imei = n;
    }

    public void establecerSistemaOperativo(String n) {
        sistemaOperativo = n;
    }

    public double obtenerPantalla() {
        return pantalla;
    }

    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }

    public double obtenerCostoInicial() {
        return costoInicial;
    }

    public int obtenerIva() {
        return iva;
    }

    public double obtenerIvaCostoInicial() {
        return ivaCostoInicial;
    }

    public double obtenerCostoFinal() {
        return costoFinal;
    }

    public String obtenerImei() {
        return imei;
    }

    public String obtenerDireccionMac() {
        return dirMac;
    }

}
