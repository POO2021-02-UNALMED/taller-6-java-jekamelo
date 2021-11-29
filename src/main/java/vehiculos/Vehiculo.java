package vehiculos;

import java.util.ArrayList;

public class Vehiculo {
	private static int cantidadVehiculos;
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private	String traccion;
	private Fabricante fabricante;
	public static ArrayList<Vehiculo> autos = new ArrayList<Vehiculo>();
	
	
	public Vehiculo(String placa,int puertas,int velocidadMaxima,String nombre,int precio,int peso,String traccion,Fabricante fabricante) {
			this.placa = placa;
			this.puertas = puertas;
			this.velocidadMaxima = velocidadMaxima;
			this.nombre = nombre;
			this.precio = precio;
			this.traccion = traccion;
			this.fabricante = fabricante;
			Vehiculo.cantidadVehiculos += 1;
			Vehiculo.autos.add(this);
		
	}
	
	
	public String getPlaca() {
		return placa;
	}
	
	public int getPuertas() {
		return puertas;
	}
	
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public String getTraccion() {
		return traccion;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	
	public static void setCantidadVehiculos(int numero) {
		Vehiculo.cantidadVehiculos = numero;
	}
	
	public static String vehiculosPorTipo() {
		return "Automoviles: "+ Automovil.totalAutos+"\n"+
				"Camionetas: "+Camioneta.totalCamionetas+"\n"+
				"Camiones: "+Camion.totalCamiones;
		
	}
	
	

}
