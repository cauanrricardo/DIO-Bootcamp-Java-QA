// File: POO/src/Interfaces_e_Lambda/Marketing/ServicoRedesSociais.java
package Interfaces_e_Lambda.Marketing;

/**
 * Implementação de {@link ServicoMensagem} que publica a mensagem nas redes sociais.
 *
 * Esta classe apenas demonstra a publicação imprimindo a mensagem no console.
 *
 * @author cauanricardoribeiro
 * @version 1.0
 */
public class ServicoRedesSociais implements ServicoMensagem {
    /**
     * Publica a mensagem nas redes sociais.
     */
    @Override
    public void enviarMensagem() {
        System.out.println("Redes Sociais: " + ServicoMensagem.mensagem);
    }
}
