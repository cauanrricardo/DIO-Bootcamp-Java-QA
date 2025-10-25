package Interfaces_e_Lambda.Marketing;

/**
 * Interface que representa um servico de mensagem.
 *
 * Contem uma mnsgaem padrao
 *
 * @author cauanricardoribeiro
 * @version 1.0
 */
public interface ServicoMensagem {
    /**
     * Mensagem padrão que será enviada pelas implementações.
     */
    String mensagem = "Ola, passando pra avisar que estaremos funcionando no feriado.";

    /**
     * Envia a mensagem definida em {@link #mensagem}.
     */
    void enviarMensagem();

}
