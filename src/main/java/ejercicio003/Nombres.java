package ejercicio003;

import java.util.ArrayList;
import java.util.Random;

public class Nombres {
	
	  public ArrayList<String> personas=new ArrayList<String>();

	
	public Nombres() {

	}
	
	public ArrayList<String> introducirNombres(){  
		      personas.add("Juan Fernandez");    
		      personas.add("Pedro Gomez");    
		      personas.add("Juan juanito");    
		      personas.add("Carlos Sanchez");    

		      return (personas);
		 }  
	public String nombreAleatorio() {
	    Random rand = new Random();
	    try {
			return personas.get(rand.nextInt(personas.size()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
