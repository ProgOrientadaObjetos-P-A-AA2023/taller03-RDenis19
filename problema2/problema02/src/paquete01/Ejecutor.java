/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;
import paquete02.EquivalenteHora;
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
        
        // Hora 1 (primer objeto) 
        EquivalenteHora hora1 = new EquivalenteHora();
        
        
        hora1.establecerHoras(24);
        hora1.establecerMinutos();
        hora1.establecerSegundos();
        hora1.establecerDias();
        
        System.out.printf("La hora ingresada:%d\n"
                + "%d minutos\n"
                + "%d segundos\n"
                + "%d dia\n",
                hora1.obtenerHoras(), 
                hora1.obtenerMinutos(),
                hora1.obtenerSegundos(),
                hora1.obtenerDias());
        
        
        // Hora 2 (segundo objeto)
        EquivalenteHora hora2 = new EquivalenteHora();
        
        hora2.establecerHoras(38);
        hora2.establecerMinutos();
        hora2.establecerSegundos();
        hora2.establecerDias();
        System.out.println("------------------------------------");
        System.out.printf("La hora ingresada:%d\n"
                + "%d minutos\n"
                + "%d segundos\n"
                + "%d dia\n",
                hora2.obtenerHoras(), 
                hora2.obtenerMinutos(),
                hora2.obtenerSegundos(),
                hora2.obtenerDias());
    }
    
}
    
    

