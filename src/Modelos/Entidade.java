
package Modelos;

public class Entidade {
    private int id;
    private String nome;
    private String endereco;
    private int cnpj;
    private int qtdSala;
    
    public Entidade (String nome, String endereco, int cnpj, int qtdSala){
    id = id ++;
    this.nome = nome;
    this.endereco = endereco;
    this.cnpj = cnpj;
    this.qtdSala = qtdSala;
    
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getQtdSala() {
        return qtdSala;
    }

    public void setQtdSala(int qtdSala) {
        this.qtdSala = qtdSala;
    }
}
