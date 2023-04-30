/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;
import paquete02.Dispositivo;
/**
 *
 * @author denis
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Dispositivo 1 (primer objeto)
        Dispositivo dispositivo = new Dispositivo();
        
        dispositivo.establecerSistemaOperativo("Android");
        dispositivo.establecerPantalla(7.7);
        dispositivo.establecerImei("1202er302op12");
        dispositivo.establecerDireccionMac("yuutew2156q132");
        dispositivo.establecerCostoInicial(740.50);
        dispositivo.establecerIva(12);
        dispositivo.establecerIvaCostoInicial();
        dispositivo.establecerCostoFinal();
        
        System.out.printf("------Celular 1------\n"
                + "---------------------------------------------------------\n"
                + "caracteristicas del celular:\n"
                + "Sistema Operativo: %s\n"
                + "Pantalla: %.2f\n"
                + "Imei: %s\n"
                + "Direccion MAC: %s\n"
                + "Costo Inicial: $%.2f\n"
                + "IVA: %d porciento\n"
                + "Costo Inicial IVA: $%.2f\n"
                + "Costo Final: $%.2f\n",
                dispositivo.obtenerSistemaOperativo(),
                dispositivo.obtenerPantalla(),
                dispositivo.obtenerImei(),
                dispositivo.obtenerDireccionMac(),
                dispositivo.obtenerCostoInicial(),
                dispositivo.obtenerIva(),
                dispositivo.obtenerIvaCostoInicial(),
                dispositivo.obtenerCostoFinal());
        
        // Dispositivo 2 (segundo objeto)
        Dispositivo dispositivo2 = new Dispositivo();
        
            dispositivo2.establecerSistemaOperativo("IOS");
        dispositivo2.establecerPantalla(7.8);
        dispositivo2.establecerImei("123qwd9wqwax8ud");
        dispositivo2.establecerDireccionMac("asc97asc69ac972");
        dispositivo2.establecerCostoInicial(1230.99);
        dispositivo2.establecerIva(24);
        dispositivo2.establecerIvaCostoInicial();
        dispositivo2.establecerCostoFinal();
        System.out.println("............................................."
                + ".............\n");
        System.out.printf("------Celular 2------\n"
                + "---------------------------------------------------------\n"
                + "Caracteristicas del celular:\n"
                + "Sistema Operativo: %s\n"
                + "Pantalla: %.2f\n"
                + "Imei: %s\n"
                + "Direccion MAC: %s\n"
                + "Costo Inicial: $%.2f\n"
                + "IVA: %d porciento\n"
                + "Costo Inicial IVA: $%.2f\n"
                + "Costo Final: $%.2f\n",
                dispositivo2.obtenerSistemaOperativo(),
                dispositivo2.obtenerPantalla(),
                dispositivo2.obtenerImei(),
                dispositivo2.obtenerDireccionMac(),
                dispositivo2.obtenerCostoInicial(),
                dispositivo2.obtenerIva(),
                dispositivo2.obtenerIvaCostoInicial(),
                dispositivo2.obtenerCostoFinal());
        
    }
    
}

