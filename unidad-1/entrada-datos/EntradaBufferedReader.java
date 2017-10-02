import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaBufferedReader {

    public static void main(String[] args) throws IOException {
        
        // Clase: BufferedReader y Objeto: entrada
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        // Entrada de datos
        System.out.println("ENTRADA DE DATOS");
        System.out.println("================");
        
        // Entrada de dato byte
        System.out.print("Entrada int: ");
        byte bNum = Byte.parseByte(entrada.readLine());
        
        // Entrada de dato short
        System.out.print("Entrada short: ");
        short sNum = Short.parseShort(entrada.readLine());
        
        // Entrada de dato int
        System.out.print("Entrada int: ");
        int iNum = Integer.parseInt(entrada.readLine());
        
        // Entrada de dato long
        System.out.print("Entrada long: ");
        long lNum = Long.parseLong(entrada.readLine());
        
        // Entrada de dato float
        System.out.print("Entrada float: ");
        float fNum = Float.parseFloat(entrada.readLine());
        
        // Entrada de dato double
        System.out.print("Entrada double: ");
        double dNum = Double.parseDouble(entrada.readLine());
        
        // Salida de datos
        System.out.println("\nSALIDA DE DATOS");
        System.out.println("===============");
        System.out.println("Salida byte: " + bNum);
        System.out.println("Salida short: " + sNum);
        System.out.println("Salida int: " + iNum);
        System.out.println("Salida long: " + lNum);
        System.out.println("Salida float: " + fNum);
        System.out.println("Salida double: " + dNum);
    }
}