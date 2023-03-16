import java.util.ArrayList;

import javax.swing.JOptionPane;

import Serie.Serie;
import Videojuego.Videojuego;

public class TA09Ejercicio2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaración de las variables
		String ElegirTipo = "";
		String IntroducirOtroTipo = "SI";
		String IntroducirMas = "SI";
		String Titulo = "";
		String TextoTemporadas;
		int Temporadas;
		String TextoHoras;
		int Horas;
		String Genero = "";
		String Creador = "";
		String Compañia = "";
		String Entregado = "";
		
		ArrayList<Serie> Series = new ArrayList<Serie>();
		ArrayList<Videojuego> Videojuegos = new ArrayList<Videojuego>();
		
		//Creamos una nueva serie
		Serie Serie = new Serie();
		Videojuego Videojuego = new Videojuego();
		
		while (IntroducirOtroTipo.equals("SI")) {
			while(ElegirTipo.isEmpty() || !ElegirTipo.equals("SERIE") && !ElegirTipo.equals("VIDEOUEGO")) {
				ElegirTipo = JOptionPane.showInputDialog("¿Que deseas introducir? [ Serie | Videojuego ]");
				ElegirTipo = ElegirTipo.toUpperCase();
				System.out.println(ElegirTipo);
			}
			
			if(ElegirTipo.equals("SERIE")) {
				while (IntroducirMas.equals("SI")) {
					//Comenzamos a pedir los datos por ventanas
					//Si no se escribe nada, con las función isEmpty volveremos a pedir los datos 
					while(Titulo.isEmpty()) {
						Titulo = JOptionPane.showInputDialog("Introduce el titulo:");
					}
					
					TextoTemporadas = JOptionPane.showInputDialog("Introduce el número de temporadas");
					while(TextoTemporadas.isEmpty()) {
						Temporadas = Serie.getNumero_temporadas();
					}
					Temporadas = Integer.parseInt(TextoTemporadas);
					
					while(Genero.isEmpty()) {
						Genero = JOptionPane.showInputDialog("Introduce el género:");
					}
					
					while(Creador.isEmpty()) {
						Creador = JOptionPane.showInputDialog("Introduce el creador:");
					}
					
					Serie = new Serie(Titulo, Temporadas, Genero, Creador);
					
					while(Entregado.isEmpty()) {
						Entregado = JOptionPane.showInputDialog("Esta entregada? [ SI | NO ]"); 
					}
					
					if(Entregado.equals("SI")) {
						Serie.entregar();
					} else {
						Serie.devolver();
					}
					
					//Guarda cada serie en un ArrayList, llenando los atributos con los valores que hemos introducido
					Series.add(Serie);
					
					//Preguntamos si queremos intoducir mas series
					while(IntroducirMas.isEmpty() || !IntroducirMas.equals("SI") && !IntroducirMas.equals("NO")) {
						IntroducirMas = JOptionPane.showInputDialog("¿Deseas introducir otra serie? [ SI | NO ]");
						IntroducirMas = IntroducirMas.toUpperCase();
					}
				}
			} else if(ElegirTipo.equals("VIDEOJUEGO")) {
				IntroducirMas = "SI";
				while (IntroducirMas.equals("SI")) {
					//Comenzamos a pedir los datos por ventanas
					//Si no se escribe nada, con las función isEmpty volveremos a pedir los datos
					while(Titulo.isEmpty()) {
						Titulo = JOptionPane.showInputDialog("Introduce el titulo:");
					}
					
					TextoHoras = JOptionPane.showInputDialog("Introduce el número de horas estimadas");
					while(TextoHoras.isEmpty()) {
						Horas = Videojuego.getHoras();
					}
					Horas = Integer.parseInt(TextoHoras);
					
					while(Genero.isEmpty()) {
						Genero = JOptionPane.showInputDialog("Introduce el género:");
					}
					
					while(Compañia.isEmpty()) {
						Compañia = JOptionPane.showInputDialog("Introduce la compañia:");
					} 
					
					Videojuego = new Videojuego(Titulo, Horas, Genero, Compañia);
					
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
					Videojuegos.add(Videojuego);
					
					//Preguntamos si queremos intoducir mas videojuegos
					while(IntroducirMas.isEmpty() || !IntroducirMas.equals("SI") && !IntroducirMas.equals("NO")) {
						IntroducirMas = JOptionPane.showInputDialog("¿Deseas introducir otro videojuego? [ SI | NO ]");
						IntroducirMas = IntroducirMas.toUpperCase();
					}
				}
			}
			
			//Preguntamos si queremos intoducir mas elementos
			while(IntroducirOtroTipo.isEmpty() || !IntroducirOtroTipo.equals("SI") || !IntroducirOtroTipo.equals("NO")) {
				IntroducirOtroTipo = JOptionPane.showInputDialog("¿Deseas introducir otro elemento? [ SI | NO ]");
				IntroducirOtroTipo = IntroducirOtroTipo.toUpperCase();
			}
		}
		
		if(Series == null || Series.size() == 0) {
			System.out.println("No se ha introducido ninguna serie");
		} else {
			//Mostramos las series entregados
			if(Serie.isEntregado() == true) {
				System.out.println("Listado de series entregadas");
				System.out.println("");
				for (int i = 1; i <= Series.size(); i++) {
					System.out.println(Series.toString());
					System.out.println("");
				}
			} else {
				System.out.println("No hay ninguna serie entregada");
			}
			
			//Mostramos la serie con mas temporadas
			System.out.println("");
			System.out.println("La serie con mas temporadas es:");
			System.out.println("[" + Series.get(Serie.compareTo(Series)).toString() + "]");
		}
		
		if(Videojuegos == null || Videojuegos.size() == 0) {
			System.out.println("No se ha introducido ningun videojuego");
		} else {
			//Mostramos los videojuegos entregados
			if(Videojuego.isEntregado() == true) {
				System.out.println("Listado de videojuegos entregados");
				System.out.println("");
				for (int i = 1; i <= Videojuegos.size(); i++) {
					System.out.println(Videojuego.toString());
					System.out.println("");
				} 
			} else {
				System.out.println("No hay ningun videojuego entregado");
			}
			
			//Mostramos el videojuego con mas horas estimadas
			System.out.println("");
			System.out.println("El videojuego con mas horas estimadas es:");
			System.out.println("[" + Videojuegos.get(Videojuego.compareTo(Videojuegos)).toString() + "]");
		}
	}
}
