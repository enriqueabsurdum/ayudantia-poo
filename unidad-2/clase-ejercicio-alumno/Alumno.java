import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alumno {
    
    private String nombre;
    private String apellido;
    private String rut;
    private float nota1;
    private float nota2;
    private float nota3;
    
    public Alumno() { }
    
    public String getNombre() {
      return nombre;
    }

    public void setNombre(String nombre) {
      this.nombre = nombre;
    }

    public String getRut() {
      return rut;
    }

    public void setRut(String rut) {
      this.rut = rut;
    }

    public String getApellido() {
      return apellido;
    }

    public void setApellido(String apellido) {
      this.apellido = apellido;
    }

    public float getNota1() {
      return nota1;
    }

    public void setNota1(float nota1) {
      this.nota1 = nota1;
    }

    public float getNota2() {
      return nota2;
    }

    public void setNota2(float nota2) {
      this.nota2 = nota2;
    }

    public float getNota3() {
      return nota3;
    }

    public void setNota3(float nota3) {
      this.nota3 = nota3;
    }
    
    public void ingresar(Alumno[] alumno) throws IOException {
      BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
                
      for (byte i = 0; i < alumno.length; i++) {
        Alumno alum = new Alumno();
            
        System.out.print("Ingrese nombre del alumno : ");
        alum.setNombre(leer.readLine());
        System.out.print("Ingrese apellido del alumno : ");
        alum.setApellido(leer.readLine());
        System.out.print("Ingresar rut del alumno : ");
        alum.setRut(leer.readLine());
        System.out.print("Ingrese nota 1 : ");
        alum.setNota1(Float.parseFloat(leer.readLine()));
        System.out.print("Ingrese nota 2 : ");
        alum.setNota2(Float.parseFloat(leer.readLine()));
        System.out.print("Ingrese nota 3 : ");
        alum.setNota3(Float.parseFloat(leer.readLine()));
            
        alumno[i] = alum;
      }
    }
    
    public float promedio(Alumno[] alumno, byte posicion) {
      float prom = (alumno[posicion].getNota1() 
          + alumno[posicion].getNota2() 
          + alumno[posicion].getNota3()) / 3;
      return prom;
    }
    
    public void listadoAlumnos(Alumno[] alumno) {
      for(byte i = 0; i < alumno.length; i++) {
        System.out.println("Nombre : " + alumno[i].getNombre() 
            + "\nApellido : " + alumno[i].getApellido() 
            + "\nRut : " + alumno[i].getRut() 
            + "\nNota 1 : " + alumno[i].getNota1() 
            + "\nNota 2 : " + alumno[i].getNota2() 
            + "\nNota 3 : " + alumno[i].getNota3() 
            + "\nEl promedio del alumno es : " + promedio(alumno, i));
      }
    }
    
    public byte inferior(Alumno[] alumno) {
      byte cont = 0;
        for(byte i = 0; i < alumno.length; i++) {
          if(promedio(alumno, i) < 4) {
            cont++;
          }
        }
      return cont; 
    }
    
    public void imprimir(byte cant) {
      System.out.println("La cantidad de alumnos de promedio inferior a 4.0 es : " + cant);    
    }  
    
    // Promedio de un curso por cada nota:
    public void promedioNotas(Alumno[] alumno) {
      float acum1 = 0, acum2 = 0, acum3 = 0;
      byte cant = 0;
        for(byte i = 0; i < alumno.length; i++) {
          acum1 = acum1 + alumno[i].getNota1();
          acum2 = acum2 + alumno[i].getNota2();
          acum3 = acum3 + alumno[i].getNota3();
          cant++;
        }
      System.out.println("Promedio nota 1 : " + promedioN(acum1, cant));
      System.out.println("Promedio nota 2 : " + promedioN(acum2, cant));
      System.out.println("Promedio nota 3 : " + promedioN(acum3, cant));
    }
    
    public float promedioN(float acum, byte cant) {
      float prom = 0;
      prom = acum / cant;
      return prom;
    }
}
