/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.p;
import Libro.cap02.fechas.Fecha;
import Libro.cap02.misclases.FechaDetallada;
/**
 *
 * @author Jesus Eduardo
 */
public class TestPolimorfismo 
{
    public static void main(String[] args)
    {
        // a fec (de tipo Fecha) le asigno un objeto FechaDetallada
        Fecha fec = new FechaDetallada("25/02/2009");
        // a obj (de tipo Object) le asigno un objeto FechaDetallada
        Object obj = new FechaDetallada("3/12/2008");
        // Imprimo los dos objetos
        System.out.println("fec = "+fec); // invoca a toString de fec
        System.out.println("obj = "+obj); // invoca a toString de obj
    }    
}
