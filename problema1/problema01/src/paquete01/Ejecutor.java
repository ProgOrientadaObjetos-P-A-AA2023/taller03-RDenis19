/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import paquete02.Terreno;

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
        // Terreno 1 (primer objeto)
        Terreno terreno = new Terreno();
        

        terreno.establecerValorMetroCuadrado(112.42);
        terreno.establecerAncho(337.12);
        terreno.establecerLargo(659.89);
        terreno.establecerArea();
        terreno.establecerCostoTerreno();
        
        System.out.printf("\nEl primer terreno(1), tiene un costo de: $%.2f\n"
                + "----------------------------------------------------------\n"
                + "Informacion\n"
                + "Valor por metro cuadrado:\t$%.2f\n"
                + "Ancho:\t%.2f m\nLargo:\t%.2f m\nArea:\t%.2f m^2\n",
                terreno.obtenerCosto_terreno(),
                terreno.obtenerValorMetroCuadrado(),
                terreno.obtenerAncho(),
                terreno.obtenerLargo(),
                terreno.obtenerArea());
        
        
        // Terreno 2 (segundo objeto)
        Terreno terreno2 = new Terreno();
        terreno2.establecerValorMetroCuadrado(61.39);
        terreno2.establecerAncho(231.42);
        terreno2.establecerLargo(574.54);
        terreno2.establecerArea();
        terreno2.establecerCostoTerreno();
        System.out.println("..............................................."
                + "......................");
        System.out.printf("\nEl segundo terreno (2), tiene un costo de: $%.2f\n"
                + "----------------------------------------------------------\n"
                + "Informacion\n"
                + "Valor por metro cuadrado:\t$%.2f\n"
                + "Ancho:\t%.2f m\nLargo:\t%.2f m\nArea:\t%.2f m^2\n",
                terreno2.obtenerCosto_terreno(),
                terreno2.obtenerValorMetroCuadrado(),
                terreno2.obtenerAncho(),
                terreno2.obtenerLargo(),
                terreno2.obtenerArea());
    }

}

