import java.util.Scanner;

public class EntradaScanner {

    public static void main(String[] args) {
        
        // Clase: Scanner y Objeto: entrada
        Scanner entrada = new Scanner(System.in);
        
        // Entrada de datos
        System.out.println("ENTRADA DE DATOS");
        System.out.println("================");
        
        // Entrada de dato byte
        System.out.print("Entrada byte: ");
        byte bNum = entrada.nextByte();
        
        // Entrada de dato short
        System.out.print("Entrada short: ");
        short sNum = entrada.nextShort();
        
        // Entrada de dato int
        System.out.print("Entrada int: ");
        int iNum = entrada.nextInt();
        
        // Entrada de dato long
        System.out.print("Entrada long: ");
        long lNum = entrada.nextLong();
        
        // Entrada de dato float
        System.out.print("Entrada float: ");
        float fNum = entrada.nextFloat();
        
        // Entrada de dato double
        System.out.print("Entrada double: ");
        double dNum = entrada.nextDouble();
        
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