package Interface;

public class MensagemSalvamento extends javax.swing.JInternalFrame {

    public MensagemSalvamento() {
        initComponents();
        // Ícone SISLEXIS
        this.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeSIS16.png")));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        planoDeFundo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btConcluir = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(282, 130));
        setPreferredSize(new java.awt.Dimension(282, 130));

        planoDeFundo.setBackground(new java.awt.Color(255, 255, 255));
        planoDeFundo.setMinimumSize(new java.awt.Dimension(266, 120));
        planoDeFundo.setName(""); // NOI18N
        planoDeFundo.setPreferredSize(new java.awt.Dimension(266, 120));
        planoDeFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Salvo com sucesso");
        planoDeFundo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 11, -1, -1));

        btConcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btConcluirInativo.png"))); // NOI18N
        btConcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btConcluirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btConcluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btConcluirMouseExited(evt);
            }
        });
        planoDeFundo.add(btConcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 39, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(planoDeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(planoDeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btConcluirMouseClicked
        dispose();
        Principal.mensagemAlerta = false;
        Principal.limiteDeTelas = false;
    }//GEN-LAST:event_btConcluirMouseClicked

    private void btConcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btConcluirMouseEntered
        btConcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btConcluirAtivo.png")));
    }//GEN-LAST:event_btConcluirMouseEntered

    private void btConcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btConcluirMouseExited
        btConcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btConcluirInativo.png")));
    }//GEN-LAST:event_btConcluirMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btConcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel planoDeFundo;
    // End of variables declaration//GEN-END:variables
}
