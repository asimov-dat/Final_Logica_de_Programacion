package metodos;
import java.io.*;

public class Directorios
{
    static File directorio = new File("./canciones");
    static String[] canciones = directorio.list();
    static String espacio = "     ";

    public static void imprimirCarpetaCanciones()
    {
        try
        {
            for(int i=0;i<canciones.length;i++)
            {
                System.out.println(espacio+"cancion "+i+" : "+canciones[i]);
                Thread.sleep(50);
            }
        }catch(Exception error){
            System.out.println("Error: "+error);
        }   
    }
    public static void imprimirNumeroCanciones()
    {
<<<<<<< HEAD
        System.out.println(espacio+"Numero de canciones : "+canciones.length);
=======
        System.out.println("Numero de canciones: "+canciones.length);
>>>>>>> 334f48a061b928e95ffb2e2354604686f6747f00
    }
}
