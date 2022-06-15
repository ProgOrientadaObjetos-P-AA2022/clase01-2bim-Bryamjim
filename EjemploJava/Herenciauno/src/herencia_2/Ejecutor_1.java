/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_2;
import herencia_1.EstudianteDistancia;
/**
 *
 * @author USUARIO
 */
public class Ejecutor_1 {
    public static void main(String[] args) {
        //1.Crear un objeto de tipo Estudiante Distancia
        EstudianteDistancia estudiante = new EstudianteDistancia();
        estudiante.establecerNombresEstudiante("Bryam");
        estudiante.establecerApellidoEstudiante("Jimenez");
        estudiante.establecerIdentificacionEstudiante("1150563086");
        estudiante.establecerEdadEstudiante(20);
        estudiante.establecerCostoAsignatura(30);
        estudiante.establecerNumeroAsginaturas(30);
        estudiante.calcularMatriculaDistancia();
        
        System.out.printf("%s - (%.2f)\n" );
        
    }
}
