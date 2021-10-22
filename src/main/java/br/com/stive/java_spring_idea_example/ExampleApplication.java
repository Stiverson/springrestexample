package br.com.stive.java_spring_idea_example;

import br.com.stive.java_spring_idea_example.pojo.Cidade;
import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
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
        String jsonPiracicaba = gson.toJson(piracicaba);
        System.out.println(jsonPiracicaba);

        Cidade jaguariuna = new Cidade();
        jaguariuna.setNome("Cidade Jaguariuna");
        jaguariuna.setNumeroHabitantes(80000);
        jaguariuna.setNumeroEdificios(200);
        jaguariuna.setNomePrefeito("Mikael Alimofótons");
        jaguariuna.setCidadeMetropolitana(true);

        String jsonJaguariuna = gson.toJson(jaguariuna);
        System.out.println(jsonJaguariuna);

        Cidade campinas = new Cidade();
        campinas.setNome("Cidade Campinas");
        campinas.setNumeroHabitantes(1200000);
        campinas.setNumeroEdificios(200000);
        campinas.setNomePrefeito("Dário Saad");
        campinas.setCidadeMetropolitana(true);

        String jsonCampinas = gson.toJson(campinas);
        System.out.println(jsonCampinas);




        //SpringApplication.run(ExampleApplication.class, args);
    }
}
