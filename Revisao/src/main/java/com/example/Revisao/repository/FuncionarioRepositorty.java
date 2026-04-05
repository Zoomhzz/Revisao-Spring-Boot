package com.example.Revisao.repository;

import com.example.Revisao.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface que utiliza o Spring Data JPA para abstrair a manipulação de dados.
 * Não é necessário implementar os métodos manualmente; o Spring cria a lógica em tempo de execução.
 */
public interface FuncionarioRepositorty extends JpaRepository<FuncionarioModel, Long> {

    /* Ao estender JpaRepository, você ganha acesso a:
       1. save(FuncionarioModel) -> Para criar ou atualizar.
       2. delete(FuncionarioModel) -> Para remover.
       3. findAll() -> Para listar todos.
       4. findById(Long) -> Para buscar um funcionário específico pela sua Chave Primária.
    */
}