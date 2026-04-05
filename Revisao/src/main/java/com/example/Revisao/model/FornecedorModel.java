package com.example.Revisao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Indica que esta classe é uma entidade do JPA e que uma tabela será criada no banco com este nome
@Entity
public class FornecedorModel {

    // Define a chave primária da tabela
    @Id
    // Define que o ID será gerado automaticamente pelo banco de dados (Auto-incremento)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;
    private String cnpj;

    // Construtor Padrão: Essencial para que o Hibernate consiga instanciar o objeto ao buscar no banco
    public FornecedorModel() {
    }

    // Construtor com Argumentos: Útil para criar o objeto manualmente no código ou em testes
    public FornecedorModel(Long id, String nome, String email, String telefone, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cnpj = cnpj;
    }

    // Métodos Getters e Setters: Permitem o acesso e modificação dos atributos privados (Encapsulamento)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}