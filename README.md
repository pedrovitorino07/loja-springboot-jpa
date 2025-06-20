# 📚 Loja Springboot JPA

Este projeto é uma API REST desenvolvida com **Spring Boot**, utilizando **Spring Data JPA** para persistência de dados em banco relacional. Foi criado como parte de um workshop com o objetivo de aprender os fundamentos do JPA, relacionamentos entre entidades, e construção de uma estrutura de backend simples para gerenciamento de pedidos de usuários.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database (banco de dados em memória)
- Maven
- JPA / Hibernate

---

## 🗃️ Estrutura do Projeto

O projeto possui as seguintes entidades principais:

- **User**: Representa um usuário do sistema.
- **Order**: Representa um pedido realizado por um usuário.
- **Category**: Representa categorias de produtos.
- **Product**: Representa os produtos disponíveis.
- **OrderItem**: Representa os itens de um pedido.
- **Payment**: Representa o pagamento associado a um pedido.

### 🧩 Relacionamentos

- Um `User` pode ter muitos `Orders`.
- Um `Order` possui vários `OrderItems`.
- Um `Product` pode estar em várias `Categories`.
- Um `Order` pode ter um `Payment` associado.

---

## 🔄 Executando o Projeto

### Pré-requisitos

- Java 17 instalado
- Maven instalado (ou suporte via IDE como IntelliJ ou Eclipse)

### Passo a passo

1. Clone o repositório:

```bash
git clone https://github.com/pedrovitorino07/workshop-springboot-jpa.git
