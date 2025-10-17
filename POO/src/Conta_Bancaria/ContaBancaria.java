/**
 * Pacote contendo as classes de exercícios.
 */
package Conta_Bancaria;

/**
 * Representa uma conta bancária com funcionalidades básicas
 * de depósito, saque, consulta de saldo e utilização de cheque especial.
 * * <p>O limite do cheque especial é definido no momento da criação da conta:
 * R$ 50,00 para depósitos iniciais de R$ 500,00 ou menos,
 * ou 50% do depósito inicial para valores acima de R$ 500,00.</p>
 *
 * @author cauanricardoribeiro
 * @version 1.0
 */
public class ContaBancaria {
    private double saldo;
    private final double chequeEspecialLimite;
    private double chequeEspecialUsado;

    /**
     * Construtor da classe ContaBancaria.
     * Inicializa a conta com um depósito inicial e define o limite do cheque especial.
     *
     * @param depositoInicial O valor a ser depositado na criação da conta. Deve ser positivo.
     */
    public ContaBancaria(double depositoInicial) {
        if (depositoInicial < 0) {
            System.out.println("ERRO: Deposito negativo");
        } else {
            this.saldo = depositoInicial;
        }
        this.chequeEspecialUsado = 0.0;
        if (depositoInicial <= 500) {
            this.chequeEspecialLimite = 50.0;
        } else {
            this.chequeEspecialLimite = depositoInicial * 0.50;
        }
    }

    /**
     * Exibe o saldo atual da conta e o valor já utilizado do cheque especial.
     */
    public void consultarSaldo() {
        System.out.println("----CONSULTAR SALDO-----");
        System.out.println("Saldo atual R$: " + saldo);
        if (chequeEspecialUsado > 0) {
            System.out.println("USando o cheque especial");
            System.out.println("Valor ja usado R$:" + chequeEspecialUsado);
        }
    }

    /**
     * Exibe os detalhes do cheque especial: limite total, valor usado e limite disponível.
     */
    public void consultarChequeEspecial() {
        double disponivel = chequeEspecialLimite - chequeEspecialUsado;
        System.out.println("----CONSULTA CHEQUE ESPECIAL ------");
        System.out.println("limite total R$: " + chequeEspecialLimite);
        System.out.println("Valor ja usado: R$" + chequeEspecialUsado);
        System.out.println("Limite disponivel R$: " + disponivel);
    }

    /**
     * Verifica se o cheque especial está sendo utilizado.
     *
     * @return {@code true} se o valor usado do cheque especial for maior que zero,
     * {@code false} caso contrário.
     */
    public boolean verificarUsoChequeEspecial() {
        return chequeEspecialUsado > 0;
    }

    /**
     * Realiza um depósito na conta.
     *
     * <p>Se houver uso do cheque especial, o depósito é primeiramente
     * usado para cobrir o valor em débito, acrescido de uma taxa de 20%.
     * Caso contrário, o valor é adicionado diretamente ao saldo.</p>
     *
     * @param valor O valor a ser depositado. Deve ser maior que zero.
     */
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("ERRO: Valor negativo");
            return;
        }
        if (chequeEspecialUsado > 0) {
            double taxa = chequeEspecialUsado * 0.20;
            double totalParaCobrir = chequeEspecialUsado + taxa;

            if (valor >= totalParaCobrir) {
                // Cobra o cheque especial (valor original + taxa) e o restante vai para o saldo
                saldo += (valor - totalParaCobrir);
                chequeEspecialUsado = 0;
                System.out.println("Depósito de R$ " + valor + " realizado.");
                System.out.println("Cheque Especial coberto com sucesso, incluindo taxa de 20% (R$ " + (taxa) + ").");
            } else {
                // Reduz o uso do cheque especial
                chequeEspecialUsado -= valor;
                if (chequeEspecialUsado < 0) {
                    saldo += Math.abs(chequeEspecialUsado); // O restante vai para o saldo
                    chequeEspecialUsado = 0.0;
                }
                System.out.println("Depósito de R$ " + valor + " realizado. Cheque Especial reduzido.");
            }

        } else {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        }
    }

    /**
     * Realiza um saque na conta.
     *
     * <p>Permite sacar do saldo e, se necessário, utiliza o limite disponível do cheque especial.</p>
     *
     * @param valor O valor a ser sacado. Deve ser maior que zero.
     */
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor para saque deve ser positivo");
            return;
        }

        double limiteTotal = saldo + (chequeEspecialLimite - chequeEspecialUsado);

        if (valor > limiteTotal) {
            System.out.println("Saque negado: Valor R$ " + valor + " excede seu limite total (R$ " + limiteTotal + ").");
            return;
        }

        // 1. Tenta sacar do saldo
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado do saldo.");
        } else {
            // 2. Se o saldo não for suficiente, usa o cheque especial
            double valorFaltante = valor - saldo;
            saldo = 0.0; // Zera o saldo
            chequeEspecialUsado += valorFaltante;
            System.out.println("Saque de R$ " + valor + " realizado. Saldo zerado. R$ " + valorFaltante + " retirados do Cheque Especial.");
        }
    }

    /**
     * Realiza o pagamento de um boleto, que utiliza a mesma lógica do saque.
     *
     * @param valor O valor do boleto a ser pago.
     * @see #sacar(double)
     */
    public void pagarBoleto(double valor) {
        System.out.println("\n--- Pagamento de Boleto ---");
        sacar(valor);
    }
}