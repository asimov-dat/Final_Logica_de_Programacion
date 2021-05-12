import javazoom.jlgui.basicplayer.BasicPlayer;
import java.io.File;

public class Reproductor{
	private BasicPlayer player;
	player = new BasicPlayer();

}

public void Play() throws Exception {
  player.play();
}

public void AbrirFichero(String ruta) throws Exception {
  player.open(new File(ruta));
}

public void Pausa() throws Exception {
  player.pause();
}

public void Continuar() throws Exception {
  player.resume();
}

public void Stop() throws Exception {
  player.stop();
}

public static void main(String args[]){
try {
  Reproductor mi_reproductor = new Reproductor();
  mi_reproductor.AbrirFichero("../archivos/a_camisa_negra.mid");
  mi_reproductor.Play();
} catch (Exception ex) {
  System.out.println("Error: " + ex.getMessage());
}
}