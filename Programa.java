import metodos.Menu;
import java.util.Scanner;

public class Programa
{
    public static void main(String[] args)
    {
        Scanner uInput = new Scanner(System.in);
        String opcionS;
        byte opcionN = 0;

        Menu.mostar_bienbenida();
        Menu.mostar_menu();
        
        opcionN = uInput.nextByte();
        if(opcionN == 127)
        {
            uInput.nextLine();
            opcionS = uInput.nextLine();
            Menu.opcion_menu(opcionS);
        }
        else{
            Menu.opcion_menu(opcionN);
        }
        
        uInput.nextLine();
        uInput.nextLine();
    }
}