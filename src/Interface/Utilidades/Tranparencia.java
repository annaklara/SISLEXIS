
package Interface.Utilidades;

import java.awt.Color;
import javax.swing.JFrame;


public class Tranparencia {
    
    public void aplicaTransparencia (JFrame janela){
        janela.setUndecorated(true);
        janela.setBackground(new Color(0,0,0,0));
    }
    
}
