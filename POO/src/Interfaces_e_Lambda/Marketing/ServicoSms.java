// File: POO/src/Interfaces_e_Lambda/Marketing/ServicoSms.java
package Interfaces_e_Lambda.Marketing;

/**
 * Implementação de {@link ServicoMensagem} que envia a mensagem por SMS.
 *
 * Esta classe demonstra o envio de SMS imprimindo a mensagem no console.
 *
 * @author cauanricardoribeiro
 * @version
 */
public class ServicoSms implements ServicoMensagem {
    /**
     * Envia a mensagem por SMS.
     */
    @Override
    public void enviarMensagem() {
        System.out.println("SMS: " + ServicoMensagem.mensagem);
    }
}
