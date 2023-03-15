package Serie;

public class Serie {

	// constantes que indican el valor por defecto
	final private String TITULO_POR_DEFECTO = "";
	final private int TEMPORADAS_POR_DEFECTO = 3;
	final private boolean ENTREDAGO_POR_DEFECTO = false;
	final private String GENERO_POR_DEFECTO = "";
	final private String CREADOR_POR_DEFECTO = "";

	private String titulo;
	private int numero_temporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	public Serie() {
		this.titulo = this.TITULO_POR_DEFECTO;
		this.numero_temporadas = this.TEMPORADAS_POR_DEFECTO;
		this.genero = this.GENERO_POR_DEFECTO;
		this.creador = this.CREADOR_POR_DEFECTO;
		this.entregado = this.ENTREDAGO_POR_DEFECTO;
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numero_temporadas = this.TEMPORADAS_POR_DEFECTO;
		this.genero = this.GENERO_POR_DEFECTO;
		this.creador = creador;
		this.entregado = this.ENTREDAGO_POR_DEFECTO;
	}

	public Serie(String titulo, int numero_temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numero_temporadas = numero_temporadas;
		this.genero = genero;
		this.creador = creador;
		this.entregado = this.ENTREDAGO_POR_DEFECTO;
	}

	@Override
	public String toString() {
		return "Título: " + this.titulo + "\n" + "Número de temporadas: " + this.numero_temporadas + "\n"
				+ "Entregado: " + this.entregado + "\n" + "Género: " + this.genero + "\n" + "Creador: " + this.creador
				+ "\n";
	}

	public String getTitulo() {
		return titulo;
	}

	public int getNumero_temporadas() {
		return numero_temporadas;
	}

	public String getGenero() {
		return genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setNumero_temporadas(int numero_temporadas) {
		this.numero_temporadas = numero_temporadas;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

}
