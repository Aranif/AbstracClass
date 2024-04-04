package fp2.poo.practica7.utilidades;
import fp2.poo.practica7.utilidades.*;
import java.lang.*; 
import java.awt.Color;


public class Main{
	public static void main(String args[]){
	
	//Los dos objetos reciven un obj de tipo color
	Color color = new Color((int)21.3, (int)24.3, (int)43.1);
    //Declaro e instancio objetos
    Circulo c = new Circulo((float)15.2, color);
    Cuadrado s = new Cuadrado((float)2.3, color);
    
    //Imprime areas
    System.out.println("Area del circulo: "+c.getArea());
    System.out.println("Area del cuadrado: "+s.getArea());
    
    //uso de "toString para imprimir el color
   System.out.println(c);
   System.out.println(s);
    

	}


}
