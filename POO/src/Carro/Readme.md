#  Projeto de Simulação de Controle de Carro

Este projeto tem como objetivo simular o controle básico de um carro, implementando funcionalidades como ligar, desligar, acelerar, mudar de marcha e virar, respeitando uma série de regras de simulação.

## ⚙️ Funcionalidades e Regras

A classe `Carro` será implementada com as seguintes funcionalidades e restrições:

### Funções Principais

1.  **Ligar o carro**
2.  **Desligar o carro**
3.  **Acelerar** (Aumenta a velocidade em $1\text{km/h}$)
4.  **Diminuir velocidade** (Diminui a velocidade em $1\text{km/h}$)
5.  **Virar para esquerda/direita**
6.  **Verificar velocidade**
7.  **Trocar a marcha** (Inclui passar para a marcha superior ou inferior)

---

### Regras de Implementação

#### Estado Inicial

* Quando o carro é criado, ele deve começar **desligado**, em **ponto morto** (marcha 0) e com sua **velocidade em $0\text{km/h}$**.

#### Estado do Carro

* O carro **desligado não pode realizar nenhuma função** (acelerar, virar, trocar marcha, etc.).

#### Velocidade

* **Aceleração:** Incrementa $1\text{km/h}$ na velocidade. A velocidade máxima é de **$120\text{km/h}$**.
* **Desaceleração:** Decrementa $1\text{km/h}$ na velocidade. A velocidade mínima é de **$0\text{km/h}$**.

#### Desligar o Carro

* O carro só poderá ser desligado se estiver em **ponto morto (marcha 0)** e sua **velocidade em $0\text{km/h}$**.

#### Virar

* O carro só pode virar (esquerda/direita) se sua velocidade for de **no mínimo $1\text{km/h}$** e **no máximo $40\text{km/h}$**.

#### Marchas e Limites de Velocidade

* O carro possui **6 marchas** (mais o ponto morto, que é a marcha 0).
* **Não é permitido pular uma marcha** (a troca deve ser sequencial, por exemplo, de 1ª para 2ª ou de 3ª para 2ª).
* A velocidade do carro deve respeitar os seguintes limites para cada marcha:

| Marcha (M) | Posição | Limite Mínimo | Limite Máximo |
| :--------: | :-----: | :-----------: | :-----------: |
| **0** | Ponto Morto | $0\text{km/h}$ | $0\text{km/h}$ |
| **1** | 1ª Marcha | $0\text{km/h}$ | $20\text{km/h}$ |
| **2** | 2ª Marcha | $21\text{km/h}$ | $40\text{km/h}$ |
| **3** | 3ª Marcha | $41\text{km/h}$ | $60\text{km/h}$ |
| **4** | 4ª Marcha | $61\text{km/h}$ | $80\text{km/h}$ |
| **5** | 5ª Marcha | $81\text{km/h}$ | $100\text{km/h}$ |
| **6** | 6ª Marcha | $101\text{km/h}$ | $120\text{km/h}$ |

> **Nota:** Se o carro acelerar para uma velocidade que excede o limite da marcha atual (ex: $21\text{km/h}$ na 1ª marcha), ele deve emitir um aviso e/ou impedir a aceleração, forçando a troca de marcha. A exceção é a troca de marcha de subida ($M \rightarrow M+1$), que só deve ser possível quando o carro já atingiu a velocidade mínima da marcha superior.

---
