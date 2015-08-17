package Modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;
    private String turno;
    private int horarioEntrada, horarioSaida;
    private String serie;
    private String monitor;
    private int qtdVagas;

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

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getHorarioEntrada() {
        return horarioEntrada;
    }

    public void setHorarioEntrada(int horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public int getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(int horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public int getQtdVagas() {
        return qtdVagas;
    }

    public void setQtdVagas(int qtdVagas) {
        this.qtdVagas = qtdVagas;
    }

}
