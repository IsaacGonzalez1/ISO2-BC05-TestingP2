package Implementación;
import java.util.Scanner;

public class triangulo {
	public static Scanner scanner = new Scanner(System.in);
	private int lado1;
	private int lado2;
	private int lado3;

	  public triangulo(int a, int b, int c) {
	    this.lado1 = a;
	    this.lado2 = b;
	    this.lado3 = c;
	  }
	 

	public boolean Equilatero() {
	    return lado1 == lado2 && lado2 == lado3;
	  }

	  public boolean Isosceles() {
	    return lado1 == lado2 || lado1 == lado3 || lado2 == lado3;
	  }

	  public boolean Escaleno() {
	    return lado1 != lado2 && lado2 != lado3 && lado1 != lado3;
	  }

	  public boolean Rectángulo() {
	    return lado1*lado1 + lado2*lado2 == lado3*lado3 ||
	           lado1*lado1 + lado3*lado3 == lado2*lado2 ||
	           lado2*lado2 + lado3*lado3 == lado1*lado1;
	  }

	  public boolean Acutángulo() {
	    return lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2;
	  }

	  public boolean Obtusangulo() {
	    return !Acutángulo();
	  }
	  public static int controlLados() {
		  int lado=-1;
		  while(lado <= 0) {
              System.out.print("Ingrese el lado: ");
              try {
                  lado = scanner.nextInt();
              } catch (Exception e) {
                  System.out.println("Por favor no introduzca caracteres, únicamente valores enteros positivos");
                  scanner.nextLine();
                  
              }
              
        }
		  return lado;
	  }

	  public static void main(String[] args) {
		System.out.println("Bienvenido al programa, por favor introduzca 3 lados y se determinará que tipo de triangulo es");
	    System.out.println("En caso de que introduzca un valor negativo se le volverá a pedir el mismo número");
	    
	    int a = triangulo.controlLados();
	    int b = triangulo.controlLados();
	    int c = triangulo.controlLados();

	    triangulo triangulo = new triangulo(a, b, c);
	    if (triangulo.Equilatero()) {
	      System.out.println("Es un triángulo equilátero");
	    }
	    if (triangulo.Isosceles()) {
	      System.out.println("Es un triángulo isósceles");
	    }
	    if (triangulo.Escaleno()) {
	      System.out.println("Es un triángulo escaleno");
	    }
	    if (triangulo.Rectángulo()) {
	      System.out.println("Es un triángulo rectángulo");
	    }
	    if (triangulo.Acutángulo()) {
	      System.out.println("Es un triángulo acútangulo");
	    }
	    if (triangulo.Obtusangulo()) {
	      System.out.println("Es un triángulo obtusángulo");
	    }
	  }
	}

