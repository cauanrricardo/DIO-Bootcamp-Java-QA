# Desafio de Validação e Confirmação de Senha

##  Objetivo

Em um cenário de testes de **segurança** de uma interface bancária, o objetivo é criar uma rotina simples para verificar se a senha fornecida pelo usuário corresponde exatamente à sua confirmação.

##  Cenário

Este é um requisito de segurança básico: garantir que o usuário digitou a senha corretamente e evitar erros de cadastro que resultariam em bloqueios de acesso.

---

##  Entrada

A rotina deve receber **duas strings** para comparação:

1.  `senhaDigitada`
2.  `senhaConfirmada`

---

##  Saída

O resultado da rotina deve refletir o status da comparação das senhas:

| Condição | Retorno |
| :--- | :--- |
| **Se as senhas forem idênticas** (case-sensitive). | `Senha valida` |
| **Caso contrário** (se houver qualquer diferença). | `Senhas nao conferem` |

---

## 🧪 Exemplos de Teste

| Entrada (`senhaDigitada`, `senhaConfirmada`) | Saída Esperada |
| :--- | :--- |
| `abc123`, `abc123` | `Senha valida` |
| `123456`, `1234567` | `Senhas nao conferem` |
| `senhaSegura8*`, `senhaSegura8*` | `Senha valida` |