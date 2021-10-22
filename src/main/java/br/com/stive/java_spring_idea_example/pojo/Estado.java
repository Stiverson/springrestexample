package br.com.stive.java_spring_idea_example.pojo;

import java.util.ArrayList;
import java.util.List;

public class Estado {
    private String nome;
    private String prefeito;
    private String governador;
    private List<Cidade> listaCidades = new ArrayList<Cidade>();

    public String getGovernador() {
        return governador;
    }

    public void setGovernador(String governador) {
        this.governador = governador;
    }

    public String getPrefeito() {
        return prefeito;
    }

    public void setPrefeito(String prefeito) {
        this.prefeito = prefeito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cidade> getListaCidades() {
        return listaCidades;
    }

    public void setListaCidades(List<Cidade> listaCidades) {
        this.listaCidades = listaCidades;
    }
}
