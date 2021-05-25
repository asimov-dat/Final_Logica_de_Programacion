package metodos;

import java.util.Scanner;

public class Juego
{  
    static Scanner uInput = new Scanner(System.in);

    public static void jugar()
    {
        Scanner uInput = new Scanner(System.in);

        LeerArchivo.imprimirListaCanciones();
        System.out.print("     $ ");
        int opcionLetraCancion = uInput.nextByte();
        LeerArchivo.imprimirLetraCancion(opcionLetraCancion);
    }

    public static void seleccionCancion()
    {
        LeerArchivo.imprimirListaCanciones();
        System.out.print("     $ ");
        int opcionLetraCancion = uInput.nextByte();
        switch(opcionLetraCancion)
        {
            case 0 : Directorios.reproducirCancion(18);
                    LeerArchivo.imprimirLetraCancion(opcionLetraCancion,7000);
                break;
        }
        
    }
}