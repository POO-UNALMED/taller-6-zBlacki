package vehiculos;
import java.util.*;

public class Pais {
	
	private String nombre;
	static ArrayList<Pais> paises = new ArrayList<Pais>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return (this.nombre);
	}
	public void setNombre(String nombreNuevo) {
		this.nombre = nombreNuevo;
	}
	
	public static Pais paisMasVendedor() {
		return (new Pais("Ecuador"));
	}
}
