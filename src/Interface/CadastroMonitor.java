package Interface;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CadastroMonitor extends javax.swing.JInternalFrame {

    public CadastroMonitor() {

        initComponents();
    }

    // Verifica se a DATA está no formato coreto
    private boolean validaData(String data) {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        formatoData.setLenient(false);
        try {
            formatoData.parse(data);
            return true;
        } catch (ParseException ex) {
            return false;
        }
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
        // Verificando o formato (Linha 14)
        if (validaData(campoDtNascimento.getText())) {
            rotuloDtNascimento.setForeground(new Color(0, 51, 102));
        } else {
            rotuloDtNascimento.setForeground(Color.red);
            restricao = true;
        }
        if (radioM.isSelected()
                == false && radioF.isSelected() == false) {
            rotuloSexo.setForeground(Color.red);
            restricao = true;
        } else {
            rotuloSexo.setForeground(new Color(0, 51, 102));
        }
        if (campoFuncao.getText()
                .trim().equals("")) {
            rotuloFuncao.setForeground(Color.red);
            restricao = true;
        } else {
            rotuloFuncao.setForeground(new Color(0, 51, 102));
        }
        if (campoNomeUsuario.getText()
                .trim().equals("")) {
            rotuloNomeUsuario.setForeground(Color.red);
            restricao = true;
        } else {
            rotuloNomeUsuario.setForeground(new Color(0, 51, 102));
        }
        if (campoSenha.getText()
                .trim().equals("") || campoSenhaConfirmar.getText().trim().equals("")) {
            rotuloSenha.setForeground(Color.red);
            rotuloSenhaConfirmar.setForeground(Color.red);
            restricao = true;
        } else {
            rotuloSenha.setForeground(new Color(0, 51, 102));
            rotuloSenhaConfirmar.setForeground(new Color(0, 51, 102));
        }

        // Evita que haja euivoco na senha 
        if (restricao
                == false) {
            // Verifica se as senhas coincidem
            if (campoSenha.getText().equals(campoSenhaConfirmar.getText())) {
                mensagemSalvamento();
            } else {
                // Mostra amensagem de erro de comparação de senha
                textoSenhaDiferente.setText("As senhas digitadas não coincidem.");
            }
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
        rotuloDtNascimento = new javax.swing.JLabel();
        campoDtNascimento = new javax.swing.JFormattedTextField();
        rotuloSexo = new javax.swing.JLabel();
        radioM = new javax.swing.JRadioButton();
        radioF = new javax.swing.JRadioButton();
        rotuloFuncao = new javax.swing.JLabel();
        campoFuncao = new javax.swing.JTextField();
        rotuloNivelEnsino = new javax.swing.JLabel();
        campoNivelEnsino = new javax.swing.JTextField();
        rotuloNomeUsuario = new javax.swing.JLabel();
        campoNomeUsuario = new javax.swing.JTextField();
        rotuloSenha = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        rotuloSenhaConfirmar = new javax.swing.JLabel();
        campoSenhaConfirmar = new javax.swing.JPasswordField();
        textoSenhaDiferente = new javax.swing.JLabel();
        rotuloExData = new javax.swing.JLabel();
        btSalvar = new javax.swing.JLabel();
        btSair = new javax.swing.JLabel();

        setTitle("Cadastrar Monitor");
        setMinimumSize(new java.awt.Dimension(546, 360));
        setPreferredSize(new java.awt.Dimension(546, 360));

        planoDeFundo.setBackground(new java.awt.Color(255, 255, 255));
        planoDeFundo.setMinimumSize(new java.awt.Dimension(0, 0));
        planoDeFundo.setPreferredSize(new java.awt.Dimension(530, 330));

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

        rotuloDtNascimento.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        rotuloDtNascimento.setForeground(new java.awt.Color(0, 51, 102));
        rotuloDtNascimento.setText("DATA DE NASCIMENTO*");

        campoDtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        campoDtNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDtNascimentoActionPerformed(evt);
            }
        });
        campoDtNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoDtNascimentoKeyReleased(evt);
            }
        });

        rotuloSexo.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        rotuloSexo.setForeground(new java.awt.Color(0, 51, 102));
        rotuloSexo.setText("SEXO*");

        radioM.setBackground(new java.awt.Color(255, 255, 255));
        btGroupoSexo.add(radioM);
        radioM.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        radioM.setForeground(new java.awt.Color(0, 51, 102));
        radioM.setText("M");

        radioF.setBackground(new java.awt.Color(255, 255, 255));
        btGroupoSexo.add(radioF);
        radioF.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        radioF.setForeground(new java.awt.Color(0, 51, 102));
        radioF.setText("F");

        rotuloFuncao.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        rotuloFuncao.setForeground(new java.awt.Color(0, 51, 102));
        rotuloFuncao.setText("FUNÇÃO");

        campoFuncao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoFuncaoKeyReleased(evt);
            }
        });

        rotuloNivelEnsino.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        rotuloNivelEnsino.setForeground(new java.awt.Color(0, 51, 102));
        rotuloNivelEnsino.setText("NÍVEL DE ENSINO");

        campoNivelEnsino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoNivelEnsinoKeyReleased(evt);
            }
        });

        rotuloNomeUsuario.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        rotuloNomeUsuario.setForeground(new java.awt.Color(0, 51, 102));
        rotuloNomeUsuario.setText("NOME DE USUÁRIO*");

        rotuloSenha.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        rotuloSenha.setForeground(new java.awt.Color(0, 51, 102));
        rotuloSenha.setText("SENHA*");

        rotuloSenhaConfirmar.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        rotuloSenhaConfirmar.setForeground(new java.awt.Color(0, 51, 102));
        rotuloSenhaConfirmar.setText("CONFIRME SUA SENHA*");

        textoSenhaDiferente.setForeground(new java.awt.Color(255, 0, 0));

        rotuloExData.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        rotuloExData.setText("dd/mm/aaaa");

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
                                .addComponent(campoNome))
                            .addGroup(planoDeFundoLayout.createSequentialGroup()
                                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(planoDeFundoLayout.createSequentialGroup()
                                        .addComponent(rotuloFuncao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(planoDeFundoLayout.createSequentialGroup()
                                        .addComponent(rotuloDtNascimento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoDtNascimento)))
                                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(planoDeFundoLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(rotuloNivelEnsino))
                                    .addGroup(planoDeFundoLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(rotuloExData)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(planoDeFundoLayout.createSequentialGroup()
                                        .addComponent(rotuloSexo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioM)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioF))
                                    .addComponent(campoNivelEnsino, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 12, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, planoDeFundoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(planoDeFundoLayout.createSequentialGroup()
                                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btSalvar)
                                    .addGroup(planoDeFundoLayout.createSequentialGroup()
                                        .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rotuloSenha)
                                            .addComponent(rotuloNomeUsuario)
                                            .addComponent(rotuloSenhaConfirmar))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(campoNomeUsuario)
                                            .addComponent(campoSenha)
                                            .addComponent(campoSenhaConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSair))
                            .addGroup(planoDeFundoLayout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(textoSenhaDiferente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        planoDeFundoLayout.setVerticalGroup(
            planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planoDeFundoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloNome)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloDtNascimento)
                    .addComponent(campoDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloSexo)
                    .addComponent(radioM)
                    .addComponent(radioF)
                    .addComponent(rotuloExData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloFuncao)
                    .addComponent(campoFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloNivelEnsino)
                    .addComponent(campoNivelEnsino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloNomeUsuario)
                    .addComponent(campoNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloSenha)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoSenhaConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloSenhaConfirmar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoSenhaDiferente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
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
            .addComponent(planoDeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void campoDtNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDtNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDtNascimentoActionPerformed

    private void campoDtNascimentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDtNascimentoKeyReleased
        // Retira tudo que não está entre 0 e 9 exceto "/" (O "^" nega a ação)
        campoDtNascimento.setText(campoDtNascimento.getText().replaceAll("[^0-9 | ^/]", ""));
    }//GEN-LAST:event_campoDtNascimentoKeyReleased

    private void campoFuncaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoFuncaoKeyReleased
        // Deixando as letras maiúsculas
        campoNome.setText(campoNome.getText().toUpperCase());
        // Remove espaços duplos
        campoNome.setText(campoNome.getText().replace("  ", " "));
    }//GEN-LAST:event_campoFuncaoKeyReleased

    private void campoNivelEnsinoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNivelEnsinoKeyReleased
        // Deixando as letras maiúsculas
        campoNome.setText(campoNome.getText().toUpperCase());
        // Remove espaços duplos
        campoNome.setText(campoNome.getText().replace("  ", " "));
    }//GEN-LAST:event_campoNivelEnsinoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btGroupoSexo;
    private javax.swing.JLabel btSair;
    private javax.swing.JLabel btSalvar;
    private javax.swing.JFormattedTextField campoDtNascimento;
    private javax.swing.JTextField campoFuncao;
    private javax.swing.JTextField campoNivelEnsino;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNomeUsuario;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JPasswordField campoSenhaConfirmar;
    private javax.swing.JPanel planoDeFundo;
    private javax.swing.JRadioButton radioF;
    private javax.swing.JRadioButton radioM;
    private javax.swing.JLabel rotuloDtNascimento;
    private javax.swing.JLabel rotuloExData;
    private javax.swing.JLabel rotuloFuncao;
    private javax.swing.JLabel rotuloNivelEnsino;
    private javax.swing.JLabel rotuloNome;
    private javax.swing.JLabel rotuloNomeUsuario;
    private javax.swing.JLabel rotuloSenha;
    private javax.swing.JLabel rotuloSenhaConfirmar;
    private javax.swing.JLabel rotuloSexo;
    private javax.swing.JLabel textoSenhaDiferente;
    // End of variables declaration//GEN-END:variables
}
