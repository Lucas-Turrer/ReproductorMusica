package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import unlam.pb2.Cancion;
import unlam.pb2.ListaDeReproduccion;
import unlam.pb2.Usuario;

public class testReproductor {

	@Test
	public void queSeCreaUnUsuario() {
		Usuario usuarioLucas = new Usuario ("Lucas", "Turrer", 37931874);
		assertNotNull(usuarioLucas);
	}
	
	@Test
	public void queSeCreaUnaListaDeReproduccion() {
		Usuario usuarioLucas = new Usuario ("Lucas", "Turrer", 37931874);
		Cancion tema1 = new Cancion ("Tiempo", 03.22);
		Cancion tema2 = new Cancion ("Eras", 04.22);
		ListaDeReproduccion listaNueva = new ListaDeReproduccion ();
		
		listaNueva.agregarCancion(tema1);
		listaNueva.agregarCancion(tema2);
		
		Integer valorEsperado = 2;
		Integer valorObtenido = listaNueva.cantidadDeCancionesEnLaLista();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queSeInformeLaLista() {
		Usuario usuarioLucas = new Usuario ("Lucas", "Turrer", 37931874);
		Cancion tema1 = new Cancion ("Tiempo", 03.22);
		Cancion tema2 = new Cancion ("Eras", 04.22);
		ListaDeReproduccion listaNueva = new ListaDeReproduccion ();
		
		listaNueva.agregarCancion(tema1);
		listaNueva.agregarCancion(tema2);
		
		System.out.println(listaNueva.listadoDeCanciones());
		
	}

}
