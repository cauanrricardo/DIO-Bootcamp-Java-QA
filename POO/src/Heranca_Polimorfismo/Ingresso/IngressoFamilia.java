package Heranca_Polimorfismo.Ingresso;

/**
 * Representa um ingresso do tipo familiar, que permite a compra para várias pessoas
 * e aplica um desconto quando há mais de três integrantes.
 *
 * @author cauanricardoribeiro
 * @version 1.0
 */
public class IngressoFamilia extends Ingresso {
    private int quantidadePessoas;

    /**
     * Cria um ingresso familiar com as informações do filme e o número de pessoas.
     *
     * @param valorIngresso valor unitário do ingresso
     * @param nomeFilme nome do filme exibido
     * @param dublado indica se o filme é dublado (true) ou legendado (false)
     * @param quantidadePessoas quantidade de pessoas no grupo familiar
     */
    public IngressoFamilia(double valorIngresso, String nomeFilme, boolean dublado, int quantidadePessoas) {
        super(valorIngresso, nomeFilme, dublado);
        this.quantidadePessoas = quantidadePessoas;
    }

    /**
     * Retorna a quantidade de pessoas do grupo familiar.
     *
     * @return número de pessoas
     */
    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    /**
     * Calcula o valor total do ingresso familiar.
     * Caso o grupo tenha mais de 3 pessoas, aplica um desconto de 5%.
     *
     * @return valor total com ou sem desconto aplicado
     */
    @Override
    public double calcularValorReal() {
        double valorFamilia = getValorIngresso() * quantidadePessoas;

        if (quantidadePessoas > 3) {
            double desconto = valorFamilia * 0.05;
            valorFamilia -= desconto;
            System.out.println("Desconto aplicado");
            System.out.println("Seu desconto foi de R$: " + desconto);
        } else {
            System.out.println("Nao é possível aplicar o desconto");
        }

        return valorFamilia;
    }

    /**
     * Exibe as informações do ingresso familiar no console.
     */
    @Override
    public void exibirInfo() {
        System.out.println("========= ENTRADA FAMILIA =========");
        System.out.println("Valor do ingresso R$: " + getValorIngresso());
        System.out.println("Nome do filme: " + getNomeFilme());
        System.out.println("Tipo: " + (isDublado() ? "Dublado" : "Legendado"));
        System.out.println("Quantidade de pessoas: " + quantidadePessoas);
    }
}
