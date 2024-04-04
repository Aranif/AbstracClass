package fp2.poo.practica7.utilidades;
import java.awt.Color;
import java.util.*;

public class Circulo extends MiFigura{
private float diametro;
private float PI = 3.1416f;
private Color color;

// Constructor 
public Circulo(float dia, Color color) {
	diametro = dia;
	this.color = color; 
}

public String toString(){
int indicepunto=this.getClass().getName().lastIndexOf(".");
return this.getClass().getName().substring(indicepunto+1)
+ " de color " + this.getColor() + "\n";
}
/**
* Devuelve el área de la figura como un float
* @return area, tipo float
*/
   public float getArea(){
   return (PI*diametro/2)*(PI*diametro/2);
    }// A = pir²
/**
* Devuelve el perímetro de la figura como un float
* @return perimetro, tipo float
*/
 public float getPerimetro() {
	 return 2*PI*(diametro/2);
 }
/**
* Devuelve el color de la figura como un String
* @return area, tipo String
*/
 public String getColor() {
	 return color.toString();
	 
 }
}
