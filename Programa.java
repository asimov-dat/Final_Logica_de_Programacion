import metodos.Menu;
import metodos.LeerArchivo;
import java.util.Scanner;
import java.io.*;

public class Programa
{
    public static void main(String[] args)
    {
        Scanner uInput = new Scanner(System.in);
        String opcionS;
        byte opcionN = 0;

        Menu.mostar_bienbenida();
        Menu.mostar_menu();
        
        System.out.print("     $ ");
        opcionN = uInput.nextByte();
        if(opcionN != 127)
        {
            do 
            {
                Menu.opcion_menu(opcionN);
                System.out.println("\n");
                Menu.mostar_menu();
                System.out.print("     $ ");
                opcionN = uInput.nextByte();
            }while(opcionN != 7);
            
        }
        else{
            uInput.nextLine();
            opcionS = uInput.nextLine();
            Menu.opcion_menu(opcionS);
        }
            
        
        uInput.nextLine();
        uInput.nextLine();
    }
}