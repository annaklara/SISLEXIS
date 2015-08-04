package Atividades;

import Atividades.Atividade1.Atividade1;
import Interface.Utilidades.PlanoDeFundo;
import java.awt.Toolkit;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Base extends javax.swing.JFrame {

    public Base() {

        // Remove a barra de título
        this.setUndecorated(true);
        // Coloca sempre no topo ("Conflita com o botão sair")
        // this.setAlwaysOnTop(true);
        // Torna visível
        this.setVisible(true);

        initComponents();

        // Inicia maximizado
        this.setExtendedState(Base.MAXIMIZED_BOTH);

        /*
         Definição do Plano de Fundo
         OBSERVAÇÃO: Caso a imagem não preencha o fundo por completo,
         Reposicione o JDesktopPane (areaDeTrabalho) no JFrame (Base).
         */
        areaDeTrabalho.setBorder(new PlanoDeFundo());

        // Iniciando o jDesktopPane (Atividade) centralizado
        SelecaoAtividades atividade = new SelecaoAtividades();
        areaDeTrabalho.add(atividade);
        atividade.setVisible(true);
        // Retira a barra superior do jInternalFrame
        ((BasicInternalFrameUI) atividade.getUI()).setNorthPane(null);
        // Remove as bordas o jInternalFrame
        atividade.setBorder(null);
        // Posiciona o jInternalFrame no centro da tela
        atividade.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 2 - (atividade.getWidth() / 2), Toolkit.getDefaultToolkit().getScreenSize().height / 2 - (atividade.getHeight() / 2));
        //♣♣♣♣♣♣(↓)♣♣♣♣♣♣
        // Permite que a classe instanciada utilize os métodos dessa classe
        atividade.ativar(this);
        //♣♣♣♣♣♣(↑)♣♣♣♣♣♣
    }

    public void iniciaAtividade(char selecao) {
        switch (selecao) {
            case '0':
                // Iniciando o jDesktopPane (Atividade) centralizado
                SelecaoAtividades selecaoAtividade = new SelecaoAtividades();
                areaDeTrabalho.add(selecaoAtividade);
                selecaoAtividade.setVisible(true);
                // Retira a barra superior do jInternalFrame
                ((BasicInternalFrameUI) selecaoAtividade.getUI()).setNorthPane(null);
                // Remove as bordas o jInternalFrame
                selecaoAtividade.setBorder(null);
                // Posiciona o jInternalFrame no centro da tela
                selecaoAtividade.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 2 - (selecaoAtividade.getWidth() / 2), Toolkit.getDefaultToolkit().getScreenSize().height / 2 - (selecaoAtividade.getHeight() / 2));

                // Passa a instancia de Base para SelecaoAtividades
                selecaoAtividade.ativar(this);

                break;
            case '1':
                Atividade1 atividade1 = new Atividade1();
                areaDeTrabalho.add(atividade1);
                atividade1.setVisible(true);
                // Retira a barra superior do jInternalFrame
                ((BasicInternalFrameUI) atividade1.getUI()).setNorthPane(null);
                // Remove as bordas o jInternalFrame
                atividade1.setBorder(null);
                // Posiciona o jInternalFrame no centro da tela
                atividade1.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 2 - (atividade1.getWidth() / 2), Toolkit.getDefaultToolkit().getScreenSize().height / 2 - (atividade1.getHeight() / 2));

                // passa a instancia de Base para SelecaoAtividades
                atividade1.ativar(this);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaDeTrabalho = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaDeTrabalho.setMinimumSize(new java.awt.Dimension(1000, 700));

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Base().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane areaDeTrabalho;
    // End of variables declaration//GEN-END:variables
}
