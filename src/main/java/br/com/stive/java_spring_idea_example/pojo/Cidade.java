package br.com.stive.java_spring_idea_example.pojo;

public class Cidade {
    private String nome;
    private String nomePrefeito;
    private int numeroHabitantes;
    private int numeroEdificios;
    private boolean cidadeMetropolitana;

    public boolean isCidadeMetropolitana() {
        return cidadeMetropolitana;
    }

    public void setCidadeMetropolitana(boolean cidadeMetropolitana) {
        this.cidadeMetropolitana = cidadeMetropolitana;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public int getNumeroEdificios() {
        return numeroEdificios;
    }

    public void setNumeroEdificios(int numeroEdificios) {
        this.numeroEdificios = numeroEdificios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomePrefeito() {
        return nomePrefeito;
    }

    public void setNomePrefeito(String nomePrefeito) {
        this.nomePrefeito = nomePrefeito;
    }
}
