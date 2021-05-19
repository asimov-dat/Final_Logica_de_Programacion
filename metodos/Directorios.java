package metodos;
import java.io.*;

public class Directorios
{
    static File directorio = new File("./canciones");
    static String[] canciones = directorio.list();

    public static void imprimirCarpetaCanciones()
    {
        for(int i=0;i<canciones.length;i++)
        {
            System.out.println("cancion "+i+" : "+canciones[i]);
        }
    }
    public static void imprimirNumeroCanciones()
    {
        System.out.println("Numero de canciones: "+canciones.length);
    }
}
