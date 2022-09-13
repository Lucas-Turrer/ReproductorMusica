package unlam.pb2;

import java.util.ArrayList;

public class ListaDeReproduccion {
	private ArrayList <Cancion> listaDeReproduccion = new ArrayList ();

	public void agregarCancion(Cancion cancionParaAgregar) {
		listaDeReproduccion.add(cancionParaAgregar);
	}

	public Integer cantidadDeCancionesEnLaLista() {
		return listaDeReproduccion.size();
	}

	public String listadoDeCanciones() {
		for (Cancion cancion : listaDeReproduccion) {
			return cancion.getNombreDeLaCancion();
		} return null;
		
	}

}
