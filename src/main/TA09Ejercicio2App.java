package main;

import Serie.Serie;
import Videojuego.Videojuego;

public class TA09Ejercicio2App {

	public static void main(String[] args) {

		Serie[] series = new Serie[5];
		Videojuego[] videojuegos = new Videojuego[5];

		series[0] = new Serie("El señor de los anillos", 5, "Aventuras", "Peterson");
		series[1] = new Serie("Gente buena", "Lavanda");
		series[1].setGenero("Novela histórica");
		series[1].setNumero_temporadas(6);
		series[2] = new Serie("Máquinas", 7, "Acción", "Fajardo");
		series[3] = new Serie("Edificios chulos", 3, "Aventuras", "Josseppe");
		series[4] = new Serie("Pluto", 9, "Aventuras", "Peterson");

		videojuegos[0] = new Videojuego("Half life", 10, "fps", "Valve");
		videojuegos[1] = new Videojuego("Call of duty", 5, "fps", "Infinity ward");
		videojuegos[2] = new Videojuego("Hollow knight", 15, "Aventuras", "Indie");
		videojuegos[3] = new Videojuego("Super Mario Bros", 6, "Plataformas", "Nintendo");
		videojuegos[4] = new Videojuego("Half life 2", 11, "fps", "Valve");

		// Entregar videojuegos y películas
		series[1].entregar();
		series[4].entregar();
		videojuegos[2].entregar();
		videojuegos[0].entregar();

		// Contar y publicados y hacer print
		System.out.println("Los juegos entregados son:");
		int contador_juegos_entregados = 0;
		for (Videojuego videojuego : videojuegos) {
			if (videojuego.isEntregado()) {
				contador_juegos_entregados++;
				System.out.println(videojuego);
			}
		}
		System.out.println("Número de juegos entregados: " + contador_juegos_entregados);

		System.out.println("Las series entregadas son:");
		int contador_series_entregadas = 0;
		for (Serie serie : series) {
			if (serie.isEntregado()) {
				contador_series_entregadas++;
				System.out.println(serie);
			}
		}
		System.out.println("Número de series entregadas: " + contador_series_entregadas);
		System.out.println("El total entregado es: " + (contador_juegos_entregados + contador_series_entregadas));

		int indice_videojuego_mas_horas = 0;
		for (int i = 0; i < videojuegos.length; i++) {
			if (videojuegos[indice_videojuego_mas_horas].compareTo(videojuegos[i])) {
				indice_videojuego_mas_horas = i;
			}
		}

		int indice_serie_mas_temporadas = 0;
		for (int i = 0; i < videojuegos.length; i++) {
			if (series[indice_serie_mas_temporadas].compareTo(series[i])) {
				indice_serie_mas_temporadas = i;
			}
		}

		System.out.println("El videojuego de mayor cantidad de horas es:");
		System.out.println(videojuegos[indice_videojuego_mas_horas]);

		System.out.println("La serie de mayor cantidad de temporadas es:");
		System.out.println(series[indice_serie_mas_temporadas]);

	}
}
