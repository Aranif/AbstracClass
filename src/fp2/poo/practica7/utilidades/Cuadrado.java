package fp2.poo.practica7.utilidades;
import java.awt.Color;

public class Cuadrado extends MiFigura {
private float lado;
private Color color;

// Constructor
public Cuadrado(float lado, Color color) {
	this.lado = lado;
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
 public float getArea() {
	return (lado*lado);
	
}
/**
* Devuelve el perímetro de la figura como un float
* @return perimetro, tipo float
*/
 public float getPerimetro() {
	return (4*lado);
}
/**
* Devuelve el color de la figura como un String
* @return area, tipo String
*/
 public String getColor() {
	return color.toString();
}



}
