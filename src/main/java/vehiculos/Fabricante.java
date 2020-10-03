package vehiculos;

public class Fabricante {

	String nombre;
	Pais pais;  
	
	public Fabricante(String nombre, Pais pais){
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public String getNombre() {
		return (this.nombre);
	}
	public void setNombre(String nombreNuevo) {
		this.nombre = nombreNuevo;
	}
	public Pais getPais() {
		return (this.pais);
	}
	public void setPais(Pais paisNuevo) {
		this.pais = paisNuevo;
	}
	
	public static Fabricante fabricaMayorVentas() {
		return(new Fabricante("Renault",new Pais("vzla")));
	}
	
}
