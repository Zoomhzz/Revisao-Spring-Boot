package com.example.Revisao.controller;

import com.example.Revisao.model.FornecedorModel;
import com.example.Revisao.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Define que esta classe é um controlador REST, lidando com requisições e respostas JSON
@RestController
// Define a rota base para este controlador. Todas as requisições para "/fornecedores" virão para cá
@RequestMapping("/fornecedores")
public class FornecedoresController {

    // Injeção de Dependência: O Spring cria e gerencia a instância do repository automaticamente
    @Autowired
    private FornecedorRepository repository;

    /**
     * Endpoint para listar todos os fornecedores.
     * Mapeia requisições HTTP GET.
     * @return Uma lista de objetos FornecedorModel.
     */
    @GetMapping
    public List<FornecedorModel> listarTodos() {
        // O método findAll() é fornecido pelo JpaRepository para buscar todos os registros no banco
        return repository.findAll();
    }

    /**
     * Endpoint para salvar um novo fornecedor.
     * Mapeia requisições HTTP POST.
     * @param fornecedor Objeto enviado no corpo (Body) da requisição.
     * @return O objeto salvo com o status HTTP 201 (Created).
     */
    @PostMapping
    public ResponseEntity<FornecedorModel> salvar(@RequestBody FornecedorModel fornecedor) {
        // Salva o objeto no banco de dados
        repository.save(fornecedor);

        // Retorna o objeto salvo dentro de um ResponseEntity para customizar o status code para 201
        return ResponseEntity.status(HttpStatus.CREATED).body(fornecedor);
    }
}