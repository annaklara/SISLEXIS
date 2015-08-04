package Atividades.Atividade1;

import Atividades.Base;
import static Interface.Principal.mensagemAlerta;
import Interface.Utilidades.PlanoDeFundo;

public class Atividade1 extends javax.swing.JInternalFrame {

    public Atividade1() {

        initComponents();

        /*
         Definição do Plano de Fundo
         OBSERVAÇÃO: Caso a imagem não preencha o fundo por completo,
         Reposicione o JDesktopPane (areaDeTrabalho) no JFrame (Atividade).
         */
        areaDeTrabalho.setBorder(new PlanoDeFundo());

        // Recebendo a posição original da palavra
        this.palavra1x = palavra1.getLocation().x;
        this.palavra1y = palavra1.getLocation().y;
        this.palavra2x = palavra2.getLocation().x;
        this.palavra2y = palavra2.getLocation().y;
        this.palavra3x = palavra3.getLocation().x;
        this.palavra3y = palavra3.getLocation().y;
        this.palavra4x = palavra4.getLocation().x;
        this.palavra4y = palavra4.getLocation().y;
        this.palavra5x = palavra5.getLocation().x;
        this.palavra5y = palavra5.getLocation().y;

    }
    // Tornando a posição acessível
    int palavra1x, palavra1y, palavra2x, palavra2y, palavra3x, palavra3y, palavra4x, palavra4y, palavra5x, palavra5y;
    boolean p1, p2, p3, p4, p5;

    //♣♣♣♣♣♣(↓)♣♣♣♣♣♣
    // Executando um método da classe anterior (Base Linha 42)
    private Base base;

    // Ativa a base
    public void ativar(Base base) {
        this.base = base;
        setVisible(true);
    }

    // Executa o método desejado
    public void iniciaAtividadeNaBase() {
        base.iniciaAtividade('0');
    }//♣♣♣♣♣♣(↑)♣♣♣♣♣♣

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaDeTrabalho = new javax.swing.JDesktopPane();
        palavra1 = new javax.swing.JLabel();
        palavra2 = new javax.swing.JLabel();
        palavra3 = new javax.swing.JLabel();
        palavra4 = new javax.swing.JLabel();
        palavra5 = new javax.swing.JLabel();
        figura1 = new javax.swing.JLabel();
        figura2 = new javax.swing.JLabel();
        figura3 = new javax.swing.JLabel();
        figura4 = new javax.swing.JLabel();
        figura5 = new javax.swing.JLabel();
        rotuloTitulo = new javax.swing.JLabel();
        btSair = new javax.swing.JLabel();
        barra = new javax.swing.JLabel();
        mascara = new javax.swing.JLabel();

        areaDeTrabalho.setMinimumSize(new java.awt.Dimension(1000, 700));

        palavra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/palavraCasa.png"))); // NOI18N
        palavra1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                palavra1MouseDragged(evt);
            }
        });
        palavra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                palavra1MouseReleased(evt);
            }
        });
        areaDeTrabalho.add(palavra1);
        palavra1.setBounds(420, 510, 170, 45);

        palavra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/palavraDedo.png"))); // NOI18N
        palavra2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                palavra2MouseDragged(evt);
            }
        });
        palavra2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                palavra2MouseReleased(evt);
            }
        });
        areaDeTrabalho.add(palavra2);
        palavra2.setBounds(610, 510, 170, 45);

        palavra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/palavraCinto.png"))); // NOI18N
        palavra3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                palavra3MouseDragged(evt);
            }
        });
        palavra3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                palavra3MouseReleased(evt);
            }
        });
        areaDeTrabalho.add(palavra3);
        palavra3.setBounds(230, 510, 170, 45);

        palavra4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/palavraDado.png"))); // NOI18N
        palavra4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                palavra4MouseDragged(evt);
            }
        });
        palavra4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                palavra4MouseReleased(evt);
            }
        });
        areaDeTrabalho.add(palavra4);
        palavra4.setBounds(800, 510, 170, 45);

        palavra5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/palavraLampada.png"))); // NOI18N
        palavra5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                palavra5MouseDragged(evt);
            }
        });
        palavra5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                palavra5MouseReleased(evt);
            }
        });
        areaDeTrabalho.add(palavra5);
        palavra5.setBounds(40, 510, 170, 45);

        figura1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/figuraCasa.png"))); // NOI18N
        areaDeTrabalho.add(figura1);
        figura1.setBounds(30, 70, 180, 350);

        figura2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/figuraDedo.png"))); // NOI18N
        areaDeTrabalho.add(figura2);
        figura2.setBounds(220, 70, 180, 350);

        figura3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/figuraCinto.png"))); // NOI18N
        areaDeTrabalho.add(figura3);
        figura3.setBounds(410, 70, 180, 350);

        figura4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/figuraDado.png"))); // NOI18N
        areaDeTrabalho.add(figura4);
        figura4.setBounds(600, 70, 180, 350);

        figura5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/figuraLampada.png"))); // NOI18N
        areaDeTrabalho.add(figura5);
        figura5.setBounds(790, 70, 180, 350);

        rotuloTitulo.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        rotuloTitulo.setForeground(new java.awt.Color(255, 255, 255));
        rotuloTitulo.setText("RELACIONE A PALAVRA COM FIGURA CORRESPONDENTE");
        areaDeTrabalho.add(rotuloTitulo);
        rotuloTitulo.setBounds(10, 15, 640, 20);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/atividadeBtCasaInativo.png"))); // NOI18N
        btSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSairMouseExited(evt);
            }
        });
        areaDeTrabalho.add(btSair);
        btSair.setBounds(930, 4, 46, 40);

        barra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/atividadeBarra.png"))); // NOI18N
        areaDeTrabalho.add(barra);
        barra.setBounds(0, 0, 1000, 49);

        mascara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/mascaraAtividades.png"))); // NOI18N
        areaDeTrabalho.add(mascara);
        mascara.setBounds(0, 0, 1000, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaDeTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaDeTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void palavra1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_palavra1MouseReleased
        palavra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/palavraCasa.png")));
        // Colisão da palavra com a imagem
        if ((palavra1.getLocation().x >= figura1.getLocation().x - 90 && palavra1.getLocation().x < figura1.getLocation().x + 90) && (palavra1.getLocation().y >= figura1.getLocation().y - 20 && palavra1.getLocation().y <= figura1.getLocation().y + 330)) {
            // Combina a palavra com a imagem
            palavra1.setLocation(figura1.getLocation().x + 6, figura1.getLocation().y + 300);
            p1 = true;
        } else {
            // Retorna a imagem à posição anterior
            palavra1.setLocation(palavra1x, palavra1y);
        }
    }//GEN-LAST:event_palavra1MouseReleased

    private void palavra1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_palavra1MouseDragged
        if (!p1) {
            areaDeTrabalho.moveToFront(palavra1);
            palavra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/palavraCasaP.png")));
            // Permite arrastar a imagem (localDaImagem + localDoMouse - tamanho da imagem / 2)
            palavra1.setLocation(palavra1.getLocation().x + evt.getX() - palavra1.getWidth() / 2, palavra1.getLocation().y + evt.getY() - palavra1.getHeight() / 2);
        }
    }//GEN-LAST:event_palavra1MouseDragged

    private void btSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseExited
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/atividadeBtCasaInativo.png")));
    }//GEN-LAST:event_btSairMouseExited

    private void btSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseEntered
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/atividadeBtCasaAtivo.png")));
    }//GEN-LAST:event_btSairMouseEntered

    private void btSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseClicked
        if (mensagemAlerta == false) {
            iniciaAtividadeNaBase();
            this.dispose();
        }
    }//GEN-LAST:event_btSairMouseClicked

    private void palavra2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_palavra2MouseDragged
        if (!p2) {
            areaDeTrabalho.moveToFront(palavra2);
            palavra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/palavraDedoP.png")));
            // Permite arrastar a imagem (localDaImagem + localDoMouse - tamanho da imagem / 2)
            palavra2.setLocation(palavra2.getLocation().x + evt.getX() - palavra2.getWidth() / 2, palavra2.getLocation().y + evt.getY() - palavra2.getHeight() / 2);
        }
    }//GEN-LAST:event_palavra2MouseDragged

    private void palavra2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_palavra2MouseReleased
        palavra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/palavraDedo.png")));
        // Colisão da palavra com a imagem
        if ((palavra2.getLocation().x >= figura2.getLocation().x - 90 && palavra2.getLocation().x < figura2.getLocation().x + 90) && (palavra2.getLocation().y >= figura2.getLocation().y - 20 && palavra2.getLocation().y <= figura2.getLocation().y + 330)) {
            // Combina a palavra com a imagem
            palavra2.setLocation(figura2.getLocation().x + 6, figura2.getLocation().y + 300);
            p2 = true;
        } else {
            // Retorna a imagem à posição anterior
            palavra2.setLocation(palavra2x, palavra2y);
        }
    }//GEN-LAST:event_palavra2MouseReleased

    private void palavra3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_palavra3MouseDragged
        if (!p3) {
            areaDeTrabalho.moveToFront(palavra3);
            areaDeTrabalho.moveToFront(palavra3);
            palavra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/palavraCintoP.png")));
            // Permite arrastar a imagem (localDaImagem + localDoMouse - tamanho da imagem / 2)
            palavra3.setLocation(palavra3.getLocation().x + evt.getX() - palavra3.getWidth() / 2, palavra3.getLocation().y + evt.getY() - palavra3.getHeight() / 2);
        }
    }//GEN-LAST:event_palavra3MouseDragged

    private void palavra3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_palavra3MouseReleased
        palavra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/palavraCinto.png")));
        // Colisão da palavra com a imagem
        if ((palavra3.getLocation().x >= figura3.getLocation().x - 90 && palavra3.getLocation().x < figura3.getLocation().x + 90) && (palavra3.getLocation().y >= figura3.getLocation().y - 20 && palavra3.getLocation().y <= figura3.getLocation().y + 330)) {
            // Combina a palavra com a imagem
            palavra3.setLocation(figura3.getLocation().x + 6, figura3.getLocation().y + 300);
            p3 = true;
        } else {
            // Retorna a imagem à posição anterior
            palavra3.setLocation(palavra3x, palavra3y);
        }
    }//GEN-LAST:event_palavra3MouseReleased

    private void palavra4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_palavra4MouseDragged
        if (!p4) {
            areaDeTrabalho.moveToFront(palavra4);
            palavra4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/palavraDadoP.png")));
            // Permite arrastar a imagem (localDaImagem + localDoMouse - tamanho da imagem / 2)
            palavra4.setLocation(palavra4.getLocation().x + evt.getX() - palavra4.getWidth() / 2, palavra4.getLocation().y + evt.getY() - palavra4.getHeight() / 2);
        }
    }//GEN-LAST:event_palavra4MouseDragged

    private void palavra4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_palavra4MouseReleased
        palavra4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/palavraDado.png")));
        // Colisão da palavra com a imagem
        if ((palavra4.getLocation().x >= figura4.getLocation().x - 90 && palavra4.getLocation().x < figura4.getLocation().x + 90) && (palavra4.getLocation().y >= figura4.getLocation().y - 20 && palavra4.getLocation().y <= figura4.getLocation().y + 330)) {
            // Combina a palavra com a imagem
            palavra4.setLocation(figura4.getLocation().x + 6, figura4.getLocation().y + 300);
            p4 = true;
        } else {
            // Retorna a imagem à posição anterior
            palavra4.setLocation(palavra4x, palavra4y);
        }
    }//GEN-LAST:event_palavra4MouseReleased

    private void palavra5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_palavra5MouseDragged
        if (!p5) {
            areaDeTrabalho.moveToFront(palavra5);
            palavra5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/palavraLampadaP.png")));
            // Permite arrastar a imagem (localDaImagem + localDoMouse - tamanho da imagem / 2)
            palavra5.setLocation(palavra5.getLocation().x + evt.getX() - palavra5.getWidth() / 2, palavra5.getLocation().y + evt.getY() - palavra5.getHeight() / 2);
        }
    }//GEN-LAST:event_palavra5MouseDragged

    private void palavra5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_palavra5MouseReleased
        palavra5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/palavraLampada.png")));
        // Colisão da palavra com a imagem
        if ((palavra5.getLocation().x >= figura5.getLocation().x - 90 && palavra5.getLocation().x < figura5.getLocation().x + 90) && (palavra5.getLocation().y >= figura5.getLocation().y - 20 && palavra5.getLocation().y <= figura5.getLocation().y + 330)) {
            // Combina a palavra com a imagem
            palavra5.setLocation(figura5.getLocation().x + 6, figura5.getLocation().y + 300);
            p5 = true;
        } else {
            // Retorna a imagem à posição anterior
            palavra5.setLocation(palavra5x, palavra5y);
        }
    }//GEN-LAST:event_palavra5MouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane areaDeTrabalho;
    private javax.swing.JLabel barra;
    private javax.swing.JLabel btSair;
    private javax.swing.JLabel figura1;
    private javax.swing.JLabel figura2;
    private javax.swing.JLabel figura3;
    private javax.swing.JLabel figura4;
    private javax.swing.JLabel figura5;
    private javax.swing.JLabel mascara;
    private javax.swing.JLabel palavra1;
    private javax.swing.JLabel palavra2;
    private javax.swing.JLabel palavra3;
    private javax.swing.JLabel palavra4;
    private javax.swing.JLabel palavra5;
    private javax.swing.JLabel rotuloTitulo;
    // End of variables declaration//GEN-END:variables
}
