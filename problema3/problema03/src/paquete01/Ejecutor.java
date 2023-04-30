/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;
import paquete02.Instituciones;
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
        // Institucion 2 (primer objeto)
        Instituciones institucion1 = new Instituciones();
        
        institucion1.establecerNombre("La Dolorosa");
        institucion1.establecerTipo("Fiscomisional");
        institucion1.establecerNumeroSedes(1);
        institucion1.establecerNumeroAlumnos(4000);
        institucion1.establecerNumeroDocentes(300);
        institucion1.establecerGastosEstudiante(40);
        institucion1.establecerPresupuesto();
        
        System.out.printf("Informacion de la primera institucion\n"
                + "Nombre Institucion: %s\n"
                + "Tipo de la Institucion: %s\n"
                + "Numero de Alumnos: %d\n"
                + "Numero de Docentes: %d\n"
                + "Sedes: %d\n"
                + "Presupuesto: %.2f\n",
                 institucion1.obtenerNombre(),
                 institucion1.obtenerTipo(),
                 institucion1.obtenerNumeroAlumnos(),
                 institucion1.obtenerNumeroDocentes(),
                 institucion1.obtenerNumeroSedes(),
                 institucion1.obtenerPresupuesto());
        
        
        
        // Institucion 2 (segundo objeto)
        Instituciones institucion2 = new Instituciones();
        
        institucion2.establecerNombre("El Calazam");
        institucion2.establecerTipo("Particular");
        institucion2.establecerNumeroSedes(1);
        institucion2.establecerNumeroAlumnos(1700);
        institucion2.establecerNumeroDocentes(240);
        institucion2.establecerGastosEstudiante(53);
        institucion2.establecerPresupuesto();
        
        System.out.println("--------------------------------------------");
        System.out.printf("Informacion de la segunda institucion\n"
                + "Nombre Institucion: %s\n"
                + "Tipo de la Institucion: %s\n"
                + "Numero de Alumnos: %d\n"
                + "Numero de Docentes: %d\n"
                + "Sedes: %d\n"
                + "Presupuesto: %.2f\n",
                 institucion2.obtenerNombre(),
                 institucion2.obtenerTipo(),
                 institucion2.obtenerNumeroAlumnos(),
                 institucion2.obtenerNumeroDocentes(),
                 institucion2.obtenerNumeroSedes(),
                 institucion2.obtenerPresupuesto());
    }
    
}

