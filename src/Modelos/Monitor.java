
package Modelos;

import java.util.Date;

public class Monitor extends Pessoa{
    
    private String funcao;

    public Monitor(String nome, Date dataNascimento, char sexo, String login, String senha) {
        super(nome, dataNascimento, sexo, login, senha);
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
}
