package ISO2_BC05.TestingP2;

import java.util.Scanner;

public class maintriangulo {
	public static Scanner scanner = new Scanner(System.in);
	 public static void main(String[] args) {
			System.out.println("Bienvenido al programa, por favor introduzca 3 lados y se determinará que tipo de triangulo es");
		    System.out.println("En caso de que introduzca un valor negativo se le volverá a pedir el mismo número");
		    
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    int c= scanner.nextInt();

		    triangulo triangulo = new triangulo(a, b, c);
		    if (Equilatero(triangulo)) {
		      System.out.println("Es un triángulo equilátero");
		    }
		    if (Isosceles(triangulo)) {
		      System.out.println("Es un triángulo isósceles");
		    }
		    if (Escaleno(triangulo)) {
		      System.out.println("Es un triángulo escaleno");
		    }
		    if (Rectangulo(triangulo)) {
		      System.out.println("Es un triángulo rectángulo");
		    }
		    if (Acutangulo(triangulo)) {
		      System.out.println("Es un triángulo acútangulo");
		    }
		    if (Obtusangulo(triangulo)) {
		      System.out.println("Es un triángulo obtusángulo");
		    }
		  }
		  public static boolean Equilatero(triangulo t1){
			  int lado1= t1.getLado1();
			  int lado2= t1.getLado2();
			  int lado3= t1.getLado3();
			    return lado1 == lado2 && lado2 == lado3;
			  }

			  public static boolean Isosceles(triangulo t1) {
				  int lado1= t1.getLado1();
				  int lado2= t1.getLado2();
				  int lado3= t1.getLado3();
			    return lado1 == lado2 || lado1 == lado3 || lado2 == lado3;
			  }

			  public static boolean Escaleno (triangulo t1) {
				  int lado1= t1.getLado1();
				  int lado2= t1.getLado2();
				  int lado3= t1.getLado3();
			    return lado1 != lado2 && lado2 != lado3 && lado1 != lado3;
			  }

			  public static boolean Rectangulo( triangulo t1) {
				  int lado1= t1.getLado1();
				  int lado2= t1.getLado2();
				  int lado3= t1.getLado3();
			    return lado1*lado1 + lado2*lado2 == lado3*lado3 ||
			           lado1*lado1 + lado3*lado3 == lado2*lado2 ||
			           lado2*lado2 + lado3*lado3 == lado1*lado1;
			  }

			  public static boolean Acutangulo(triangulo t1) {
				  int lado1= t1.getLado1();
				  int lado2= t1.getLado2();
				  int lado3= t1.getLado3();
			    return lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2;
			  }

			  public static boolean Obtusangulo(triangulo t1) {
				  int lado1= t1.getLado1();
				  int lado2= t1.getLado2();
				  int lado3= t1.getLado3();
				  boolean ac = lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2;
			    return !ac;
			  }
			  
		
}
