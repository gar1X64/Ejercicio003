package ejercicio003;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NombresTest {

		 void setUp() throws Exception{
			 
		 }
		 @Test
		 void testNombre() {
			 Nombres nombre = new Nombres();
			 
			 ArrayList<String> resultado = nombre.introducirNombres();
			 String personaAleatoria = nombre.nombreAleatorio();
			 
			 assertEquals(resultado , resultado, "nombres introducidos al arreglo");
			 

			 }
		 	
}
