package br.com.stive.java_spring_idea_example.pojo;

import java.util.ArrayList;
import java.util.List;

public class Estado {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;

    private List<Cidade> listaCidades = new ArrayList<Cidade>();

    public List<Cidade> getListaCidades() {
        return listaCidades;
    }

    public void setListaCidades(List<Cidade> listaCidades) {
        this.listaCidades = listaCidades;
    }
}
