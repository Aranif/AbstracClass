package fp2.poo.practica7.utilidades;
import fp2.poo.practica7.utilidades.*;
import java.lang.*; 
//Install this class in your PC
import java.awt.Color;


public class Main{
	public static void main(String args[]){
	
	//Two objets( of type Circulo and Cuadrado ) receive 
	//objets of type Color
	Color color = new Color((int)21.3, (int)24.3, (int)43.1);
    // I declare and intantiate the objects c and s
    Circulo c = new Circulo((float)15.2, color);
    Cuadrado s = new Cuadrado((float)2.3, color);
    
    //Print areas
    System.out.println("Area del circulo: "+c.getArea());
    System.out.println("Area del cuadrado: "+s.getArea());
    
    // "toString use to print the color 
   System.out.println(c);
   System.out.println(s);
    

	}


}
