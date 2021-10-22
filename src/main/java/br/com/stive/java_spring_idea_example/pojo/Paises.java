package br.com.stive.java_spring_idea_example.pojo;

import java.util.ArrayList;
import java.util.List;

public class Paises {
    private String nome;
    private String presidente;
    private String capital;
    private int posicaoMundial;
    private List<Estado> listaEstados = new ArrayList<Estado>();

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPosicaoMundial() {
        return posicaoMundial;
    }

    public void setPosicaoMundial(int posicaoMundial) {
        this.posicaoMundial = posicaoMundial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Estado> getListaEstados() {
        return listaEstados;
    }

    public void setListaEstados(List<Estado> listaEstados) {
        this.listaEstados = listaEstados;
    }


}
