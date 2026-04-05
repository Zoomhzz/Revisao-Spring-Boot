package com.example.Revisao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// @Entity avisa ao Hibernate que esta classe deve ser mapeada como uma tabela no banco de dados
@Entity
public class FuncionarioModel {

    // @Id define a chave primária (Primary Key) da tabela
    @Id
    // IDENTITY indica que o banco de dados cuidará do auto-incremento do ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private int idade;

    // Construtor padrão sem argumentos (exigência do JPA/Hibernate)
    public FuncionarioModel() {
    }

    // Construtor completo para facilitar a criação de novos objetos
    public FuncionarioModel(Long id, String nome, String email, String cpf, String telefone, int idade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
    }

    // Métodos Getter e Setter para garantir o encapsulamento dos dados

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}