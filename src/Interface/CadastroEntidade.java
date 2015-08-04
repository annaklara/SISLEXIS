package Interface;

import java.awt.Color;

public class CadastroEntidade extends javax.swing.JInternalFrame {

    public CadastroEntidade() {

        initComponents();
    }

    private void restricoes() {
        // Evita que o administrador seja salvo caso algum campo obrigatório não esteja preenchido
        boolean restricao = false;
        if (campoNome.getText().trim().equals("")) {
            rotuloNome.setForeground(Color.red);
            restricao = true;
        } else {
            rotuloNome.setForeground(new Color(0, 51, 102));
        }
        if (campoEndereco.getText().trim().equals("")) {
            rotuloEndereco.setForeground(Color.red);
            restricao = true;
        } else {
            rotuloEndereco.setForeground(new Color(0, 51, 102));
        }
        if (campoBairro.getText().trim().equals("")) {
            rotuloBairro.setForeground(Color.red);
            restricao = true;
        } else {
            rotuloBairro.setForeground(new Color(0, 51, 102));
        }
        if (campoCidade.getText().trim().equals("")) {
            rotuloCidade.setForeground(Color.red);
            restricao = true;
        } else {
            rotuloCidade.setForeground(new Color(0, 51, 102));
        }
        if (campoCEP.getText().trim().equals("")) {
            rotuloCEP.setForeground(Color.red);
            restricao = true;
        } else {
            rotuloCEP.setForeground(new Color(0, 51, 102));
        }
        if (campoCNPJ.getText().trim().equals("")) {
            rotuloCNPJ.setForeground(Color.red);
            restricao = true;
        } else {
            rotuloCNPJ.setForeground(new Color(0, 51, 102));
        }

    }

    private void mensagemSalvamento() {

        // Instanciando mensagem de salvamento
        MensagemSalvamento salvamento = new MensagemSalvamento();
        // Colocando o título a partir de um campo específico
        salvamento.setTitle(String.valueOf(campoNome.getText()));
        // Abrir um jInternalFrame a partir de outro
        getDesktopPane().add(salvamento);
        // Código para gerar posição da mensagem de salvamento
        salvamento.setLocation(400, 350);
        // Torna a janela visível            
        salvamento.setVisible(true);

        // Restringe a emissão de mensagens
        Principal.mensagemAlerta = true;

        // Fecha a janela (Melhor que manter ativa por evitar sobreposição)
        dispose();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGroupoSexo = new javax.swing.ButtonGroup();
        planoDeFundo = new javax.swing.JPanel();
        rotuloNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        rotuloCNPJ = new javax.swing.JLabel();
        campoCNPJ = new javax.swing.JFormattedTextField();
        rotuloEndereco = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        rotuloBairro = new javax.swing.JLabel();
        campoBairro = new javax.swing.JTextField();
        rotuloCidade = new javax.swing.JLabel();
        campoCidade = new javax.swing.JTextField();
        btSalvar = new javax.swing.JLabel();
        btSair = new javax.swing.JLabel();
        rotuloCEP = new javax.swing.JLabel();
        campoCEP = new javax.swing.JFormattedTextField();

        setTitle("Cadastrar Entidade");
        setMinimumSize(new java.awt.Dimension(546, 260));
        setPreferredSize(new java.awt.Dimension(546, 260));

        planoDeFundo.setBackground(new java.awt.Color(255, 255, 255));
        planoDeFundo.setMinimumSize(new java.awt.Dimension(0, 0));
        planoDeFundo.setPreferredSize(new java.awt.Dimension(530, 250));

        rotuloNome.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        rotuloNome.setForeground(new java.awt.Color(0, 51, 102));
        rotuloNome.setText("NOME*");

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        campoNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoNomeKeyReleased(evt);
            }
        });

        rotuloCNPJ.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        rotuloCNPJ.setForeground(new java.awt.Color(0, 51, 102));
        rotuloCNPJ.setText("CNPJ");

        try {
            campoCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        rotuloEndereco.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        rotuloEndereco.setForeground(new java.awt.Color(0, 51, 102));
        rotuloEndereco.setText("ENDEREÇO");

        campoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEnderecoActionPerformed(evt);
            }
        });
        campoEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoEnderecoKeyReleased(evt);
            }
        });

        rotuloBairro.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        rotuloBairro.setForeground(new java.awt.Color(0, 51, 102));
        rotuloBairro.setText("BAIRRO");

        rotuloCidade.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        rotuloCidade.setForeground(new java.awt.Color(0, 51, 102));
        rotuloCidade.setText("CIDADE");

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btSalvarInativo.png"))); // NOI18N
        btSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSalvarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSalvarMouseExited(evt);
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

        rotuloCEP.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        rotuloCEP.setForeground(new java.awt.Color(0, 51, 102));
        rotuloCEP.setText("CEP");

        try {
            campoCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout planoDeFundoLayout = new javax.swing.GroupLayout(planoDeFundo);
        planoDeFundo.setLayout(planoDeFundoLayout);
        planoDeFundoLayout.setHorizontalGroup(
            planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planoDeFundoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(planoDeFundoLayout.createSequentialGroup()
                        .addComponent(rotuloNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNome)
                        .addGap(18, 18, 18)
                        .addComponent(rotuloCNPJ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(planoDeFundoLayout.createSequentialGroup()
                        .addComponent(rotuloBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rotuloCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                    .addGroup(planoDeFundoLayout.createSequentialGroup()
                        .addComponent(rotuloEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoEndereco))
                    .addGroup(planoDeFundoLayout.createSequentialGroup()
                        .addComponent(rotuloCEP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(planoDeFundoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSair))
                            .addGroup(planoDeFundoLayout.createSequentialGroup()
                                .addComponent(campoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        planoDeFundoLayout.setVerticalGroup(
            planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planoDeFundoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rotuloCNPJ)
                        .addComponent(campoCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rotuloNome)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloEndereco)
                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloBairro)
                    .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloCidade)
                    .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloCEP)
                    .addComponent(campoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalvar)
                    .addComponent(btSair))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(planoDeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(planoDeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

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

    private void btSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarMouseClicked
        // Verificando se já existem mensagens ativas na área de trabalho
        if (Principal.mensagemAlerta == false && Principal.mensagemSair == false) {
            restricoes();
        }
    }//GEN-LAST:event_btSalvarMouseClicked

    private void btSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarMouseEntered
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btSalvarAtivo.png")));
    }//GEN-LAST:event_btSalvarMouseEntered

    private void btSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarMouseExited
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btSalvarInativo.png")));
    }//GEN-LAST:event_btSalvarMouseExited

    private void campoNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNomeKeyReleased
        // Deixando as letras maiúsculas
        campoNome.setText(campoNome.getText().toUpperCase());
        // Remove espaços duplos
        campoNome.setText(campoNome.getText().replace("  ", " "));
        // Remove os números
        campoNome.setText(campoNome.getText().replaceAll("[0-9]", ""));

    }//GEN-LAST:event_campoNomeKeyReleased

    private void campoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEnderecoActionPerformed

    private void campoEnderecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoEnderecoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEnderecoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btGroupoSexo;
    private javax.swing.JLabel btSair;
    private javax.swing.JLabel btSalvar;
    private javax.swing.JTextField campoBairro;
    private javax.swing.JFormattedTextField campoCEP;
    private javax.swing.JFormattedTextField campoCNPJ;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPanel planoDeFundo;
    private javax.swing.JLabel rotuloBairro;
    private javax.swing.JLabel rotuloCEP;
    private javax.swing.JLabel rotuloCNPJ;
    private javax.swing.JLabel rotuloCidade;
    private javax.swing.JLabel rotuloEndereco;
    private javax.swing.JLabel rotuloNome;
    // End of variables declaration//GEN-END:variables
}
