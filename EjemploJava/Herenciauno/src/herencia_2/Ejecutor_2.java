/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_2;

import herencia_1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejecutor_2 {
    public static void main(String[] args) {
        //1. Crear un objeto de tipo Estudiante Presencial
        //con datos por teclado
        
        Scanner leer = new Scanner (System.in);
        leer.useLocale(Locale.US);
        
        EstudiantePresencial estudiante = new EstudiantePresencial();
        
        System.out.println("Ingresar nombre ");
        String nombre = leer.nextLine();
        
        System.out.println("Ingresar apellido");
        String apellido = leer.nextLine();
        
        System.out.println("Ingresar cedula");
        String identidad = leer.nextLine();
        
        System.out.println("Ingresar edad");
        int edad = leer.nextInt();
        
        System.out.println("Ingresar numero de creditos");
        int creditos = leer.nextInt();
        
        System.out.println("Ingreasr costos");
        double costo = leer.nextDouble();
        
        estudiante.establecerNombresEstudiante(nombre);
        estudiante.establecerApellidoEstudiante(apellido);
        estudiante.establecerIdentificacionEstudiante(identidad);
        estudiante.establecerEdadEstudiante(edad);
        estudiante.establecerNumeroCreditos(creditos);
        estudiante.establecerCostoCredito(costo);
        estudiante.calcularMatriculaPresencial();
        
        System.out.printf("%s\n", estudiante.obtenerNombresEstudiante(),
                estudiante.obtenerApellidoEstudiante(), 
                estudiante.obtenerIdentificacionEstudiante(),
                estudiante.obtenerEdadEstudiante(),
                estudiante.obtenerNumeroCreditos(),
                estudiante.obtenerCostoCredito(),
                estudiante.obtenerMatriculaPresencial());
        

    }
}
