package Modelos;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Monitor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // Atributos
    private int id;
    private String nome;
    private Date dtNascimento;
    private boolean sexo; // (Masculno = true | 1) (Feminino = false | 0)
    private String nivelDeEnsino;
    private String login, senha;
    private String funcao;
}
