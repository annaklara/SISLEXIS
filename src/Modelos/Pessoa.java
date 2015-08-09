package Modelos;

import java.util.Date;

public class Pessoa {

    // Atributos
    protected static int id;
    protected String nome;
    protected Date dtNascimento;
    protected char sexo;
    protected String nivelDeEnsino;
    protected String login, senha;

    //Construtor Principal para atributos obrigatórios
    public Pessoa(String nome, Date dataNascimento, char sexo, String login, String senha) {
        id = id + 1;
        this.nome = nome;
        this.dtNascimento = dataNascimento;
        this.sexo = sexo;
        this.login = login;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
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
