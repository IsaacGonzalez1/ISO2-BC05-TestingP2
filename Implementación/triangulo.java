package Implementaci�n;
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

	  public boolean Rect�ngulo() {
	    return lado1*lado1 + lado2*lado2 == lado3*lado3 ||
	           lado1*lado1 + lado3*lado3 == lado2*lado2 ||
	           lado2*lado2 + lado3*lado3 == lado1*lado1;
	  }

	  public boolean Acut�ngulo() {
	    return lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2;
	  }

	  public boolean Obtusangulo() {
	    return !Acut�ngulo();
	  }
	  public static int controlLados() {
		  int lado=-1;
		  while(lado < 0) {
              System.out.print("Ingrese el lado: ");
              try {
                  lado = scanner.nextInt();
              } catch (Exception e) {
                  System.out.println("Por favor no introduzca caracteres, �nicamente valores enteros positivos");
                  scanner.nextLine();
                  
              }
              
        }
		  return lado;
	  }

	  public static void main(String[] args) {
		System.out.println("Bienvenido al programa, por favor introduzca 3 lados y se determinar� que tipo de triangulo es");
	    System.out.println("En caso de que introduzca un valor negativo se le volver� a pedir el mismo n�mero");
	    
	    int a = triangulo.controlLados();
	    int b = triangulo.controlLados();
	    int c = triangulo.controlLados();

	    triangulo triangulo = new triangulo(a, b, c);
	    if (triangulo.Equilatero()) {
	      System.out.println("Es un tri�ngulo equil�tero");
	    }
	    if (triangulo.Isosceles()) {
	      System.out.println("Es un tri�ngulo is�sceles");
	    }
	    if (triangulo.Escaleno()) {
	      System.out.println("Es un tri�ngulo escaleno");
	    }
	    if (triangulo.Rect�ngulo()) {
	      System.out.println("Es un tri�ngulo rect�ngulo");
	    }
	    if (triangulo.Acut�ngulo()) {
	      System.out.println("Es un tri�ngulo ac�tangulo");
	    }
	    if (triangulo.Obtusangulo()) {
	      System.out.println("Es un tri�ngulo obtus�ngulo");
	    }
	  }
	}

