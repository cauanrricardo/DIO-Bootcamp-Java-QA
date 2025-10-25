package Heranca_Polimorfismo.Ingresso;

/**
 * Representa um ingresso de cinema com informações sobre o valor,
 * nome do filme e se é dublado ou legendado.
 *
 * @author cauanricardoribeiro
 * @version 1.0
 */
public class Ingresso {
    private double valorIngresso;
    private String nomeFilme;
    boolean dublado;

    /**
     * Constrói um ingresso com os dados informados.
     *
     * @param valorIngresso valor do ingresso em reais
     * @param nomeFilme nome do filme exibido
     * @param dublado indica se o filme é dublado (true) ou legendado (false)
     */
    public Ingresso(double valorIngresso, String nomeFilme, boolean dublado){
        this.valorIngresso = valorIngresso;
        this.nomeFilme = nomeFilme;
        this.dublado = dublado;
    }

    /**
     * Retorna o valor do ingresso.
     *
     * @return valor do ingresso
     */
    public double getValorIngresso() {
        return valorIngresso;
    }

    /**
     * Retorna o nome do filme.
     *
     * @return nome do filme
     */
    public String getNomeFilme() {
        return nomeFilme;
    }

    /**
     * Informa se o filme é dublado.
     *
     * @return true se for dublado, false se for legendado
     */
    public boolean isDublado() {
        return dublado;
    }

    /**
     * Calcula o valor real do ingresso.
     * Pode ser sobrescrito por subclasses para aplicar descontos.
     *
     * @return valor real do ingresso
     */
    public double calcularValorReal(){
        return valorIngresso;
    }

    /**
     * Exibe as informações do ingresso no console.
     */
    public void exibirInfo(){
        System.out.println("========= INFORMACOES DO FILME =========");
        System.out.println("Valor do ingresso R$: " + valorIngresso);
        System.out.println("Nome do filme: " + nomeFilme);
        System.out.println("Tipo: " + (dublado ? "Dublado" : "Legendado"));
    }
}
