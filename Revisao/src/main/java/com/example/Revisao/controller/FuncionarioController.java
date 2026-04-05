package com.example.Revisao.controller;

import com.example.Revisao.model.FuncionarioModel;
import com.example.Revisao.repository.FuncionarioRepositorty; // Dica: verifique a grafia de 'Repository'
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller responsável por gerenciar as operações de funcionários via API REST.
 */
@RestController
@RequestMapping("/funcionarios") // Define a rota principal para acessar este recurso
public class FuncionarioController {

    // Injeção automática da interface de persistência (Camada de Dados)
    @Autowired
    private FuncionarioRepositorty repositorty;

    /**
     * Retorna a lista completa de funcionários cadastrados.
     * Método HTTP: GET
     */
    @GetMapping
    public List<FuncionarioModel> listarTodos() {
        // Invoca o método padrão do JpaRepository para buscar todos os registros
        return repositorty.findAll();
    }

    /**
     * Cria um novo registro de funcionário no banco de dados.
     * Método HTTP: POST
     * @param funcionario Dados do funcionário enviados no corpo da requisição (JSON)
     */
    @PostMapping
    public ResponseEntity<FuncionarioModel> salvar(@RequestBody FuncionarioModel funcionario) {
        // Persiste os dados recebidos através do repositório
        repositorty.save(funcionario);

        // Retorna o objeto criado e o status HTTP 201 Created (Boas práticas REST)
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionario);
    }
}