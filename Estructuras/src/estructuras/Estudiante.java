/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import java.util.Arrays;

class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private double[] notas;

    public Estudiante(String nombre, String apellido, int edad, double[] notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.notas = notas;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        double sumaNotas = 0;
        for (double nota : notas) {
            sumaNotas += nota;
        }
        return sumaNotas / notas.length;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nApellido: " + apellido +
               "\nEdad: " + edad +
               "\nNotas ingresadas: " + Arrays.toString(notas) +
               "\nPromedio de notas: " + getPromedio();
    }
}
