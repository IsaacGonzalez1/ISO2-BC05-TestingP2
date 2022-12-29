package ISO2_BC05.TestingP2;

import static org.junit.Assert.*;
import org.junit.Test;


public class pruebatriangulo {

	   	@Test
	   	public void creartriangulo() {
	   		triangulo t = new triangulo(5, 5, 5);
	   	}
	    @Test
	    public void testEquilatero() {
	        triangulo t = new triangulo(5, 5, 5);
	        assertTrue(maintriangulo.Equilatero(t));
	    }
	    @Test
	    public void testIsosceles() {
	        triangulo t = new triangulo(5, 5, 7);
	        assertTrue(maintriangulo.Isosceles(t));
	    }

	    
	    @Test
	    public void testEscaleno() {
	        triangulo t = new triangulo(5, 6, 7);
	        assertTrue(maintriangulo.Escaleno(t));
	    }

	   
	    @Test
	    public void testRectangulo() {
	        triangulo t = new triangulo(3, 4, 5);
	        assertTrue(maintriangulo.Rectangulo(t));
	        
	        
	        triangulo t2 = new triangulo(3, 5, 4);
	        assertTrue(maintriangulo.Rectangulo(t2));
	        triangulo t3 = new triangulo(5, 4, 3);
	        assertTrue(maintriangulo.Rectangulo(t3));
	    }

	    
	
	    @Test
	    public void testAcutangulo() {
	        triangulo t = new triangulo(3, 4, 5);
	        assertTrue(maintriangulo.Acutangulo(t));
	    }

	   
	    @Test
	    public void testObtusangulo() {
	        triangulo t = new triangulo(6,5,2);
			assertEquals(true,maintriangulo.Obtusangulo(t));
			
	    }
	
}


