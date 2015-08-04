package Interface;

public class PesquisarMonitor extends javax.swing.JInternalFrame {

    public PesquisarMonitor() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGroupoSexo = new javax.swing.ButtonGroup();
        planoDeFundo = new javax.swing.JPanel();
        rotuloNome = new javax.swing.JLabel();
        textoNome = new javax.swing.JTextField();
        btSair = new javax.swing.JLabel();
        rotuloDtNascimento = new javax.swing.JLabel();
        textoDtNascimento = new javax.swing.JFormattedTextField();
        textoSenhaDiferente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Pesquisar Monitor");
        setMinimumSize(new java.awt.Dimension(546, 180));
        setPreferredSize(new java.awt.Dimension(546, 180));

        planoDeFundo.setBackground(new java.awt.Color(255, 255, 255));
        planoDeFundo.setMinimumSize(new java.awt.Dimension(0, 0));
        planoDeFundo.setPreferredSize(new java.awt.Dimension(530, 150));

        rotuloNome.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        rotuloNome.setForeground(new java.awt.Color(0, 51, 102));
        rotuloNome.setText("NOME*");

        textoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNomeActionPerformed(evt);
            }
        });
        textoNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoNomeKeyReleased(evt);
            }
        });

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btSairInativoP.png"))); // NOI18N
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

        rotuloDtNascimento.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        rotuloDtNascimento.setForeground(new java.awt.Color(0, 51, 102));
        rotuloDtNascimento.setText("DATA DE NASCIMENTO");

        textoDtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        textoDtNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoDtNascimentoActionPerformed(evt);
            }
        });

        textoSenhaDiferente.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btPesquisarInativo.png"))); // NOI18N

        javax.swing.GroupLayout planoDeFundoLayout = new javax.swing.GroupLayout(planoDeFundo);
        planoDeFundo.setLayout(planoDeFundoLayout);
        planoDeFundoLayout.setHorizontalGroup(
            planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planoDeFundoLayout.createSequentialGroup()
                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(planoDeFundoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(planoDeFundoLayout.createSequentialGroup()
                                .addComponent(rotuloNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoNome))
                            .addGroup(planoDeFundoLayout.createSequentialGroup()
                                .addComponent(rotuloDtNascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, planoDeFundoLayout.createSequentialGroup()
                        .addContainerGap(182, Short.MAX_VALUE)
                        .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoSenhaDiferente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(planoDeFundoLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSair)))))
                .addContainerGap())
        );
        planoDeFundoLayout.setVerticalGroup(
            planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planoDeFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloNome)
                    .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloDtNascimento)
                    .addComponent(textoDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btSair)
                    .addComponent(jLabel1))
                .addGap(99, 99, 99)
                .addComponent(textoSenhaDiferente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(planoDeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(planoDeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNomeActionPerformed

    private void btSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseClicked
        // Verificando se já existem mensagens ativas na área de trabalho
        if (Principal.mensagemAlerta == false && Principal.mensagemSair == false) {
            // Liberando o limite de telas
            Principal.limiteDeTelas = false;
            // Fachando a janela
            dispose();
        }
    }//GEN-LAST:event_btSairMouseClicked

    private void btSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseEntered
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btSairAtivoP.png")));
    }//GEN-LAST:event_btSairMouseEntered

    private void btSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseExited
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btSairInativoP.png")));
    }//GEN-LAST:event_btSairMouseExited

    private void textoNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNomeKeyReleased
        // Deixando as letras maiúsculas
        textoNome.setText(textoNome.getText().toUpperCase());
        // Remove espaços duplos
        textoNome.setText(textoNome.getText().replace("  ", " "));
        // Remove os números
        textoNome.setText(textoNome.getText().replaceAll("[0-9]", ""));

    }//GEN-LAST:event_textoNomeKeyReleased

    private void textoDtNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoDtNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoDtNascimentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btGroupoSexo;
    private javax.swing.JLabel btSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel planoDeFundo;
    private javax.swing.JLabel rotuloDtNascimento;
    private javax.swing.JLabel rotuloNome;
    private javax.swing.JFormattedTextField textoDtNascimento;
    private javax.swing.JTextField textoNome;
    private javax.swing.JLabel textoSenhaDiferente;
    // End of variables declaration//GEN-END:variables
}
