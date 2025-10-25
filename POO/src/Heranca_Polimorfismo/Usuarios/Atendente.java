package Heranca_Polimorfismo.Usuarios;

/**
 * Representa um atendente do sistema.
 *
 * <p>Essa classe mantém o valor total em caixa e oferece métodos
 * para registrar pagamentos e fechar o caixa no final do expediente.</p>
 *
 * @author cauanricardoribeiro
 * @version 1.0
 */
public class Atendente extends Usuario {

    /** Valor total acumulado no caixa do atendente. */
    private double valorEmCaixa;

    /**
     * Cria um novo atendente com nome, email e senha informados.
     * Define o valor inicial em caixa como zero.
     *
     * @param nome nome do atendente
     * @param email email corporativo do atendente
     * @param senha senha de acesso do atendente
     */
    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha);
        setAdministrador(false);
        this.valorEmCaixa = 0.0;
    }

    /**
     * Recebe um pagamento e soma o valor informado ao total em caixa.
     * Exibe no console o valor recebido e o saldo atualizado.
     *
     * @param valor valor recebido no pagamento
     */
    public void receberPagamento(double valor) {
        valorEmCaixa += valor;
        System.out.println("Pagamento de R$" + valor + " recebido.");
        System.out.println("Total em caixa: R$" + valorEmCaixa);
    }

    /**
     * Exibe o fechamento do caixa do atendente, mostrando
     * o valor total acumulado até o momento.
     */
    public void fecharCaixa() {
        System.out.println("Fechando o caixa...");
        System.out.println("Valor final em caixa: R$" + valorEmCaixa);
    }

    /**
     * Retorna o valor atual em caixa.
     *
     * @return total acumulado no caixa do atendente
     */
    public double getValorEmCaixa() {
        return valorEmCaixa;
    }
}
