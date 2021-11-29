package vehiculos;
import java.util.ArrayList;
import java.util.Collections;

public class Fabricante {
	private String nombre;
	private Pais pais;
	public static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		Fabricante.fabricantes.add(this);
	}
	
	public Pais getPais() {
		return pais;
	}
	public String getNombre() {
		return nombre;
	}
	
	public static Fabricante fabricaMayorVentas() {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for (int j=0;j<Vehiculo.autos.size();j++) {
			int conteo = 0;
			for (int i=0;i<Vehiculo.autos.size();i+=1) {
				if ((Vehiculo.autos.get(i).getFabricante()).equals(Vehiculo.autos.get(j).getFabricante())){
					conteo ++;
				}
				
			}
			lista.add(conteo);
		}
		int indice = 0;
		int maximo = 0;
		for (int i=0;i<Vehiculo.autos.size();i++) {
			if (lista.get(i) > maximo ) {
				maximo = lista.get(i);
			}
			
				
		}
		for (int i=0;i<Vehiculo.autos.size();i++) {
			if (lista.get(i)== maximo) {
				indice = i;
				break;
			}	
		}
		return Vehiculo.autos.get(indice).getFabricante();
		
		}
		

		
		
	}


