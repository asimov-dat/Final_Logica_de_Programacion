package metodos;
import java.util.Scanner;

public class Menu
{
    String opcionS="";
    public static void mostar_bienbenida()
    {
        String alinearIzquierda = "|  %-15s | %4-4d|%n";
        System.out.format("     +---------------------------+%n");
        System.out.format("     | Bienbenidos al juego Midi |%n");
        System.out.format("     +---------------------------+%n");
        System.out.format("     | Creadores:                |%n");
        System.out.format("     | Angie Paola Mazo          |%n");
        System.out.format("     | Julian Rojas              |%n");
        System.out.format("     | David Alvarez Tamayo      |%n");
        System.out.format("     +---------------------------+%n");
    }
    public static void mostar_menu()
    {
        System.out.format("     +---------------------------+%n");
        System.out.format("     |            MENU           |%n");
        System.out.format("     +---------------------------+%n");
        System.out.format("     |   Opciones  |    Numero   |%n");
        System.out.format("     +---------------------------+%n");
        System.out.format("     |   Jugar     |      1      |%n");
        System.out.format("     |   Puntajes  |      2      |%n");
        System.out.format("     |   Escuchar  |      3      |%n");
        System.out.format("     |   Canciones |      4      |%n");
        System.out.format("     |   Letras    |      5      |%n");
        System.out.format("     |   Ayuda     |      6      |%n");
        System.out.format("     |   Salir     |      7      |%n");
        System.out.format("     +---------------------------+%n");
    }
    public static void opcion_menu(byte i)
    {
        Scanner uInput = new Scanner(System.in);
        if (i <= 6)
        {
            switch(i)
            {
                case 1 : System.out.println("Aqui se iniciaria el juego");
                    break;
                case 2 : System.out.println("Aqui se verian los puntajes");
                    break;
                case 3 : System.out.println("Aqui se escucharian los Midi");
                    break;
                case 4 : System.out.println(); 
                        Directorios.imprimirCarpetaCanciones();
                        System.out.println();
                        Directorios.imprimirNumeroCanciones();
                        System.out.print("     $ Ingrese el numero de la cancion: ");
                        int numeroCancion = uInput.nextByte();
                        System.out.println();
                        Directorios.reproducirCancion(numeroCancion);
                        Directorios.menuCanciones();
                        System.out.print("     $ ");
                        byte numero = uInput.nextByte();
                        Directorios.menuCanciones(numero);
                    break;
                case 5 : System.out.println();
                        LeerArchivo.imprimirListaCanciones();
                        System.out.print("     $ ");
                        int opcionLetraCancion = uInput.nextByte();
                        LeerArchivo.imprimirLetraCancion(opcionLetraCancion);
                    break;
                case 6 : System.out.println("Aqui se mostrara la ayuda requerida por el usuario.");
                    break;
            }
        }
        else{
            System.out.println(i + ": No es una opcion valida");
        }
    }
    public static void opcion_menu(String s)
    {
        if (s.equals("David"))
        {
            System.out.println("Secreto desbloqueado");
        }
        else{
            System.out.println("Solo se permiten numeros");
        }
    }
}
