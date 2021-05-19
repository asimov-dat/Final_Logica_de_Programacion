package metodos;
import java.io.*;
import java.util.*;

public class LeerArchivo
{   
    static File directorio = new File("./canciones");
    static String[] canciones = directorio.list();

    static String strLetra = crearLetraCancion();
    static String[] arrLetra = crearArrayLetra(strLetra);
    static String espacio = "     ";

    public static String crearLetraCancion()
    {
        String letraArchivo="";
        try
        {
            File file = new File("./recursos/letras.csv");
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

    public static void imprimirListaCanciones()
    {
        String temp ="";
        String temp0="";
        int count=0;
        for(int i=0;i<arrLetra.length;i++)
        {
            String[] arrTemp = new String[arrLetra[i].length()];

            temp = arrLetra[i];
            arrTemp = temp.split(";");
            for(int j=0;j<1;j++)
            {
                System.out.println(espacio+"Opcion "+count+" : "+arrTemp[0]);
                count++;
                try
                {
                    Thread.sleep(50);
                }catch(Exception error){
                    System.out.println("Error: "+error);
                }
            }
        }
    }

    public static void imprimirLetraCancion(int opcionCancion)
    {
        String[] cancion = new String[arrLetra[opcionCancion].length()];

        cancion = letraCancion(arrLetra,opcionCancion);
        
        for(int i=0;i<cancion.length;i++)
        {
            System.out.println(cancion[i]);
        }
    }
}