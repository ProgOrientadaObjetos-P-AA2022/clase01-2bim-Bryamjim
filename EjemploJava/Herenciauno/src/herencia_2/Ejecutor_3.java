/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_2;

import herencia_1.EstudianteDistancia;
import herencia_1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejecutor_3 {
    public static void main(String[] args) {
        int c;

        Scanner leer = new Scanner (System.in);
        leer.useLocale(Locale.US);
        
        EstudiantePresencial estudianteP = new EstudiantePresencial();
        EstudianteDistancia estudianteD = new EstudianteDistancia();
        
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
        
        System.out.println("Numero de asignaturas");
        int numeroasignaturas = leer.nextInt();
        
        
        
            try {
            System.out.println("elija la opcion que desea");
            System.out.println("Estudiantes distancia      [1]");
            System.out.println("Estudiantes Presencial     [2]");
            System.out.println("0 Regresar");
            
            
            c = leer.nextInt();
            leer.nextLine();
            
            switch (c) {
                case 1:
                    
                    estudianteD.establecerNombresEstudiante(nombre);
                    System.out.println(nombre);
                    estudianteD.establecerApellidoEstudiante(apellido);
                    System.out.println(apellido);
                    estudianteD.establecerIdentificacionEstudiante(identidad);
                    System.out.println();
                    estudianteD.establecerEdadEstudiante(edad);
                    estudianteD.establecerCostoAsignatura(costo);
                    estudianteD.establecerNumeroAsginaturas(numeroasignaturas);
                    estudianteD.calcularMatriculaDistancia();
                    break;
                case 2:
                    estudianteP.establecerNombresEstudiante(nombre);
                    estudianteP.establecerApellidoEstudiante(apellido);
                    estudianteP.establecerIdentificacionEstudiante(identidad);
                    estudianteP.establecerEdadEstudiante(edad);
                    estudianteP.establecerNumeroCreditos(creditos);
                    estudianteP.establecerCostoCredito(costo);
                    estudianteP.calcularMatriculaPresencial();
                    break;
            }
        }catch (Exception e) {  
            System.out.println("Error al dijitar.");
        }
            
    }
        /*
        En el método **main**, se debe permitir ingresar objetos 
        de tipo Estudiante Distancia y Estudiante Presencial. 
        Uno a la vez. Si el usuario ingresa 1, se debe crear un 
        Estudiante Distancia por teclado; si ingresa 2, se debe crear un 
        Estudiante Presencial. Los datos de entrada serán ingresados por 
        teclado.

        Restricciones:
        * En el código solo debe usar por una sola ocasión la siguiente 
        sentencias
        ```
            nombres = entrada.nextLine()
            cedula = entrada.nextLine()
        ```
        * Si el usuario ingresa algo diferente de 1 o 2; el programa debe 
        presentar un mensaje que diga: "Error, opción no válida."
        
        */
    }
    


