package metodos;
import java.io.*;
import java.util.*;

public class LeerArchivo
{   
    static File directorio = new File("./canciones");
    static String[] canciones = directorio.list();

    static String strLetra = 

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
        String[] letraArray = new String[canciones.length];
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

    public static void imprimirLetraCanciones()
    {
        for(int i=0;i<)
        {
            
        }
    }
}