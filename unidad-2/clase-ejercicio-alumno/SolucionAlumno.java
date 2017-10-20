import java.io.IOException;

public class SolucionProblemaAlumno {

  public static void main(String[] args) throws IOException {
        
    Alumno Alum[] = new Alumno[4];
    Alumno uso = new Alumno();
        
    byte c;
        
    uso.ingresar(Alum);
    uso.listadoAlumnos(Alum);
    c = uso.inferior(Alum);
    uso.imprimir(c);
    uso.promedioNotas(Alum);
  }
}
