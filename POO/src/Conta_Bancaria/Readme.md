# Exercício 01: Simulação de Conta Bancária com Cheque Especial

##  Objetivo

Criar um sistema de conta bancária capaz de simular operações financeiras básicas e gerenciar o uso de um limite de **cheque especial**, incluindo a aplicação de taxas de juros.

---

##  Requisitos Funcionais

A conta bancária deve ser capaz de realizar as seguintes operações através de um menu interativo:

1.  **Consultar saldo**
2.  **Consultar cheque especial** (limite e valor usado)
3.  **Depositar** dinheiro
4.  **Sacar** dinheiro
5.  **Pagar um boleto**
6.  **Verificar** se a conta está usando o cheque especial.
7.  Ter uma opção para **Finalizar a execução** (`Sair`).

---

##  Regras de Implementação

O sistema deve seguir as seguintes regras para a gestão do cheque especial:

### 1. Limite Total

* O valor total disponível para transações é o **saldo da conta somado ao limite do cheque especial**.

### 2. Definição do Cheque Especial

O limite é definido no momento da **criação da conta**, baseado no **valor do primeiro depósito**:

* **R$ 500,00 ou Menos:** O cheque especial deve ser de **R$ 50,00** fixos.
* **Acima de R$ 500,00:** O cheque especial deve ser de **50%** do valor depositado na criação.

### 3. Taxa de Juros (Cobrança)

* Caso o limite de cheque especial seja usado (ou seja, o saldo fique negativo), a conta deve cobrar uma taxa de **20%** sobre o valor *utilizado* do cheque especial assim que o saldo voltar a ficar positivo ou em uma oportunidade de depósito/saque.