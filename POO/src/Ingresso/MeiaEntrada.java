package Ingresso;

/**
 * Representa um ingresso do tipo meia-entrada, que possui valor reduzido pela metade.
 *
 * @author cauanricardoribeiro
 * @version 1.0
 */
public class MeiaEntrada extends Ingresso {

    /**
     * Cria um ingresso de meia-entrada com as informações do filme.
     *
     * @param valorIngresso valor original do ingresso
     * @param nomeFilme nome do filme exibido
     * @param dublado indica se o filme é dublado (true) ou legendado (false)
     */
    public MeiaEntrada(double valorIngresso, String nomeFilme, boolean dublado) {
        super(valorIngresso, nomeFilme, dublado);
    }

    /**
     * Calcula o valor real do ingresso aplicando o desconto de meia-entrada.
     *
     * @return metade do valor do ingresso original
     */
    @Override
    public double calcularValorReal() {
        return getValorIngresso() / 2;
    }

    /**
     * Exibe as informações do ingresso de meia-entrada no console.
     */
    @Override
    public void exibirInfo() {
        System.out.println("========= MEIA ENTRADA =========");
        System.out.println("Valor do ingresso R$: " + getValorIngresso());
        System.out.println("Nome do filme: " + getNomeFilme());
        System.out.println("Tipo: " + (isDublado() ? "Dublado" : "Legendado"));
    }
}
