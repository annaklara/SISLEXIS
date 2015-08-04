
package Classes;

public class Turma {
    
    private int id;
    private String nome;
    private String turno;
    private int horarioEntrada, horarioSaida;
    private String serie;
    private String monitor;
    private int qtdVagas;
    
    public Turma (String nome, String turno, int horarioEntrada, int horarioSaida, String serie, String monitor, int qtdVagas){
        id = id + 1;
        this.nome = nome;
        this.turno = turno;
        this.horarioEntrada= horarioEntrada;
        this.horarioSaida = horarioSaida;
        this.serie = serie;
        this.monitor = monitor;
        this.qtdVagas = qtdVagas;
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
