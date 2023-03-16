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
		String Entregado;
		
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
				while(Genero.isEmpty()) {
					Genero = JOptionPane.showInputDialog("Introduce el género:");
				}
				
				Creador = JOptionPane.showInputDialog("Introduce el creador:");
				while(Creador.isEmpty()) {
					Creador = JOptionPane.showInputDialog("Introduce el creador:");
				}
				
				Entregado = JOptionPane.showInputDialog("Esta entregada? [ SI | NO ]"); 
				while(Entregado.isEmpty()) {
					Entregado = JOptionPane.showInputDialog("Esta entregada? [ SI | NO ]"); 
				}
				
				if(Entregado.equals("SI")) {
					Serie.entregar();
				} else {
					Serie.devolver();
				}
				
				//Guarda cada serie en un ArrayList, llenando los atributos con los valores que hemos introducido
				Series.add(Serie = new Serie(Titulo, Temporadas, Genero, Creador));
				
				//Preguntamos si queremos intoducir mas series
				IntroducirMas = JOptionPane.showInputDialog("¿Deseas introducir otra serie? [ SI | NO ]");
				IntroducirMas = IntroducirMas.toUpperCase();
				}
			} else if(ElegirTipo.equals("VIDEOJUEGO")) {
				IntroducirMas = "SI";
				while (IntroducirMas.equals("SI")) {
				//Comenzamos a pedir los datos por ventanas
				//Si no se escribe nada, con las función isEmpty haremos get de los valores por defecto para setearlos en los atributos de la serie   
				Titulo = JOptionPane.showInputDialog("Introduce el titulo:");
				while(Titulo.isEmpty()) {
					Titulo = JOptionPane.showInputDialog("Introduce el titulo:");
				}
				
				TextoHoras = JOptionPane.showInputDialog("Introduce el número de horas estimadas");
				while(TextoHoras.isEmpty()) {
					Horas = Videojuego.getHoras();
				}
				Horas = Integer.parseInt(TextoHoras);
				
				Genero = JOptionPane.showInputDialog("Introduce el género:");
				while(Genero.isEmpty()) {
					Genero = JOptionPane.showInputDialog("Introduce el género:");
				}
				
				Compañia = JOptionPane.showInputDialog("Introduce la compañia:");
				while(Compañia.isEmpty()) {
					Compañia = JOptionPane.showInputDialog("Introduce la compañia:");
				} 
				
				Entregado = JOptionPane.showInputDialog("Esta entregado? [ SI | NO ]"); 
				while(Entregado.isEmpty()) {
					Entregado = JOptionPane.showInputDialog("Esta entregado? [ SI | NO ]"); 
				}
				
				Entregado = Entregado.toUpperCase();
				
				if(Entregado.equals("SI")) {
					Videojuego.entregar();
				} else {
					Videojuego.devolver();
				}
				
				
				//Guarda cada videojuego en un ArrayList, llenando los atributos con los valores que hemos introducido
				Videojuegos.add(Videojuego = new Videojuego(Titulo, Horas, Genero, Compañia));
				
				//Preguntamos si queremos intoducir mas videojuegos
				IntroducirMas = JOptionPane.showInputDialog("¿Deseas introducir otro videojuego? [ SI | NO ]");
				IntroducirMas = IntroducirMas.toUpperCase();
				}
			}

			//Preguntamos si queremos intoducir mas elementos
			IntroducirOtroTipo = JOptionPane.showInputDialog("¿Deseas introducir otro elemento? [ SI | NO ]");
			IntroducirOtroTipo = IntroducirOtroTipo.toUpperCase();
			
		}
		
		//Mostramos las series y los videojuegos entregados
		
		if(Serie.isEntregado() == true) {
			System.out.println("Listado de series entregadas");
			System.out.println("");
			
			for (int i = 1; i <= Series.size(); i++) {
				System.out.println(Series.toString());
				System.out.println("");
			}
		}
		
		if(Videojuego.isEntregado() == true) {
			System.out.println("Listado de videojuegos entregados");
			System.out.println("");
			
			for (int i = 1; i <= Videojuegos.size(); i++) {
				System.out.println(Videojuego.toString());
				System.out.println("");
			}
		}
		
		System.out.println("");
		System.out.println("La serie con mas temporadas es:");
		System.out.println("[" + Series.get(Serie.compareTo(Series)).toString() + "]");
		
		System.out.println("");
		System.out.println("El videojuego con mas horas estimadas es:");
		System.out.println("[" + Videojuegos.get(Videojuego.compareTo(Videojuegos)).toString() + "]");
	}
}
