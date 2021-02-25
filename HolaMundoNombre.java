/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap01;
import java.util.Scanner;
/**
 *
 * @author Jesus Eduardo
 */
public class HolaMundoNombre {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //Mensaje para el usuario
        System.out.println("Ingrese nombre edad alrura: ");
        //Leemos el nombre
        String nom = scanner.next();
        //Leemos la edad
        int edad = scanner.nextInt();
        //Leemos la altura
        double altura = scanner.nextDouble();
        //Mostramos los datos por consola
        System.out.println("Nombre: "+nom+" Edad: "+ edad +" Altura: "+ altura);
    }
}
