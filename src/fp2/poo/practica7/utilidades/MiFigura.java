/*
* @(#)MiFigura.java
*
* Fundamentos de Programacion II. GITT.
* Departamento de Ingenieria Telematica
* Universidad de Sevilla
*
*/
/**
* Descripcion: Implementación de la interfaz Figura genérica, para métodos
* comunes, en este caso solamente el método toString, para mostrar las
clases
* como interesa.
*
* @version 1.0 Marzo 2016 (Modificado Abril 2018)
* @author Fundamentos de Programacion II
*/
package fp2.poo.practica7.utilidades;

public abstract class MiFigura implements Figura {
/**
* Sobreescritura del método toString, que facilita la depuración
* y análisis del código.
*
* @return la figura como un String, tipo String
* @see java.lang.Object#toString
*/
public String toString(){
int indicepunto=this.getClass().getName().lastIndexOf(".");
return this.getClass().getName().substring(indicepunto+1)
+ " de color " + this.getColor() + "\n";
}
/**
* Devuelve el área de la figura como un float
* @return area, tipo float
*/
abstract public float getArea();
/**
* Devuelve el perímetro de la figura como un float
* @return perimetro, tipo float
*/
abstract public float getPerimetro();
/**
* Devuelve el color de la figura como un String
* @return area, tipo String
*/
abstract public String getColor();
}
