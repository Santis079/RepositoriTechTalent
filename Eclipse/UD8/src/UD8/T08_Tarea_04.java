package UD8;

public class T08_Tarea_04 {
	private String titulo;
	private int Temporadas;
	private String genero;
	private String creador;
	private boolean entregado;

	public static final int TEMPORADAS_PORDEFECTO = 3;
	public static final boolean ENTREGADO_PORDEFECTO = false;

	// Por defecto
	public T08_Tarea_04() {
		this.titulo = "";
		this.Temporadas = TEMPORADAS_PORDEFECTO;
		this.genero = "";
		this.creador = "";
		this.entregado = ENTREGADO_PORDEFECTO;
	}

	// Titulo y creador
	public T08_Tarea_04(String titulo, String creador) {
		this.titulo = titulo;
		this.Temporadas = TEMPORADAS_PORDEFECTO;
		this.genero = "";
		this.creador = creador;
		this.entregado = ENTREGADO_PORDEFECTO;
	}

	// Sin entregado
	public T08_Tarea_04(String titulo, int Temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.Temporadas = Temporadas;
		this.genero = genero;
		this.creador = creador;
		this.entregado = ENTREGADO_PORDEFECTO;
	}

	@Override
	public String toString() {
		return "Título: " + titulo + ", Temporadas entregadas: " + Temporadas + ", Género: " + genero + ", Creador: "
				+ creador + ", Entregado: " + entregado;
	}

	public static void main(String[] args) {
		T08_Tarea_04 serie1 = new T08_Tarea_04();
		System.out.println(serie1);

		T08_Tarea_04 serie2 = new T08_Tarea_04("Breaking Bad", "Vince Gilligan");
		System.out.println(serie2);

		T08_Tarea_04 serie3 = new T08_Tarea_04("Game of Thrones", 8, "Fantasia", "Los D y D, y G.R.R Martin");
		System.out.println(serie3);
	}
}
