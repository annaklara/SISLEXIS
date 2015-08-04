package Interface;

public class MensagemSair extends javax.swing.JFrame {

    public MensagemSair() {
        initComponents();
    }

    @SuppressWarnings("unchecked") 
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSair = new javax.swing.JPanel();
        mensagemSair = new javax.swing.JLabel();
        btSim = new javax.swing.JLabel();
        btNao = new javax.swing.JLabel();

        setTitle("Sair");

        jPanelSair.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSair.setPreferredSize(new java.awt.Dimension(300, 150));

        mensagemSair.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mensagemSair.setText("Tem certeza que deseja sair?");

        btSim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btSimInativo.png"))); // NOI18N
        btSim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSimMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSimMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSimMouseExited(evt);
            }
        });

        btNao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btNaoInativo.png"))); // NOI18N
        btNao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btNaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btNaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btNaoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelSairLayout = new javax.swing.GroupLayout(jPanelSair);
        jPanelSair.setLayout(jPanelSairLayout);
        jPanelSairLayout.setHorizontalGroup(
            jPanelSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSairLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(mensagemSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelSairLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btSim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btNao)
                .addContainerGap())
        );
        jPanelSairLayout.setVerticalGroup(
            jPanelSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSairLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(mensagemSair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanelSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSim, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btNao, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSair, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSair, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSimMouseClicked
        // Encerra o sistema
        System.exit(WIDTH);
    }//GEN-LAST:event_btSimMouseClicked

    private void btNaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNaoMouseClicked
        // Cancelar saída
        dispose();
        Principal.mensagemAlerta = false;
        Principal.mensagemSair = false;
    }//GEN-LAST:event_btNaoMouseClicked

    private void btNaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNaoMouseEntered
        btNao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btNaoAtivo.png")));
    }//GEN-LAST:event_btNaoMouseEntered

    private void btSimMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSimMouseExited
        btSim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btSimInativo.png")));
    }//GEN-LAST:event_btSimMouseExited

    private void btSimMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSimMouseEntered
        btSim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btSimAtivo.png")));
    }//GEN-LAST:event_btSimMouseEntered

    private void btNaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNaoMouseExited
        btNao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btNaoInativo.png")));
    }//GEN-LAST:event_btNaoMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btNao;
    private javax.swing.JLabel btSim;
    private javax.swing.JPanel jPanelSair;
    private javax.swing.JLabel mensagemSair;
    // End of variables declaration//GEN-END:variables
public static void main(String args[]) {
    
    
}


}
