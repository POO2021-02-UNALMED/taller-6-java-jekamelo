package vehiculos;

import java.util.ArrayList;

public class Automovil extends Vehiculo{
	int puestos;
	public static int totalAutos;
	
	
	
	public Automovil(String placa,String nombre,int precio,int peso,Fabricante fabricante,int puestos) {
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos = puestos;
		Automovil.totalAutos += 1;
	}
	
	
	

}
