package br.com.stive.java_spring_idea_example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ExampleController
 *
 * @author stive
 *
 */
@RestController
@RequestMapping("/api/aprendizes")
public class AprendizesController {

    @GetMapping("/filmes")
    public ResponseEntity<String> getFilmes(@RequestParam(name = "nome_pessoa") String nomePessoa) {
        return ResponseEntity.ok("Nome da pessoa -> "+ nomePessoa);
    }

}