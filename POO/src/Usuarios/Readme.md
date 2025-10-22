# Sistema de Usuários - Herança em Java

## Descrição do Projeto
Este projeto foi desenvolvido com o objetivo de praticar os conceitos de **Programação Orientada a Objetos (POO)** em Java, com foco em **herança**, **encapsulamento** e **polimorfismo**.

O sistema simula diferentes tipos de usuários (Gerente, Vendedor e Atendente) em um ambiente corporativo, demonstrando como cada um possui comportamentos e responsabilidades específicas herdadas de uma classe base (`Usuario`).

---

## Estrutura das Classes

### Classe `Usuario`
Classe base que representa um usuário genérico do sistema.  
Contém atributos e métodos comuns a todos os tipos de usuários, como:
- `nome`, `email`, `senha`, `administrador`, `logado`
- Métodos: `realizarLogin()`, `realizarLogoff()`, `alterarDados()`, `alterarSenha()`

### Classe `Gerente`
Subclasse de `Usuario`.  
Representa o gerente do sistema, com permissões administrativas.  
Métodos específicos:
- `gerarRelatorioFinanceiro()`
- `consultarVendas()`

### Classe `Vendedor`
Subclasse de `Usuario`.  
Responsável por registrar e consultar vendas individuais.  
Métodos específicos:
- `realizarVenda()`
- `consultarVendas()`

### Classe `Atendente`
Subclasse de `Usuario`.  
Responsável pelo controle do caixa e recebimento de pagamentos.  
Métodos específicos:
- `receberPagamento(double valor)`
- `fecharCaixa()`

---

## Funcionamento do Programa

A classe `Main` cria e testa os objetos das classes acima, demonstrando o funcionamento dos métodos herdados e específicos de cada tipo de usuário.

Durante a execução, o programa:
1. Cria um `Gerente`, um `Vendedor` e um `Atendente`.
2. Realiza o login de cada usuário.
3. Executa as ações específicas de cada um.
4. Finaliza com o logoff do gerente.

---

