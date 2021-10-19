import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import model.persona;
 
public class principal {

	public static void main(String[] args) throws IOException {
		File fch = new File("ejemplo.txt");

		ArrayList<persona> aArchivo = leerPersonas(fch);
		aArchivo.forEach(s -> System.out.println(s));

	}

	private static ArrayList<persona> leerPersonas(File fichero) {
		ArrayList<persona> contenido = new ArrayList<persona>();
		ArrayList<persona> contenido2 = new ArrayList<persona>();
		contenido2.add(new persona ("Pepe","Valle","21"));
		contenido2.add(new persona ("Juan","","23"));
		contenido2.add(new persona ("","Romero","21"));
		try {

			BufferedReader buffLectura = new BufferedReader(new FileReader(fichero));

			String lineaLeida;

			lineaLeida = buffLectura.readLine();

			while (contenido2 != null) {
				StringTokenizer campo = new StringTokenizer(lineaLeida, "#");
				String nombre = campo.nextToken();
				String apellidos = campo.nextToken();
				String edad = campo.nextToken();

				contenido.add(new persona(nombre, apellidos, edad));
				lineaLeida = buffLectura.readLine();

			}

			buffLectura.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return contenido2;

	}
	private static void llenarTxt() {
		
	}

}
