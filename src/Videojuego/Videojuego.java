package Videojuego;

import java.util.ArrayList;

import Entregable.Entregable;

import Entregable.Entregable;
import java.util.ArrayList;

public class Videojuego implements Entregable {

	// Constantes
	final int HORAS = 10;

	// Atributos de clase
	private String titulo;
	private int horas;
	private boolean entregado;
	private String genero;
	private String compañia;

	public Videojuego() {
		this.titulo = "";
		this.horas = HORAS;
		this.entregado = false;
		this.genero = "";
		this.compañia = "";
	}

	public Videojuego(String titulo, int horas) {
		this.titulo = titulo;
		this.horas = horas;
	}

	public Videojuego(String titulo, int horas, String genero, String compañia) {
		this.titulo = titulo;
		this.horas = horas;
		this.genero = genero;
		this.compañia = compañia;
	}

	// Métodos de clase
	@Override
	public String toString() {
		return "Título: " + this.titulo + "\n" + "Horas estimadas: " + this.horas + "\n" + "Entregado: "
				+ this.entregado + "\n" + "Género: " + this.genero + "\n" + "Compañia: " + this.compañia + "\n";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}

	@Override
	public void entregar() {
		this.entregado = true;
	}

	@Override
	public void devolver() {
		this.entregado = false;
	}

//	@Override
//	public int compareTo(Object o) {
//		ArrayList<Videojuego> Videojuegos = new ArrayList<Videojuego>();
//		Videojuegos = (ArrayList<Videojuego>) o;
//		int NumMasGrande = Videojuegos.get(0).horas;
//		int MasHoras = 0;
//		
//		return MasHoras;
//	}

	@Override
	public boolean compareTo(Object videojuego) {
		// Retorna true si la Serie tienes más temporadas que su
		// Argumento
		return (this.horas < ((Videojuego) videojuego).getHoras());
	}

}
