package Interfaces_e_Lambda.Marketing;

/**
 * Implementação de {@link ServicoMensagem} que envia a mensagem por e-mail.
 *
 * Esta classe apenas demonstra o envio imprimindo a mensagem no console.
 *
 * @author cauanricardoribeiro
 * @version 1.0*/
public class ServicoEmail implements  ServicoMensagem{
    /**
     * Envia a mensagem por e-mail.
     */
    @Override
    public void enviarMensagem() {
        System.out.println("Email: " + ServicoMensagem.mensagem);
    }
}
