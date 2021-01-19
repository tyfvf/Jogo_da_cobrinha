
package cobrinha_jogo;

import javax.swing.JFrame;


public class GameFrame extends JFrame {
    GameFrame(){
        
        this.add(new Painel());
        this.setTitle("Cobrinha");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
