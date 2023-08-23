/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/*Elaborador por 
Ana Maria Casallas Ariza
Samuel Cuta Barrera
Gina Esperanza Alvarado Acosta*/
package estructuras;


import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Estructuras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEstudiantes = 5;

        Estudiante[] estudiantes = new Estudiante[numEstudiantes];

        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Ingrese los datos del estudiante " + (i + 1) + ":");
            
            System.out.print("Nombre: ");
            String nombre = scanner.next();
            
            System.out.print("Apellido: ");
            String apellido = scanner.next();
            
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            
            double[] notas = new double[3];
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese la nota " + (j + 1) + ": ");
                notas[j] = scanner.nextDouble();
            }
            
            estudiantes[i] = new Estudiante(nombre, apellido, edad, notas);
            
            System.out.println(); // Espacio entre estudiantes
        }
        
        // Ordenar estudiantes por edad de Amenor a mayor
        Arrays.sort(estudiantes, Comparator.comparingInt(Estudiante::getEdad));

        System.out.println("\nInformación de los estudiantes ordenados por edad de menor a mayor:");
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Estudiante " + (i + 1));
            System.out.println(estudiantes[i]);
        }

        // Ordenar estudiantes por promedio de notas de mayor a menor
        Arrays.sort(estudiantes, Comparator.comparingDouble(Estudiante::getPromedio).reversed());

        System.out.println("\nInformación de los estudiantes ordenados por promedio de notas de mayor a menor:");
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Estudiante " + (i + 1));
            System.out.println(estudiantes[i]);
        }

        scanner.close();
    }
}

