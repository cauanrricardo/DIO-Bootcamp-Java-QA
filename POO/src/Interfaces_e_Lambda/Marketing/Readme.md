# Marketing Services (POO)

Resumo
-----
Módulo Java com interfaces e implementações simples para envio de mensagens de marketing (Email, SMS, WhatsApp, Redes Sociais). Código demonstrativo que imprime a mensagem padrão no console.

Estrutura
--------
- `POO/src/Interfaces_e_Lambda/Marketing`
    - `ServicoMensagem` (interface)
    - `ServicoEmail`, `ServicoSms`, `ServicoWhatsApp`, `ServicoRedesSociais` (implementações)

Principais classes
------------------
- `ServicoMensagem` — define a mensagem padrão e o contrato `enviarMensagem()`.
- `ServicoEmail`, `ServicoSms`, `ServicoWhatsApp`, `ServicoRedesSociais` — implementam `ServicoMensagem` e simulam o envio imprimindo no console.

Como compilar
-------------
1. Posicione-se na raiz do projeto.
2. Compile os fontes:
    - `javac -d out POO/src/Interfaces_e_Lambda/Marketing/*.java`
3. (Se houver uma classe `main`) execute com:
    - `java -cp out fully.qualified.MainClass`

Gerar a documentação Javadoc
---------------------------
A documentação foi escrita em Javadoc para as classes do pacote. Para gerar a Javadoc localmente:
- `javadoc -d docs POO/src/Interfaces_e_Lambda/Marketing/*.java`

Observações
----------
- Código de exemplo; as implementações apenas simulam envio imprimindo `ServicoMensagem.mensagem`.
- Javadoc foi adicionada aos arquivos do pacote `POO/src/Interfaces_e_Lambda/Marketing`.

Metadados
---------
- Autor: cauanricardoribeiro
- Versão: 1.0
