import java.util.Scanner;

public class menu
{
    public static void main(String[] args)
    {
        Scanner uInput = new Scanner(System.in);
        
        System.out.print("1° Reproducir "+"\t" + "2° Lista de canciones"+"\n"+"\n");
        
        byte opcion = uInput.nextByte();
        System.out.println("\n"+"Usted ha escogido: "+ opcion +"\n");

        switch(opcion)
        {
        case 1 : System.out.println("Esta oipcion aun no se encuentra disponible");
            break;
        case 2 : System.out.println("Esta oipcion aun no se encuentra disponible");
            break;
        }
        
    }
}