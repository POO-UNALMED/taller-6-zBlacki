package vehiculos;

public class Automovil extends Vehiculo {
	
	int puestos;
	String auto;
	
	public Automovil(){
		this.puertas = 4;
		this.velocidadMaxima = 100;
		this.traccion = "FWD";
		this.cantidadVehiculos ++;
		this.tipoAutomovil ++;
	}
	
	public Automovil (String a, String b, int velocidadMaxima, int c, Fabricante fabricante, int puertas){
		this.puertas = 4;
		this.velocidadMaxima = 100;
		this.traccion = "FWD";
		this.pais = fabricante.getPais();
		this.pais.paises.add(this.pais);
		this.cantidadVehiculos ++;
		this.tipoAutomovil ++;
	}
	
	public int getPuestos() {
		return (this.puestos);
	}
	public void setPuestos(int puestoNuevo) {
		this.puestos = puestoNuevo;
	}
	
	
	
	
}
