/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author laboratorio
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int total;
        int[] cedula = new int[3];
        String[][] nombreApellido = new String[3][2];
        int[][] notas = new int[3][3];
        double[] prom = new double[3];
        
        /*
        Scanner valor= new Scanner(System.in);
        Scanner valor1= new Scanner(System.in);
        for (int i=0; i<cedula.length; i++){
        
            System.out.println(".: Datos del Alumno :." +(i + 1));
            System.out.print("Cedula: "  );
            cedula[i]=valor1.nextInt();
            System.out.print("Nombre: "  );
            nombreApellido[i][0]=valor.nextLine();
            System.out.print("Apellido: "  );
            nombreApellido[i][1]=valor.nextLine();
            System.out.print("Nota 1: ");
            notas[i][0]=valor1.nextInt();
            System.out.print("Nota 2: ");
            notas[i][1]=valor1.nextInt();
            System.out.print("Nota 3: ");
            notas[i][2]=valor1.nextInt();
        }
        for (int i=0; i < cedula.length; i++){
        prom[i]= (notas[i][0]+notas[i][1]+notas[i][2])/3;               
        }
        System.out.println(".:Listado de Alumnos:.");
        for (int i=0; i < cedula.length; i++){
            System.out.println(cedula[i] + " " +
                   nombreApellido[i][0] + " " + 
                   nombreApellido[i][1] + " " + 
                   prom[i]);       
        }
*/
        // Para Generar caja de Texto Ingreso
        String Nombre = JOptionPane.showInputDialog(null, "Nombre");
        System.out.println(Nombre);
        String notaAux = JOptionPane.showInputDialog(null, "Nota 1");
        int nota = Integer.parseInt(notaAux);
        System.out.println(nota);
        String nota2Aux = JOptionPane.showInputDialog(null, "Nota 2");
        int nota2 = Integer.parseInt(nota2Aux);
        System.out.println(nota2);
        String nota3Aux = JOptionPane.showInputDialog(null, "Nota 3");
        int nota3 = Integer.parseInt(nota3Aux);
        System.out.println(nota3);
        total=(nota+nota2+nota3)/3;
        //Imprimir sms
        JOptionPane.showMessageDialog(null,"Promedio Final: "+ total);
    }
    
}
