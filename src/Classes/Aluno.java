package Classes;

import java.util.Date;

public class Aluno extends Pessoa {

    private String mae, pae, responsavel;
    private String endereco, bairro, cidade;
    private int cep;
    private String email;

    // Reescrita do construtor principal de Pessoas + atributo mae
    public Aluno(String nome, Date dataNascimento, char sexo, String login, String senha, String mae) {
        super(nome, dataNascimento, sexo, login, senha);
        this.mae = mae;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPae() {
        return pae;
    }

    public void setPae(String pae) {
        this.pae = pae;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
