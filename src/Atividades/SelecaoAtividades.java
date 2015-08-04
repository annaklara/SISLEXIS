package Atividades;

import Interface.MensagemSair;
import static Interface.Principal.mensagemAlerta;
import Interface.Utilidades.PlanoDeFundo;

public class SelecaoAtividades extends javax.swing.JInternalFrame {

    public SelecaoAtividades() {

        initComponents();

        /*
         Definição do Plano de Fundo
         OBSERVAÇÃO: Caso a imagem não preencha o fundo por completo,
         Reposicione o JDesktopPane (areaDeTrabalho) no JFrame (Atividade).
         */
        areaDeTrabalho.setBorder(new PlanoDeFundo());
    }
    //♣♣♣♣♣♣(↓)♣♣♣♣♣♣
    // Executando um método da classe anterior (Base Linha 42)
    private Base base;
    // Ativa a base
    public void ativar(Base base) {
        this.base = base;
        setVisible(true);
    }
    // Executa o método desejado
    public void iniciaAtividadeNaBase(char selecao) {
        base.iniciaAtividade(selecao);
    }//♣♣♣♣♣♣(↑)♣♣♣♣♣♣

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaDeTrabalho = new javax.swing.JDesktopPane();
        atividade1 = new javax.swing.JLabel();
        btSair = new javax.swing.JLabel();
        mascara = new javax.swing.JLabel();

        areaDeTrabalho.setMinimumSize(new java.awt.Dimension(1000, 700));

        atividade1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btAtividade1Inativo.png"))); // NOI18N
        atividade1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atividade1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                atividade1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                atividade1MouseExited(evt);
            }
        });
        areaDeTrabalho.add(atividade1);
        atividade1.setBounds(110, 170, 170, 40);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btSairInativo.png"))); // NOI18N
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
        btSair.setBounds(10, 593, 170, 40);

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

    private void btSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseClicked
        if (mensagemAlerta == false) {
            MensagemSair sair = new MensagemSair();
            sair.setVisible(true);
            sair.setAlwaysOnTop(true);
            // Ocultando o painel de cadastros e resetando os ícones dos botões
            mensagemAlerta = (true);
        }
    }//GEN-LAST:event_btSairMouseClicked

    private void btSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseEntered
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btSairAtivo.png")));
    }//GEN-LAST:event_btSairMouseEntered

    private void btSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseExited
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btSairInativo.png")));
    }//GEN-LAST:event_btSairMouseExited

    private void atividade1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atividade1MouseClicked
        iniciaAtividadeNaBase('1');
        this.dispose();
    }//GEN-LAST:event_atividade1MouseClicked

    private void atividade1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atividade1MouseEntered
 atividade1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btAtividade1Ativo.png")));
    }//GEN-LAST:event_atividade1MouseEntered

    private void atividade1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atividade1MouseExited
 atividade1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btAtividade1Inativo.png")));
    }//GEN-LAST:event_atividade1MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane areaDeTrabalho;
    private javax.swing.JLabel atividade1;
    private javax.swing.JLabel btSair;
    private javax.swing.JLabel mascara;
    // End of variables declaration//GEN-END:variables
}
