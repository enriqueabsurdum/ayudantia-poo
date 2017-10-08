import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Notas {

	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));


	// Método (1) Ingresar notas
	public int ingresarNotas(float[] vectorNotas) throws IOException {

		float nota = 0.0f;

		System.out.print("Cantidad de notas : ");
		int cant = Integer.parseInt(entrada.readLine());

		for (int i = 0; i < cant; i++) {
			System.out.print("Ingresar nota " + (i + 1) + " : ");
			nota = Float.parseFloat(entrada.readLine());
			vectorNotas[i] = nota;
		}
		return (cant);
	}

	// Método (2) Listar notas
	public void listarNotas(int cant, float[] vectorNotas) {

		byte lista = 0;		

		for (int i = 0; i < cant; i++) {
			lista++;
			System.out.println("Nota en la posición n° " + lista + " : " + vectorNotas[i]);
		}
	}

	// Método (3) Promediar notas
	public float promediarNotas(int cant, float[] vectorNotas) {

		float acum = 0.0f;

		for (int i = 0; i < cant; i++) {
			acum += vectorNotas[i];
		}
		float promedio = acum / cant;

		return (promedio);
	}

	// Método (4) Nota más alta

	// Método (5) Nota más baja
	public float notaMenor(int cant, float[] vectorNotas) {

		float notaMenor = 0.0f;

		notaMenor = vectorNotas[0];

		for (int i = 0; i < cant; i++) {
			if(vectorNotas[i] < notaMenor) {
				notaMenor = vectorNotas[i];
			}
		}
		return (notaMenor);
	}

	// Método (6) Buscar nota específica

	// Método (7) Modificar nota específica

	// Método (6) Eliminar nota específica
	public void eliminarNota(int cant, float[] vectorNotas) throws IOException {

		System.out.print("Ingrese posición de la nota : ");
		byte posicion = Byte.parseByte(entrada.readLine());
		byte i = posicion;
		posicion = (byte) (posicion - 1);

		System.out.println("Nota en la posición n° " + i + " : " + vectorNotas[posicion]);
		vectorNotas[posicion] = 0;

		System.out.println("Se elimino la nota de la posición n° " + i);
	}
}
