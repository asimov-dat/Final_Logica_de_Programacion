package metodos;

import java.util.*;

public class Juego
{  
    static Scanner uInput = new Scanner(System.in);
    static String espacio = "     ";

    public static void jugar(String cancion)
    {
        System.out.println();
        System.out.println(espacio+"Elija una opcion");
        System.out.println(espacio+"1 : "+"hola");
        System.out.println(espacio+"2 : "+"cosala");
        System.out.println(espacio+"3 : "+cancion);
        System.out.println();
        System.out.print(espacio+"$ ");
        int opcionJuego = uInput.nextByte();
        switch(opcionJuego)
        {
            case 1 : System.out.println(espacio+"Respuesta incorrecta");
                break;
            case 2 : System.out.println(espacio+"Respuesta incorrecta");
                break;
            case 3 : System.out.println(espacio+cancion+" Es correcto");
        }
    }

    public static void seleccionCancion()
    {
        LeerArchivo.imprimirListaCanciones();
        System.out.print("     $ ");
        int opcionLetraCancion = uInput.nextByte();
        switch(opcionLetraCancion)
        {
            case 0 : Directorios.reproducirCancion(18);
                    do
                    {
                        LeerArchivo.imprimirLetraCancion(opcionLetraCancion,1000);
                    }while(Audio.sequencer.isOpen());
                break;
        }
        
    }
    
    public static void loopLetra()
    {

    }

    public static int random(int inicio,int fin)
	{
		Random r = new Random();
		return r.nextInt(fin-inicio+1) + inicio;
	}
}