# 📚 Books API

Uma API RESTful desenvolvida em Java com Spring Boot para o gerenciamento de um acervo de livros. O projeto permite realizar operações completas de CRUD (Create, Read, Update, Delete) integradas a um banco de dados relacional.

---

## 🛠️ Tecnologias Utilizadas

* **Java 17** (ou versão utilizada no projeto)
* **Spring Boot**
* **Spring Data JPA** (Persistência e mapeamento ORM)
* **H2 Database** / **PostgreSQL** (Banco de dados)
* **Maven** (Gerenciador de dependências)

---

## 🚀 Funcionalidades

A API disponibiliza os seguintes endpoints sob o recurso `/books`:

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| `GET` | `/books` | Retorna a lista de todos os livros cadastrados |
| `GET` | `/books/{id}` | Busca os detalhes de um livro específico pelo ID |
| `POST` | `/books` | Cadastra um novo livro no sistema |
| `PUT` | `/books/{id}` | Atualiza as informações de um livro existente pelo ID |
| `DELETE` | `/books/{id}` | Remove um livro do acervo pelo ID |

---

## 💻 Estrutura do Projeto

```text
src/main/java/com/jezielmonteiro/books/
├── controller/
│   └── BookController.java      # Camada de exposição das rotas HTTP
├── model/
│   └── Book.java                # Entidade que representa o livro
└── repository/
    └── BookRepository.java      # Interface de acesso ao banco de dados (Spring Data JPA)