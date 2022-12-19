package Implementación;
import java.util.Scanner;

public class triangulo {
	public static Scanner scanner = new Scanner(System.in);
	private int sideA;
	private int sideB;
	private int sideC;

	  public triangulo(int a, int b, int c) {
	    this.sideA = a;
	    this.sideB = b;
	    this.sideC = c;
	  }
	 
	  public static int controlLados() {
		  int lado=-1;
		  while(scanner.nextInt() > 0) {
              System.out.print("Ingrese el lado: ");
              try {
                  lado = scanner.nextInt();
              } catch (Exception e) {
                  System.out.println("Valor númerico erróneo, introduzca valores enteros positivos por favor");
              }
        }
		  return lado;
	  }

	  public static void main(String[] args) {

	    int a = triangulo.controlLados();
	    int b = triangulo.controlLados();
	    int c = triangulo.controlLados();

	    triangulo triangulo = new triangulo(a, b, c);
	    if (sideA == sideB && sideB == sideC) {
	      System.out.println("Es un triángulo equilátero");

	    } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
	      System.out.println("Es un triángulo isósceles");

	    } else if (sideA != sideB && sideB != sideC && sideA != sideC) {
	      System.out.println("Es un triángulo escaleno");

	    }
	    if (sideA*sideA + sideB*sideB == sideC*sideC || sideA*sideA + sideC*sideC == sideB*sideB || sideB*sideB + sideC*sideC == sideA*sideA) {
	      System.out.println("Es un triángulo rectángulo");

	    } else if (sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB) {
	      System.out.println("Es un triángulo acútangulo");

	    } else if (sideA*sideA + sideB*sideB < sideC*sideC || sideA*sideA + sideC*sideC < sideB*sideB || sideB*sideB + sideC*sideC < sideA*sideA) {
	      System.out.println("Es un triángulo obtusángulo");
	    }
	  }
	}

