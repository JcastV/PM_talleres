import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
		System.out.println("Ingrese su peso");
		Scanner pesoEscaner = new Scanner (System.in); 
		float peso = Integer.parseInt(pesoEscaner.nextLine());
		
		System.out.println("Ingrese su altura en centimetros");
		Scanner alturaEscaner = new Scanner (System.in); 
		float altura = Integer.parseInt(alturaEscaner.nextLine());	
		
		persona p1 = new persona();
	    float IMC = p1.calcularIMC(peso, altura);
	    
	    System.out.println("Su IMC es : " + IMC);
		
	}

}
