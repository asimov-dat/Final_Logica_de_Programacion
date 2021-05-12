package metodos;
import javazoom.jl.player.*;
import java.io.File;

public class PlayerMidi
{
    public static void main(String[] args)
    {
        Player player = new Player();

        player.open(new File("../archivos/La_camisa_negra.mid"));
        player.play();
    }
}