import javax.swing.JOptionPane;

import com.forca.model.Jogador;

public class App {
    public static void main(String[] args) throws Exception {
        Jogador jogador = new Jogador();
        jogador.setNome("Daniel");
        JOptionPane.showMessageDialog(null, "jogador: "+ jogador.getEmail());
        
    }
}
