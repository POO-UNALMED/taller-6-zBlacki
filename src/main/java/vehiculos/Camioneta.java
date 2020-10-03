package vehiculos;

public class Camioneta extends Vehiculo {

	boolean volco;
	
	public Camioneta(){
		this.velocidadMaxima = 90;
		this.traccion = "4X4";
		this.cantidadVehiculos ++;
		this.tipoCamioneta ++;
	}
	
	public Camioneta(String a, int b, String c, int d, int e, Fabricante fabricante, boolean f){
		this.puertas = 4;
		this.velocidadMaxima = 90;
		this.traccion = "4X4";
		this.pais = fabricante.getPais();
		this.pais.paises.add(this.pais);
		this.cantidadVehiculos ++;
		this.tipoCamioneta ++;
	}
	
	public boolean isVolco() {
		return (this.volco);
	}
	public void setVolco(boolean volcoNuevo) {
		this.volco = volcoNuevo;
	}
	
	
}
