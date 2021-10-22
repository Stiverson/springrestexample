package br.com.stive.java_spring_idea_example.pojo;

import java.util.ArrayList;
import java.util.List;

public class Paises {
    public List<Estado> getListaPaises() {
        return listaPaises;
    }

    public void setListaPaises(List<Estado> listaPaises) {
        this.listaPaises = listaPaises;
    }

    private List<Estado> listaPaises = new ArrayList<Estado>();
}
