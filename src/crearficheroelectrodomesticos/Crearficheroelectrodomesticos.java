

package crearficheroelectrodomesticos;
import java.io.*;
import java.util.*;

public class Crearficheroelectrodomesticos {

    
    public static void main(String[] args) {
       try{
        
        File fichero = new File("electrodomesticos.txt");           
        Scanner teclado = new Scanner(System.in);
        BufferedWriter escritor = new BufferedWriter ( new FileWriter(fichero));
        
       // System.out.println("Dame la ruta de un fichero: ");
       // String cadena=teclado.nextLine();
       //System.out.println("La ruta que voy a abrir es: " + cadena);
        
        System.out.println("Dame un producto: ");
        String producto = teclado.nextLine();
        escritor .write(producto);
        escritor.newLine();
        
        System.out.println("Dame una marca: ");
        String marca = teclado.nextLine();
        escritor.write(marca);
        escritor.newLine();
        
         System.out.println("Dame un precio: ");
        int precioINT=teclado.nextInt();  
        String edadSTRING = String.valueOf(precioINT);
        escritor.write(edadSTRING);      
        escritor.newLine();
        teclado.nextLine();
        
      
                
         escritor.close();

    }
    catch (IOException e) {        
        System.out.println("error de lectura del fichero ");
    }
       System.out.println("El fichero se ha guardado con éxito");
       
    }}
