package Interface;

import Atividades.Base;
import Interface.Utilidades.PlanoDeFundo;

public class Principal extends javax.swing.JFrame {

    // Criando o formulário Principal
    public Principal() {
        initComponents();
        /*
         Definição do Plano de Fundo
         OBSERVAÇÃO: Caso a imagem não preencha o fundo por completo,
         Reposicione o JDesktopPane (areaDeTrabalho) no JFrame (Principal).
         */
        areaDeTrabalho.setBorder(new PlanoDeFundo());
        // Iniciando a área de trabalho maximizada
        //this.setExtendedState(Principal.MAXIMIZED_BOTH);
    }

    // CONTROLADORES
    // Nível de acesso
    public static boolean acessoAdm = false;
    public static boolean acessoMonitor = false;
    public static boolean acessoAluno = false;
    // Limite de telas abertas
    public static boolean limiteDeTelas = false;
    // Botões ativos
    private boolean opcaoCadastro = false;
    private boolean opcaoPesquisa = false;
    // Mensagens
    public static boolean mensagemAlerta = false;
    public static boolean mensagemSair = false;

    // METODOS DE EXIBIÇÃO
    // Exibe o Pinel
    private void exibePainel(char tipo) {
        if ((acessoMonitor == true || acessoAdm == true) && mensagemAlerta == false) // Ativando o painel
        {
            switch (tipo) {
                case 'c':
                    // Ativa o modo cadastrar
                    opcaoCadastro = true;
                    opcaoPesquisa = false;

                    if (acessoAdm == true) {
                        // Desocultando os botões
                        btAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btAdmInativo.png")));
                        btEntidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btEntidadeInativo.png")));
                        btMonitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btMonitorInativo.png")));
                        btTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btTurmaInativo.png")));
                        btAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btAlunoInativo.png")));
                        // Mostra o vinculo com cadastrar
                        mascara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/mascaraCadastrar.png")));
                    } else if (acessoMonitor == true) {
            // Desocultando os botões restritos
            /*
                         btAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btAdmBloqueado.png")));
                         btEntidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btEntidadeBloqueado.png")));
                         btMonitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btMonitorBloqueado.png")));
                         */
                        // Desocultando os botões liberados
                        btTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btTurmaInativo.png")));
                        btAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btAlunoInativo.png")));
                        mascara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/mascaraCadastrar.png")));
                    }
                    break;
                case 'p':
                    // Ativa o modo pesquisar
                    opcaoCadastro = false;
                    opcaoPesquisa = true;
                    if (acessoAdm == true) {
                        // Desocultando os botões
                        btAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btAdmInativo.png")));
                        btEntidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btEntidadeInativo.png")));
                        btMonitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btMonitorInativo.png")));
                        btTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btTurmaInativo.png")));
                        btAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btAlunoInativo.png")));
                        mascara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/mascaraPesquisar.png")));
                    } else if (acessoMonitor == true) {
            // Desocultando os botões restritos
            /*
                         btAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btAdmBloqueado.png")));
                         btEntidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btEntidadeBloqueado.png")));
                         btMonitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btMonitorBloqueado.png")));
                         */
                        // Desocultando os botões liberados
                        btTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btTurmaInativo.png")));
                        btAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btAlunoInativo.png")));
                        mascara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/mascaraPesquisar.png")));
                    }
            }
        }

    }

    // Oculta o Pinel
    private void ocultaPainel(char botao) {
        if (mensagemAlerta == false) {
            // Ocultando os botões
            btAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btOculto.png")));
            btEntidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btOculto.png")));
            btMonitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btOculto.png")));
            btTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btOculto.png")));
            btAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btOculto.png")));
            // Desativando o painel 
            switch (botao) {
                case 'c':
                    opcaoPesquisa = false;
                    break;
                case 'p':
                    opcaoCadastro = false;
                    break;
                case 'o':
                    opcaoCadastro = false;
                    opcaoPesquisa = false;
            }
        }
    }

    // Abre a tela de cadastro
    private void abreTelaCadastro(char tipo) {
        // LEGENDA: a = administrador; e = entidade; m = monitor; t = turma; l = aluno
        switch (tipo) {
            // Tela de cadastro de administrador
            case 'a':
                // Instanciando a tela de cadastro e adicionando a Área de Trabalho
                CadastroAdministrador cadastroA = new CadastroAdministrador();
                areaDeTrabalho.add(cadastroA);
                // Código para gerar a posição centralizada
                cadastroA.setLocation(areaDeTrabalho.getWidth() / 2 - (cadastroA.getWidth() / 2), areaDeTrabalho.getHeight() / 2 - (cadastroA.getHeight() / 2));
                cadastroA.setVisible(true);
                // Controlando o limite de telas
                limiteDeTelas = true;
                break;
            case 'm':
                // Instanciando a tela de cadastro e adicionando a Área de Trabalho
                CadastroMonitor cadastroM = new CadastroMonitor();
                areaDeTrabalho.add(cadastroM);
                // Código para gerar a posição centralizada
                cadastroM.setLocation(areaDeTrabalho.getWidth() / 2 - (cadastroM.getWidth() / 2), areaDeTrabalho.getHeight() / 2 - (cadastroM.getHeight() / 2));
                cadastroM.setVisible(true);
                // Controlando o limite de telas
                limiteDeTelas = true;
                break;
            case 'e':
                // Instanciando a tela de cadastro e adicionando a Área de Trabalho
                CadastroEntidade cadastroE = new CadastroEntidade();
                areaDeTrabalho.add(cadastroE);
                // Código para gerar a posição centralizada
                cadastroE.setLocation(areaDeTrabalho.getWidth() / 2 - (cadastroE.getWidth() / 2), areaDeTrabalho.getHeight() / 2 - (cadastroE.getHeight() / 2));
                cadastroE.setVisible(true);
                // Controlando o limite de telas
                limiteDeTelas = true;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaDeTrabalho = new javax.swing.JDesktopPane();
        btCadastrar = new javax.swing.JLabel();
        btPesquisar = new javax.swing.JLabel();
        btSair = new javax.swing.JLabel();
        btAdministrador = new javax.swing.JLabel();
        btEntidade = new javax.swing.JLabel();
        btMonitor = new javax.swing.JLabel();
        btTurma = new javax.swing.JLabel();
        btAluno = new javax.swing.JLabel();
        btRelatorio = new javax.swing.JLabel();
        btAtividades = new javax.swing.JLabel();
        mascara = new javax.swing.JLabel();
        btSobre = new javax.swing.JLabel();
        administrador = new javax.swing.JButton();
        monitor = new javax.swing.JButton();
        aluno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SISLEXIS - Sistema de Auxílio a Dislexia");
        setMinimumSize(new java.awt.Dimension(1000, 700));

        areaDeTrabalho.setMinimumSize(new java.awt.Dimension(1000, 700));

        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btCadastrarInativo.png"))); // NOI18N
        btCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCadastrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCadastrarMouseExited(evt);
            }
        });
        areaDeTrabalho.add(btCadastrar);
        btCadastrar.setBounds(10, 30, 170, 40);

        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btPesquisarInativo.png"))); // NOI18N
        btPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPesquisarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btPesquisarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btPesquisarMouseExited(evt);
            }
        });
        areaDeTrabalho.add(btPesquisar);
        btPesquisar.setBounds(10, 80, 170, 40);

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

        btAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btOculto.png"))); // NOI18N
        btAdministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAdministradorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAdministradorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAdministradorMouseExited(evt);
            }
        });
        areaDeTrabalho.add(btAdministrador);
        btAdministrador.setBounds(245, 30, 120, 40);

        btEntidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btOculto.png"))); // NOI18N
        btEntidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEntidadeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btEntidadeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btEntidadeMouseExited(evt);
            }
        });
        areaDeTrabalho.add(btEntidade);
        btEntidade.setBounds(375, 30, 120, 40);

        btMonitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btOculto.png"))); // NOI18N
        btMonitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btMonitorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btMonitorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btMonitorMouseExited(evt);
            }
        });
        areaDeTrabalho.add(btMonitor);
        btMonitor.setBounds(505, 30, 120, 40);

        btTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btOculto.png"))); // NOI18N
        areaDeTrabalho.add(btTurma);
        btTurma.setBounds(635, 30, 120, 40);

        btAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btOculto.png"))); // NOI18N
        areaDeTrabalho.add(btAluno);
        btAluno.setBounds(765, 30, 120, 40);

        btRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btRelatorioInativo.png"))); // NOI18N
        btRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btRelatorioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btRelatorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btRelatorioMouseExited(evt);
            }
        });
        areaDeTrabalho.add(btRelatorio);
        btRelatorio.setBounds(10, 131, 170, 40);

        btAtividades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btAtividadesInativo.png"))); // NOI18N
        btAtividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAtividadesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAtividadesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAtividadesMouseExited(evt);
            }
        });
        areaDeTrabalho.add(btAtividades);
        btAtividades.setBounds(10, 177, 170, 40);

        mascara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/mascara.png"))); // NOI18N
        areaDeTrabalho.add(mascara);
        mascara.setBounds(180, 30, 360, 560);

        btSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo.png"))); // NOI18N
        btSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSobreMouseClicked(evt);
            }
        });
        areaDeTrabalho.add(btSobre);
        btSobre.setBounds(480, 490, 500, 189);

        administrador.setText("Administrador");
        administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administradorActionPerformed(evt);
            }
        });
        areaDeTrabalho.add(administrador);
        administrador.setBounds(20, 540, 150, 23);

        monitor.setText("Monitor");
        monitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monitorActionPerformed(evt);
            }
        });
        areaDeTrabalho.add(monitor);
        monitor.setBounds(20, 480, 150, 23);

        aluno.setText("Aluno");
        aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alunoActionPerformed(evt);
            }
        });
        areaDeTrabalho.add(aluno);
        aluno.setBounds(20, 510, 150, 23);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastrarMouseClicked
        // Linha 35
        exibePainel('c');
        // Limpa o botão 
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btPesquisarInativo.png")));
    }//GEN-LAST:event_btCadastrarMouseClicked

    private void btCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastrarMouseEntered
        if (mensagemAlerta == false) {
            btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btCadastrarAtivo.png")));
        }
    }//GEN-LAST:event_btCadastrarMouseEntered

    private void btCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastrarMouseExited
        if (opcaoCadastro == false) {
            btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btCadastrarInativo.png")));
        }
    }//GEN-LAST:event_btCadastrarMouseExited

    private void btAdministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAdministradorMouseClicked
        // Verifica se as opções de cadastros estão ativas / verifica se o administrador está logado
        if (opcaoCadastro == true && acessoAdm == true) {
            // Verificando se já existem mensagens ativas na área de trabalho
            if (limiteDeTelas == false && mensagemAlerta == false) {
                // Instanciando a tela de cadastro e adicionando a Área de Trabalho
                // LEGENDA a = administrador; e = entidade; m = monitor; t = turma; l = aluno 
                abreTelaCadastro('a');
            }
        }
    }//GEN-LAST:event_btAdministradorMouseClicked

    private void btAdministradorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAdministradorMouseEntered
        if (opcaoCadastro == true && acessoAdm == true && mensagemAlerta == false) {
            btAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btAdmAtivo.png"))); // NOI18N
        }
    }//GEN-LAST:event_btAdministradorMouseEntered

    private void btAdministradorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAdministradorMouseExited
        // TODO add your handling code here:
        if (opcaoCadastro == true && acessoAdm == true) {
            btAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btAdmInativo.png"))); // NOI18N
        }
    }//GEN-LAST:event_btAdministradorMouseExited

    private void btPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPesquisarMouseClicked
        exibePainel('p');
        // Limpa o botão 
        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btCadastrarInativo.png")));

    }//GEN-LAST:event_btPesquisarMouseClicked

    private void btPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPesquisarMouseEntered
        if (mensagemAlerta == false) {
            btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btPesquisarAtivo.png")));
        }
    }//GEN-LAST:event_btPesquisarMouseEntered

    private void btPesquisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPesquisarMouseExited
        if (opcaoPesquisa == false) {
            btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btPesquisarInativo.png")));
        }
    }//GEN-LAST:event_btPesquisarMouseExited

    private void btSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseEntered
        // TODO add your handling code here:
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btSairAtivo.png")));
    }//GEN-LAST:event_btSairMouseEntered

    private void btSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseExited
        // TODO add your handling code here:
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btSairInativo.png")));
    }//GEN-LAST:event_btSairMouseExited

    private void btSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseClicked
        if (mensagemAlerta == false) {
            MensagemSair sair = new MensagemSair();
            sair.setVisible(true);
            sair.setAlwaysOnTop(true);
            // Ocultando o painel de cadastros e resetando os ícones dos botões
            ocultaPainel('o');
            btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btCadastrarInativo.png")));
            btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btPesquisarInativo.png")));
            btRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btRelatorioInativo.png")));
            mascara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/mascara.png")));
            mensagemAlerta = (true);
            mensagemSair = (true);
        }
    }//GEN-LAST:event_btSairMouseClicked

    private void btEntidadeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEntidadeMouseEntered
        if (opcaoCadastro == true && acessoAdm == true && mensagemAlerta == false) {
            btEntidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btEntidadeAtivo.png")));
        }
    }//GEN-LAST:event_btEntidadeMouseEntered

    private void btEntidadeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEntidadeMouseExited
        if (opcaoCadastro == true && acessoAdm == true && mensagemAlerta == false) {
            btEntidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btEntidadeInativo.png")));
        }
    }//GEN-LAST:event_btEntidadeMouseExited

    private void btRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRelatorioMouseClicked
        ocultaPainel('o');
        // Resetando os botões
        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btCadastrarInativo.png")));
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btPesquisarInativo.png")));
        mascara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/mascaraRelatorio.png")));
    }//GEN-LAST:event_btRelatorioMouseClicked

    private void btRelatorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRelatorioMouseEntered
        if (mensagemAlerta == false) {
            btRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btRelatorioAtivo.png")));
        }
    }//GEN-LAST:event_btRelatorioMouseEntered

    private void btRelatorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRelatorioMouseExited
        btRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btRelatorioInativo.png")));
    }//GEN-LAST:event_btRelatorioMouseExited

    private void btAtividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtividadesMouseClicked
        if (mensagemAlerta == false) {
            // Inicia a atividade
            Base atividades = new Base();
            atividades.setVisible(true);

            // Fecha a jenela principal
            dispose();
        }
    }//GEN-LAST:event_btAtividadesMouseClicked

    private void btAtividadesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtividadesMouseEntered
        if (mensagemAlerta == false) {
            btAtividades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btAtividadesAtivo.png")));
        }
    }//GEN-LAST:event_btAtividadesMouseEntered

    private void btAtividadesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtividadesMouseExited
        btAtividades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btAtividadesInativo.png")));
    }//GEN-LAST:event_btAtividadesMouseExited

    private void btSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSobreMouseClicked
        // Exibindo informações do programa
        if (mensagemSair == false) {
            Sobre sobre = new Sobre();
            sobre.setVisible(true);
            sobre.setAlwaysOnTop(true);
        }
    }//GEN-LAST:event_btSobreMouseClicked

    private void monitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monitorActionPerformed
        acessoAdm = false;
        acessoMonitor = true;
        acessoAluno = false;
    }//GEN-LAST:event_monitorActionPerformed

    private void alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunoActionPerformed
        acessoAdm = false;
        acessoMonitor = false;
        acessoAluno = true;        // TODO add your handling code here:
    }//GEN-LAST:event_alunoActionPerformed

    private void administradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administradorActionPerformed
        acessoAdm = true;
        acessoMonitor = false;
        acessoAluno = false;
    }//GEN-LAST:event_administradorActionPerformed

    private void btMonitorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMonitorMouseClicked
        // Verifica se as opções de cadastros estão ativas / verifica se o administrador está logado
        if (opcaoCadastro == true && acessoAdm == true) {
            // Verificando se já existem mensagens ativas na área de trabalho
            if (limiteDeTelas == false && mensagemAlerta == false) {
                // Instanciando a tela de cadastro e adicionando a Área de Trabalho
                // LEGENDA a = administrador; e = entidade; m = monitor; t = turma; l = aluno 
                abreTelaCadastro('m');
            }
        }
    }//GEN-LAST:event_btMonitorMouseClicked

    private void btMonitorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMonitorMouseEntered
        if (opcaoCadastro == true && acessoAdm == true && mensagemAlerta == false) {
            btMonitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btMonitorAtivo.png")));
        }
    }//GEN-LAST:event_btMonitorMouseEntered

    private void btMonitorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMonitorMouseExited
        if (opcaoCadastro == true && acessoAdm == true && mensagemAlerta == false) {
            btMonitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btMonitorInativo.png")));
        }
    }//GEN-LAST:event_btMonitorMouseExited

    private void btEntidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEntidadeMouseClicked
        // Verifica se as opções de cadastros estão ativas / verifica se o administrador está logado
        if (opcaoCadastro == true && acessoAdm == true) {
            // Verificando se já existem mensagens ativas na área de trabalho
            if (limiteDeTelas == false && mensagemAlerta == false) {
                // Instanciando a tela de cadastro e adicionando a Área de Trabalho
                // LEGENDA a = administrador; e = entidade; m = monitor; t = turma; l = aluno 
                abreTelaCadastro('e');
            }
        }
    }//GEN-LAST:event_btEntidadeMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton administrador;
    private javax.swing.JButton aluno;
    private javax.swing.JDesktopPane areaDeTrabalho;
    private javax.swing.JLabel btAdministrador;
    private javax.swing.JLabel btAluno;
    private javax.swing.JLabel btAtividades;
    private javax.swing.JLabel btCadastrar;
    private javax.swing.JLabel btEntidade;
    private javax.swing.JLabel btMonitor;
    private javax.swing.JLabel btPesquisar;
    private javax.swing.JLabel btRelatorio;
    private javax.swing.JLabel btSair;
    private javax.swing.JLabel btSobre;
    private javax.swing.JLabel btTurma;
    private javax.swing.JLabel mascara;
    private javax.swing.JButton monitor;
    // End of variables declaration//GEN-END:variables
}
