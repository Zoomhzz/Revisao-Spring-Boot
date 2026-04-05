# 🏢 API de Gestão de Fornecedores e Funcionários

Este repositório contém uma API REST desenvolvida em **Java** com o framework **Spring Boot**. O objetivo principal é fornecer uma interface para o gerenciamento de dados corporativos, focando em simplicidade, organização de código e persistência eficiente.

## 🚀 Tecnologias Utilizadas
* **Java 17+**
* **Spring Boot 3.x**
* **Spring Data JPA**: Para abstração da camada de dados.
* **Web Starter**: Para criação de endpoints REST.
* **Maven**: Gerenciador de dependências.

## 📂 Estrutura do Projeto
A aplicação segue o padrão de camadas para garantir a separação de responsabilidades:
* **Model**: Representação das entidades do banco de dados.
* **Repository**: Interfaces que herdam de `JpaRepository`, facilitando as operações de CRUD.
* **Controller**: Camada que recebe as requisições HTTP e retorna as respostas adequadas.

## 📡 Endpoints Principais

### Fornecedores (`/fornecedores`)
| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| **GET** | `/fornecedores` | Retorna a lista de todos os fornecedores. |
| **POST** | `/fornecedores` | Cadastra um novo fornecedor. |

### Funcionários (`/funcionarios`)
| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| **GET** | `/funcionarios` | Retorna a lista de todos os funcionários. |
| **POST** | `/funcionarios` | Cadastra um novo funcionário. |
