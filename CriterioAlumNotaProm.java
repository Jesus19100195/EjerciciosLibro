/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.interfaces.criterio;
import Libro.cap02.interfaces.Alumno;
/**
 *
 * @author Jesus Eduardo
 */
public class CriterioAlumNotaProm extends Criterio<Alumno>

{
    public int comparar(Alumno a, Alumno b)
    {
        double diff = a.getNotaPromedio()- b.getNotaPromedio(); 
        return diff>0 ? 1: diff <0 ? -1 : 0;
    }
    
}
