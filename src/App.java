import java.util.Scanner;
import javax.swing.JOptionPane;

import com.forca.controle.BorderController2;
import com.forca.model.Player;


public class App {
    public static void main(String[] args) throws Exception {
        BorderController2 borderController = new BorderController2();
        Player player = new Player("Jogador 1");
        borderController.startGame(player);

        Scanner scanner = new Scanner(System.in);
       
    
        while (true) {
           /*  JOptionPane.showMessageDialog(null, "Pontos: " + borderController.border.getPoint());
            JOptionPane.showMessageDialog(null, "Erros: " + borderController.border.getError());
            JOptionPane.showMessageDialog(null, "Palavra secreta: " + borderController.border.getSecretWord()); */
            //JOptionPane.showMessageDialog(null, "Letras utilizadas: " + borderController.usedLetters.toString());
    /*         System.out.println("Pontos: " + borderController.border.getPoint());
            System.out.println("Erros: " + borderController.border.getError());
            System.out.println("Palavra secreta: " + borderController.border.getSecretWord());
            System.out.println("Letras utilizadas: " + borderController.usedLetters.toString()); */
    
           String letra = JOptionPane.showInputDialog(""+
           "Jogo da forca:\n"+
           "Palavra: \n"+
           "Digite uma letra: \n"+
           "Letras utilizadas: " + borderController.usedLetters.toString());
           //System.out.print("Digite uma letra: ");
           //String letra = scanner.next();
            
    
            borderController.typeLetter(letra);
    
            if (borderController.border.getError() == 6) {
                JOptionPane.showMessageDialog(null, "You Lose!");
                //System.out.println("Você perdeu!");
                break;
            } else if (borderController.border.getPoint() == 3) {
                JOptionPane.showMessageDialog(null, "You WIN!");
                //System.out.println("Você venceu!");
                break;
            }
        }
    
        scanner.close();
    }
    
}    

