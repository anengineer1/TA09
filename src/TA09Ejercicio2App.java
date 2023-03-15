import java.util.ArrayList;

import javax.swing.JOptionPane;

import Serie.Serie;
import Videojuego.Videojuego;

public class TA09Ejercicio2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaración de las variables
		String ElegirTipo;
		String IntroducirOtroTipo = "SI";
		String IntroducirMas = "SI";
		String Titulo;
		String TextoTemporadas;
		int Temporadas;
		String TextoHoras;
		int Horas;
		String Genero;
		String Creador;
		String Compañia;
		
		ArrayList<Serie> Series = new ArrayList<Serie>();
		ArrayList<Videojuego> Videojuegos = new ArrayList<Videojuego>();
		
		//Creamos una nueva serie
		Serie Serie = new Serie();
		Videojuego Videojuego = new Videojuego();
		
		while (IntroducirOtroTipo.equals("SI")) {
			ElegirTipo = JOptionPane.showInputDialog("¿Que deseas introducir? [ Serie | Videojuego]");
			ElegirTipo = ElegirTipo.toUpperCase();
			
			if(ElegirTipo.equals("SERIE")) {
				while (IntroducirMas.equals("SI")) {
				//Comenzamos a pedir los datos por ventanas
				//Si no se escribe nada, con las función isEmpty haremos get de los valores por defecto para setearlos en los atributos de la serie   
				Titulo = JOptionPane.showInputDialog("Introduce el titulo:");
				while(Titulo.isEmpty()) {
					Titulo = JOptionPane.showInputDialog("Introduce el titulo:");
				}
				
				TextoTemporadas = JOptionPane.showInputDialog("Introduce el número de temporadas");
				while(TextoTemporadas.isEmpty()) {
					Temporadas = Serie.getNumero_temporadas();
				}
				Temporadas = Integer.parseInt(TextoTemporadas);
				
				Genero = JOptionPane.showInputDialog("Introduce el género:");
				if(Genero.isEmpty()) {
					Genero = JOptionPane.showInputDialog("Introduce el género:");
				}
				
				Creador = JOptionPane.showInputDialog("Introduce el creador:");
				if(Creador.isEmpty()) {
					Creador = JOptionPane.showInputDialog("Introduce el creador:");
				}
				//Guarda cada serie en un ArrayList, llenando los atributos con los valores que hemos introducido
				Series.add(Serie = new Serie(Titulo, Temporadas, Genero, Creador));
				
				//Preguntamos si queremos intoducir mas series
				IntroducirMas = JOptionPane.showInputDialog("¿Deseas introducir otra serie? [ SI | NO ]");
				IntroducirMas = IntroducirMas.toUpperCase();
				}
			
				//Mostramos las series introducidas anteriormente
				System.out.println("Listado de series introducidas");
				System.out.println("");
				for (int i = 1; i <= Series.size(); i++) {
					System.out.println("Serie " + i);
					System.out.println(Serie.toString());
				}
			} else if(ElegirTipo.equals("VIDEOJUEGO")) {
				IntroducirMas = "SI";
				while (IntroducirMas.equals("SI")) {
				//Comenzamos a pedir los datos por ventanas
				//Si no se escribe nada, con las función isEmpty haremos get de los valores por defecto para setearlos en los atributos de la serie   
				Titulo = JOptionPane.showInputDialog("Introduce el titulo:");
				if(Titulo.isEmpty()) {
					Titulo = JOptionPane.showInputDialog("Introduce el titulo:");
				}
				
				TextoHoras = JOptionPane.showInputDialog("Introduce el número de horas estimadas");
				if(TextoHoras.isEmpty()) {
					Horas = Videojuego.getHoras();
				} else {
					Horas = Integer.parseInt(TextoHoras);
				}
				
				Genero = JOptionPane.showInputDialog("Introduce el género:");
				if(Genero.isEmpty()) {
					Genero = JOptionPane.showInputDialog("Introduce el género:");
				}
				
				Compañia = JOptionPane.showInputDialog("Introduce la compañia:");
				if(Compañia.isEmpty()) {
					Compañia = JOptionPane.showInputDialog("Introduce la compañia:");
				}
				//Guarda cada serie en un ArrayList, llenando los atributos con los valores que hemos introducido
				Videojuegos.add(Videojuego = new Videojuego(Titulo, Horas, Genero, Compañia));
				
				//Preguntamos si queremos intoducir mas series
				IntroducirMas = JOptionPane.showInputDialog("¿Deseas introducir otro videojuego? [ SI | NO ]");
				IntroducirMas = IntroducirMas.toUpperCase();
				}
			
				//Mostramos las series introducidas anteriormente
				System.out.println("Listado de videojuegos introducidas");
				System.out.println("");
				for (int i = 1; i <= Videojuegos.size(); i++) {
					System.out.println("Videojuego " + i);
					System.out.println(Videojuego.toString());
				}
			}

			//Preguntamos si queremos intoducir mas elementos
			IntroducirOtroTipo = JOptionPane.showInputDialog("¿Deseas introducir otro elemento? [ SI | NO ]");
			IntroducirOtroTipo = IntroducirOtroTipo.toUpperCase();
			
		}
	}
}
