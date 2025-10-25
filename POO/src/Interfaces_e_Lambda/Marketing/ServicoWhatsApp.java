// File: POO/src/Interfaces_e_Lambda/Marketing/ServicoWhatsApp.java
package Interfaces_e_Lambda.Marketing;

/**
 * Implementação de {@link ServicoMensagem} que envia a mensagem via WhatsApp.
 *
 * Esta classe demonstra o envio por WhatsApp imprimindo a mensagem no console.
 *
 * @author cauanricardoribeiro
 * @version  1.0
 */
public class ServicoWhatsApp implements ServicoMensagem {
    /**
     * Envia a mensagem pelo WhatsApp.
     */
    @Override
    public void enviarMensagem() {
        System.out.println("WhatsApp: " + ServicoMensagem.mensagem);
    }
}
