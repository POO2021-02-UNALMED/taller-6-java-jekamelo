package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}	
	
	public String getNombre() {
		return nombre;
	}
	
	public static Pais paisMasVendedor() {
	
			ArrayList<Integer> lista = new ArrayList<Integer>();
			for (int j=0;j<Vehiculo.autos.size();j++) {
				int conteo = 0;
				for (int i=0;i<Vehiculo.autos.size();i+=1) {
					if ((Vehiculo.autos.get(i).getFabricante().getPais()).equals(Vehiculo.autos.get(j).getFabricante().getPais())){
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
			return Vehiculo.autos.get(indice).getFabricante().getPais();
			
			}
	}
	


