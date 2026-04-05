package com.example.Revisao.repository;

import com.example.Revisao.model.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * A interface Repository é a camada de acesso aos dados (DAO).
 * Ela faz a ponte entre o seu código Java e o banco de dados.
 */
// @Repository -> Opcional, mas indica que esta classe gerencia o acesso a dados
public interface FornecedorRepository extends JpaRepository<FornecedorModel, Long> {

    /**
     * Ao estender JpaRepository, você herda diversos métodos prontos:
     * - save(): Insere ou atualiza um registro.
     * - findAll(): Lista todos os registros.
     * - findById(): Busca por ID.
     * - delete(): Remove um registro.
     * * FornecedorModel: Define qual entidade este repositório gerencia.
     * Long: Define o tipo da chave primária (@Id) da entidade.
     */
}