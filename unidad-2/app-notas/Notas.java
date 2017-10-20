import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Notas {

	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	// Método (1) Ingresar notas
	public byte ingresarNotas(float[] vectorNotas) throws IOException {
		
		float nota = 0;

		System.out.print("Cantidad de notas : ");
		byte cant = Byte.parseByte(entrada.readLine());

		for (byte i = 0; i < cant; i++) {
			System.out.print("Ingresar nota " + (i + 1) + " : ");
			nota = Float.parseFloat(entrada.readLine());
			vectorNotas[i] = nota;
		}
		return (cant);
	}

	// Método (2) Listar notas
	public void listarNotas(float[] vectorNotas, byte cant) {
		
		byte lista = 0;		

		for (byte i = 0; i < cant; i++) {
			lista++;
			System.out.println("Nota en la posición número " + lista + " : " + vectorNotas[i]);
		}
	}

	// Método (3) Promediar notas
	public float promediarNotas(float[] vectorNotas, byte cant) {
		
		float acum = 0;

		for (byte i = 0; i < cant; i++) {
			acum += vectorNotas[i];
		}
		float promedio = acum / cant;
		return (promedio);
	}

	// Método (4) Nota más alta
	public float notaMayor(float[] vectorNotas, byte cant) {

		float notaMayor = 0;

		notaMayor = vectorNotas[0];

		for (byte i = 0; i < cant; i++) {
			if (vectorNotas[i] > notaMayor) {
				notaMayor = vectorNotas[i];
			}
		}
		return (notaMayor);
	}

	// Método (5) Nota más baja
	public float notaMenor(float[] vectorNotas, byte cant) {

		float notaMenor = 0;

		notaMenor = vectorNotas[0];

		for (byte i = 0; i < cant; i++) {
			if (vectorNotas[i] < notaMenor) {
				notaMenor = vectorNotas[i];
			}
		}
		return (notaMenor);
	}

	// Método (6) Ver nota específica
	public float buscarNota (float n[], int cant) throws IOException {
		byte buscar = 0, aux = 0;            
        System.out.print("Ingrese posición de la nota a buscar : ");
        buscar = Byte.parseByte(entrada.readLine());
        buscar = (byte) (buscar - 1);
        aux = (byte) (buscar + 1);
            
        System.out.println("Nota posición número " + aux + " : " + n[buscar]);
            
        return (buscar);
    }   

	// Método (7) Modificar nota específica
    public float modificarNota(float n[], int cant) throws IOException {
        byte modificar = 0, aux = 0;
        
        System.out.print("Ingrese el número de posición de la nota a modificar : ");
        modificar = Byte.parseByte(entrada.readLine());
        modificar = (byte) (modificar - 1);
        aux = (byte) (modificar + 1);
        
        System.out.println("Nota actual, posición " + aux + " : " + n[modificar]);
        System.out.print("Ingrese nueva nota : ");
        n[modificar] = Float.parseFloat(entrada.readLine());
        
        return (modificar);
    }

	// Método (6) Eliminar nota específica
	public void eliminarNota(float[] vectorNotas, int cant) throws IOException {

		System.out.print("Ingrese posición de la nota : ");
		byte posicion = Byte.parseByte(entrada.readLine());
		byte i = posicion;
		posicion = (byte) (posicion - 1);

		System.out.println("Nota en la posición número " + i + " : " + vectorNotas[posicion]);
		vectorNotas[posicion] = 0;

		System.out.println("Se elimino la nota de la posición número " + i);
	}
}
