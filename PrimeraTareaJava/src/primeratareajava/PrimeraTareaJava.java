/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeratareajava;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author RafaPC
 * Rafael Perez Guerrero
 * CI.- 15620262
 * Java - Prof. Rodolfo
 * 
 */
public class PrimeraTareaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] cedula = new int[1];
        String[][] nombreApellido = new String[3][2];
        int[][] notas = new int[3][3];
        double[] promedio = new double[3];
        double prom;
             
        Scanner valor = new Scanner(System.in);
        //Scanner valor1 = new Scanner(System.in);
        
        //Capturo cantidad de Alumnos
        String numEstuAux = JOptionPane.showInputDialog(null, "Introduzca el numero de Estudiantes: ");
        int numEstu = Integer.parseInt(numEstuAux);
        System.out.println(numEstu);
        
        //Comienzo el bucle hasta la cantidad de alumnos recibida
        for (int i = 0; i < numEstu; i++){
            JOptionPane.showMessageDialog(null, "Datos del Alumnos " + (i + 1));
            
            //Capturo cedula
            String cedulaAux = JOptionPane.showInputDialog(null, "Intruduzca Cedula: ");
            int cedula2 = Integer.parseInt(cedulaAux);
            System.out.println(cedula2);
                        
            //Capturo Nombre
            String nombre1 = JOptionPane.showInputDialog(null, "Intruduzca Nombre: ");
            System.out.println(nombre1);
                        
            //Capturo Apellido
            String apellido1 = JOptionPane.showInputDialog(null, "Intruduzca Apellido: ");
            System.out.println(apellido1);
                        
            //Capturo nota1
            String notaAux = JOptionPane.showInputDialog(null, "Intruduzca Nota 1: ");
            int nota1 = Integer.parseInt(notaAux);
            System.out.println(nota1);
                        
            //Capturo nota2
            String notaAux2 = JOptionPane.showInputDialog(null, "Intruduzca Nota 2: ");
            int nota2 = Integer.parseInt(notaAux2);
            System.out.println(nota2);
                        
             //Capturo nota3
            String notaAux3 = JOptionPane.showInputDialog(null, "Intruduzca Nota 3: ");
            int nota3 = Integer.parseInt(notaAux3);
            System.out.println(nota3);
            
           //Calculo el promedio de las tres notas 
           prom = (nota1 + nota2 + nota3) / 3;
           
           //Imprimo los datos
           JOptionPane.showMessageDialog(null, "Cedula Identidad: " + cedula2 + " Nombre: " + nombre1 + 
           " Apellido: "  + apellido1 + " 1er Nota: " + " 2da Nota: " + nota2 + " 3era Nota: " + nota3 +
           " Su promedio final es: " + prom);
          
        }
            
    }
    
}
