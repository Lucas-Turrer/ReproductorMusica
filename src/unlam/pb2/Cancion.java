package unlam.pb2;

public class Cancion {
	private String nombreDeLaCancion;
	private Double duracion;

	public Cancion(String nombreDeLaCancion, Double duracion) {
		this.nombreDeLaCancion = nombreDeLaCancion;
		this.duracion = duracion;
	}

	public String getNombreDeLaCancion() {
		return nombreDeLaCancion;
	}

	public void setNombreDeLaCancion(String nombreDeLaCancion) {
		this.nombreDeLaCancion = nombreDeLaCancion;
	}

	public Double getDuracion() {
		return duracion;
	}

	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}
	

}
