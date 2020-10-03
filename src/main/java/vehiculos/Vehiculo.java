package vehiculos;

import java.util.ArrayList;

public class Vehiculo {

	String placa;
	int puertas;
	int velocidadMaxima;
	int precio;
	int peso;
	static int tipoAutomovil;
	static int tipoCamioneta;
	static int tipoCamion;
	static int cantidadVehiculos;
	String nombre;
	String traccion;
	Pais pais;
	

	static String vehiculosPorTipo() {
		return ("Automoviles: " + tipoAutomovil + "\n Camionetas" + tipoCamioneta + "\n Camiones: " + tipoCamion);
	}
	
	public Vehiculo() {
	}
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;	
		this.cantidadVehiculos ++;
		this.pais = fabricante.getPais();
		this.pais.paises.add(this.pais);
	}

	public String getPlaca() {
		return (this.placa);
	}
	public void setPuestos(String placaNueva) {
		this.placa = placaNueva;
	}
	public int getPuertas() {
		return (this.puertas);
	}
	public void setPuertas(int puertaNueva) {

		this.puertas = puertaNueva;
	}
	public int getVelocidadMaxima() {
		return (this.velocidadMaxima);
	}
	public void setVelocidadMaxima(int velocidadNueva) {
		this.velocidadMaxima = velocidadNueva;
	}
	public int getPrecio() {
		return (this.precio);
	}
	public void setPrecio(int precioNuevo) {
		this.precio = precioNuevo;
	}
	public int getPeso() {
		return (this.peso);
	}
	public void setPeso(int pesoNuevo) {
		this.peso = pesoNuevo;
	}
	
	public String getNombre() {
		return (this.nombre);
	}
	public void setNombre(String nombreNuevo) {
		this.nombre = nombreNuevo;
	}
	public String getTraccion() {
		return (this.traccion);
	}
	public void setTraccion(String traccionNueva) {
		this.traccion = traccionNueva;
	}
	public static int getCantidadVehiculos(){
		return (cantidadVehiculos);
	}
	public static void setCantidadVehiculos(int nuevaCantidad) {
		cantidadVehiculos = nuevaCantidad;
	}
	
}
