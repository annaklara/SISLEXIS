package Modelos;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    // Atributos
    private String nome;
    private Date dtNascimento;
    private boolean sexo; // (Masculno = true | 1) (Feminino = false | 0)
    private String funcao;
    private String nivelDeEnsino;
    private String login,senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public boolean getSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getNivelDeEnsino() {
        return nivelDeEnsino;
    }

    public void setNivelDeEnsino(String nivelDeEnsino) {
        this.nivelDeEnsino = nivelDeEnsino;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
