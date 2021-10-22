package br.com.stive.java_spring_idea_example;

import br.com.stive.java_spring_idea_example.pojo.Cidade;
import br.com.stive.java_spring_idea_example.pojo.Estado;
import br.com.stive.java_spring_idea_example.pojo.Paises;
import com.google.gson.Gson;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class ExampleApplication {
    public static void main(String[] args) {

        Cidade piracicaba = new Cidade();
        piracicaba.setNome("Piracicaba Cidade da Pamonha");
        piracicaba.setNumeroHabitantes(5655841);
        piracicaba.setNumeroEdificios(868);
        piracicaba.setNomePrefeito("Luciano Almeida");
        piracicaba.setCidadeMetropolitana(false);

        Gson gson = new Gson();
        /*String jsonPiracicaba = gson.toJson(piracicaba);
        System.out.println(jsonPiracicaba);*/

        Cidade jaguariuna = new Cidade();
        jaguariuna.setNome("Cidade Jaguariuna");
        jaguariuna.setNumeroHabitantes(80000);
        jaguariuna.setNumeroEdificios(200);
        jaguariuna.setNomePrefeito("Mikael Alimofótons");
        jaguariuna.setCidadeMetropolitana(true);

        /*String jsonJaguariuna = gson.toJson(jaguariuna);
        System.out.println(jsonJaguariuna);*/

        Cidade campinas = new Cidade();
        campinas.setNome("Cidade Campinas");
        campinas.setNumeroHabitantes(1200000);
        campinas.setNumeroEdificios(200000);
        campinas.setNomePrefeito("Dário Saad");
        campinas.setCidadeMetropolitana(true);

        /*String jsonCampinas = gson.toJson(campinas);
        System.out.println(jsonCampinas);*/

        Cidade denver = new Cidade();
        denver.setNome("Denver");
        denver.setNomePrefeito("Michael Hancock");
        denver.setNumeroHabitantes(71500000);
        denver.setNumeroEdificios(360000);
        denver.setCidadeMetropolitana(true);

        /*String jsonDenver = gson.toJson(denver);
        System.out.println(jsonDenver);*/


        Estado saoPaulo = new Estado();
        saoPaulo.setNome("São Paulo");
        saoPaulo.setPrefeito("Ricardo Nunes");
        saoPaulo.setGovernador("João Dória");
        saoPaulo.getListaCidades().add(piracicaba);
        saoPaulo.getListaCidades().add(campinas);
        saoPaulo.getListaCidades().add(jaguariuna);

        /*String jsonSaoPaulo = gson.toJson(saoPaulo);
        System.out.println(jsonSaoPaulo);*/

        Estado colorado = new Estado();
        colorado.setNome("Colorado");
        colorado.setPrefeito("John Hickenlooper");
        colorado.setGovernador("Jared Polis");
        colorado.getListaCidades().add(denver);


        /*String jsonColorado = gson.toJson(colorado);
        System.out.println(jsonColorado);*/

        Paises brasil = new Paises();
        brasil.setNome("Brasil");
        brasil.setPresidente("Jair Messias Bolsonagem");
        brasil.setCapital("Brasília");
        brasil.setPosicaoMundial(24);
        brasil.getListaEstados().add(saoPaulo);
        String jsonBrasil = gson.toJson(brasil);
        System.out.println(jsonBrasil);

        Paises eua = new Paises();
        eua.setNome("Estados Unidos");
        eua.setPresidente("Jon Biden");
        eua.setCapital("Whashington");
        eua.setPosicaoMundial(1);
        eua.getListaEstados().add(colorado);
        String jsonEua = gson.toJson(eua);
        System.out.println(jsonEua);

        //SpringApplication.run(ExampleApplication.class, args);
    }
}
