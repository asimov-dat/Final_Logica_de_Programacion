package metodos;
import java.io.*;
import java.util.*;

public class LeerArchivo
{
    public static void main(String[] args) throws InterruptedException
    {
       /* try
        {
            File file = new File("../recursos/letras.csv");
            Scanner scanner = new Scanner(file);
            String letra="";
            String[] test = new String[18];

            while(scanner.hasNextLine())
            {
                letra += scanner.nextLine();
            }
            
            test = letra.trim().split("\\s*##;\\s*");

            String cancion1 = test[0];

            System.out.println(cancion1);

            String[] cancion1arr = new String[test[0].length()];

            cancion1arr = cancion1.split(";");

            for(int i=0;i<cancion1arr.length;i++)
            {

                System.out.println(cancion1arr[i]);
            }
            

            
        }
        catch(Exception error)
        {
            System.out.println("Error: "+ error);
        }
        */
        //TODO organizar codigo, eliminar main, add to Programa
        //TODO quitar espacios adicionales, crear las opciones a escoger 
        String prueba = crearLetraCancion();
        //System.out.println(prueba);
        String[] pruebaArr = crearArrayLetra(prueba);
        //System.out.println(pruebaArr[0]);
        String[] letra = letraCancion(pruebaArr,0);
        
        for(int i=0;i<letra.length;i++){
            System.out.println(letra[i]);
            Thread.sleep(200);
        }
    }

    public static String crearLetraCancion()
    {
        String letraArchivo="";
        try
        {
            File file = new File("../recursos/letras.csv");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine())
            {
                letraArchivo += scanner.nextLine();
            }

        }catch(Exception error){
            System.out.println("Error: "+error);
        }
        return letraArchivo;
    }

    public static String[] crearArrayLetra(String letraArchivo)
    {
        String[] letraArray = new String[18];
        letraArray = letraArchivo.trim().split("\\s*##;\\s*");
        return letraArray;
    }


    public static String[] letraCancion(String[] letra, int position)
    {
        String cancion = letra[position];
        String[] cancionArr = new String[letra[position].length()];

        cancionArr = cancion.split(";");
        return cancionArr;
    }
}