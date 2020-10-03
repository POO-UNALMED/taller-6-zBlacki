package vehiculos;

public class Camion extends Vehiculo {

	int ejes;
	
	public Camion(){
		this.puertas = 2;
		this.velocidadMaxima = 80;
		this.traccion = "4X2";
		this.cantidadVehiculos ++;
		this.tipoCamion ++;
	}
	
	public Camion(String a, String b, int c, int d, Fabricante fabricante, int e) {
		this.puertas = 2;
		this.velocidadMaxima = 80;
		this.traccion = "4X2";
		this.pais = fabricante.getPais();
		this.pais.paises.add(this.pais);
		this.cantidadVehiculos ++;
		this.tipoCamion ++;
	}
}


