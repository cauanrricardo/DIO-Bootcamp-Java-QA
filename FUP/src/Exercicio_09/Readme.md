# Desafio de Validação de Cadastro de Cliente

## Objetivo

Como parte do time de **Quality Assurance (QA)**, o objetivo deste desafio é criar uma rotina ou função que verifique se os campos obrigatórios de um cadastro de cliente em um sistema bancário foram devidamente preenchidos.

## 💻 Cenário

Você está testando um sistema bancário que realiza cadastros de clientes e precisa garantir a integridade dos dados.

---

##  Entrada

A rotina receberá **três valores** do tipo `String`, representando os seguintes campos:

1.  **Nome**
2.  **CPF**
3.  **Email**

**Observação:** Os campos podem ser fornecidos vazios (`""`).

---

##  Saída

O sistema deve analisar os três campos e produzir uma das seguintes saídas:

| Condição | Retorno |
| :--- | :--- |
| **Se *algum* campo estiver vazio** (`""`). | `Cadastro incompleto` |
| **Se *todos* os campos estiverem preenchidos.** | `Cadastro validado com sucesso` |

---

## 🧪 Exemplos de Teste

| Entrada (Nome, CPF, Email) | Saída Esperada |
| :--- | :--- |
| `Calos`, `12345678900`, `c@email.com` | `Cadastro validado com sucesso` |
| `""`, `987654322`, `fab@email.com` | `Cadastro incompleto` |
| `Ana`, `""`, `ana@email.com` | `Cadastro incompleto` |