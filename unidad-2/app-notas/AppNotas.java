import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppNotas {
	
	public static void main(String[] args) throws IOException {

    byte opcion = 0;
		byte cant = 0;
		
		float[] vectorNotas = new float[8];
		Notas notas = new Notas();
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				
		do {
			System.out.println("\nMENÚ PRINCIPAL APLICACIÓN NOTAS\n"
					+ "(1) Ingresar notas\n"
					+ "(2) Listar notas\n"
					+ "(3) Promediar notas\n"
					+ "(4) Nota más alta\n" 
					+ "(5) Nota más baja\n" 
					+ "(6) Buscar nota específica\n" 
					+ "(7) Modificar nota específica\n" 
					+ "(8) Eliminar nota específica\n" 
					+ "(9) Salir\n");
			
			System.out.print("Seleccione una opción : ");
			opcion = Byte.parseByte(entrada.readLine());
			
			switch (opcion) {

			case 1:
				cant = notas.ingresarNotas(vectorNotas);
				System.out.println("Se cargaron " + cant + " notas");
				break;
				
			case 2:
				notas.listarNotas(vectorNotas, cant);
				break;
					
			case 3:
				float promedio = notas.promediarNotas(vectorNotas, cant);
				System.out.println("El promedio de las notas es : " + promedio);
				break;
				
			case 4:
				float notaMayor = notas.notaMayor(vectorNotas, cant);
				System.out.println("La nota mayor es : " + notaMayor);
				break;
			
			case 5:
				float notaMenor = notas.notaMenor(vectorNotas, cant);
				System.out.println("La nota menor es : " + notaMenor);
				break;
				
			case 6:
        notas.buscarNota(vectorNotas, cant);
				break;
				
			case 7:
        notas.modificarNota(vectorNotas, cant);
				break;
				
			case 8:
				notas.eliminarNota(vectorNotas, cant);
				break;
				
			case 9:
				System.out.println("Fin de la aplicación");
				break;

			default:
				System.out.println("Opción no válida");
				break;
			}
			
		} while(opcion != 9);
	}
}
