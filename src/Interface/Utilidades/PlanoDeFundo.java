package Interface.Utilidades;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

/*
OBSERVAÇÃO: Caso a imagem não preencha o fundo por completo,
            Reposicione o JDesktopPane (areaDeTrabalho) no JFrame (Principal).
*/

public class PlanoDeFundo implements Border {

    // Variável que irá receber a imagem do Plano de Fundo
    public BufferedImage imagem;

    public PlanoDeFundo() {
        // Localização da imagem com tratamento de exceção
        try {
            URL enderecoDaImagem = new URL(getClass().getResource("/Imagens/planoDeFundo.jpg").toString());
            imagem = ImageIO.read(enderecoDaImagem);
        } catch (Exception erro) {
            System.err.println(erro.getMessage());
        }
    }

    @Override
    // Posicionando a imagem na área de trabalho
    public void paintBorder(Component c, Graphics g, int x, int y, int largura, int altura) {
        g.drawImage(imagem, (x + (largura - imagem.getWidth()) / 2), (y + (altura - imagem.getHeight()) / 2), null);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0, 0, 0, 0);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }

}
