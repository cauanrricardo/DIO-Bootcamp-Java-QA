package Introducao.Carro;

/**
 * Representa um modelo simplificado de carro, gerenciando seu estado
 * (ligado/desligado), velocidade, marcha e direção.
 *
 * <p>A classe implementa regras básicas de simulação, como a necessidade
 * de estar em ponto morto e parado para desligar, e limites de velocidade
 * compatíveis com cada marcha.</p>
 *
 * @author cauanricardoribeiro
 * @version 1.0
 */
public class Carro {
    private boolean ligado;
    private int velocidadeAtual;
    private int marchaAtual;
    private String direcao;

    /**
     * Construtor padrão da classe Carro.
     * Inicializa o carro no estado padrão: desligado, parado (0 km/h),
     * em ponto morto (Marcha 0) e direção "Frente".
     */
    public Carro() {
        this.ligado = false;
        this.velocidadeAtual = 0;
        this.marchaAtual = 0;
        this.direcao = "Frente";
    }

    /**
     * Liga o carro.
     */
    public void ligar() {
        ligado = true;
        System.out.println("Carro ligado com sucesso.");
    }

    /**
     * Tenta desligar o carro.
     * O carro só pode ser desligado se estiver parado (velocidade 0) e
     * em ponto morto (marcha 0).
     */
    public void desligar() {
        if (marchaAtual == 0 && velocidadeAtual == 0) {
            ligado = false;
            System.out.println("Carro desligado com sucesso.");
        } else {
            System.out.println("ERRO: Carro sem condições de desligar. Velocidade: " + velocidadeAtual + " km/h, Marcha: " + marchaAtual + ".");
        }
    }

    /**
     * Verifica se uma determinada velocidade é compatível com a marcha.
     * Método utilitário usado internamente pelos métodos {@code acelerar} e {@code trocarMarcha}.
     *
     * @param marcha O número da marcha a ser verificada (0 a 6).
     * @param velocidade A velocidade atual do carro (em km/h).
     * @return {@code true} se a velocidade estiver dentro do limite da marcha, {@code false} caso contrário.
     */
    private boolean verificarCompatibilidadeVelocidade(int marcha, int velocidade) {
        int min, max;

        switch (marcha) {
            case 0: // Ponto Morto
                min = 0;
                max = 0;
                break;
            case 1: // 1ª Marcha
                min = 0;
                max = 20;
                break;
            case 2: // 2ª Marcha
                min = 21;
                max = 40;
                break;
            case 3: // 3ª Marcha
                min = 41;
                max = 60;
                break;
            case 4: // 4ª Marcha
                min = 61;
                max = 80;
                break;
            case 5: // 5ª Marcha
                min = 81;
                max = 100;
                break;
            case 6: // 6ª Marcha
                min = 101;
                max = 120;
                break;
            default:
                System.err.println("Erro interno: Marcha inválida.");
                return false;
        }

        return velocidade >= min && velocidade <= max;
    }

    /**
     * Acelera o carro, aumentando a velocidade em 1 km/h.
     * Aceleração só é permitida se o carro estiver ligado e a velocidade atual for
     * compatível com a marcha engatada. A velocidade máxima é 120 km/h.
     */
    public void acelerar() {
        if (!ligado) {
            System.out.println("ERRO: carro desligado.");
            return;
        }
        if (velocidadeAtual >= 120) {
            System.out.println("ERRO: Velocidade máxima (120 km/h) atingida.");
            return;
        }

        int proximaVelocidade = velocidadeAtual + 1;

        // Verifica a compatibilidade da nova velocidade com a marcha atual
        if (verificarCompatibilidadeVelocidade(marchaAtual, proximaVelocidade)) {
            velocidadeAtual = proximaVelocidade;
            System.out.println("Acelerando... Velocidade atual: " + velocidadeAtual + " km/h na Marcha " + marchaAtual + ".");
        } else {
            System.out.println("ERRO: Velocidade máxima da Marcha " + marchaAtual + " atingida. Troque a marcha para acelerar mais!");
        }
    }

    /**
     * Diminui a velocidade do carro em 1 km/h.
     * A redução é feita apenas se o carro estiver ligado e a velocidade for maior que 0.
     */
    public void diminuirVelocidade(){
        if(ligado && velocidadeAtual > 0){
            velocidadeAtual -=1;
            System.out.println("Reduzindo... Velocidade atual: " + velocidadeAtual + " km/h.");
        } else if (!ligado) {
            System.out.println("ERRO: Carro desligado.");
        } else {
            System.out.println("ERRO: Carro já está parado (0 km/h).");
        }
    }

    /**
     * Tenta trocar a marcha do carro para a novaMarcha especificada.
     * Regras de troca:
     * <ul>
     * <li>Carro deve estar ligado.</li>
     * <li>Nova marcha deve ser adjacente à marcha atual (não pode pular marcha).</li>
     * <li>Velocidade atual deve ser compatível com a nova marcha.</li>
     * </ul>
     *
     * @param novaMarcha O número da marcha desejada (de 0 a 6).
     */
    public void trocarMarcha(int novaMarcha) {
        if (!ligado) {
            System.out.println("ERRO: O carro está desligado. Não é possível trocar a marcha.");
            return;
        }
        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("ERRO: Marcha " + novaMarcha + " é inválida. O carro possui marchas de 0 a 6.");
            return;
        }

        // Verifica se a nova marcha é adjacente
        int diferenca = Math.abs(novaMarcha - marchaAtual);
        if (diferenca > 1 && !(marchaAtual == 0 && novaMarcha == 1)) {
            // Nota: Ponto morto para 1ª é um caso especial que não precisa de verificação de pulo
            // Em uma simulação mais avançada, o pulo de marcha é permitido se houver o comando "embrear"
            System.out.println("ERRO: Não é permitido pular a marcha! Tente mudar para a marcha adjacente (Ex: 2 -> 3).");
            return;
        }

        // Verifica a compatibilidade de velocidade
        if (verificarCompatibilidadeVelocidade(novaMarcha, velocidadeAtual)) {
            marchaAtual = novaMarcha;
            System.out.println("Marcha trocada com sucesso. Marcha atual: " + marchaAtual);
        } else {
            System.out.println("ERRO: Velocidade atual (" + velocidadeAtual + " km/h) é incompatível com a Marcha " + novaMarcha + ".");
        }
    }

    /**
     * Muda a direção do carro (esquerda ou direita).
     * Só é permitido se o carro estiver ligado e a velocidade estiver entre 1 e 40 km/h.
     *
     * @param direcao A direção para a qual o carro deve virar (ex: "esquerda", "direita").
     */
    public void virar(String direcao){
        if(!ligado){
            System.out.println("ERRO: Carro desligado. Não é possível virar.");
            return;
        }
        if(velocidadeAtual >= 1 && velocidadeAtual <= 40){
            this.direcao = direcao;
            System.out.println("O carro virou para a " + direcao + ".");
        }else if(velocidadeAtual < 1){
            System.out.println("ERRO: Carro muito lento. Velocidade mínima para virar é 1 km/h.");
        }
        else {
            System.out.println("ERRO: Carro está muito rápido. Velocidade máxima para virar é 40 km/h.");
        }
    }

    /**
     * Retorna a velocidade atual do carro.
     *
     * @param velocidadeAtual O valor da velocidade atual (o argumento passado é ignorado, mas mantido por consistência).
     * @return A velocidade atual do carro em km/h.
     * @deprecated Este método não faz sentido com um argumento e deve ser substituído por um getter simples sem argumentos.
     */
    public int verificarVelocidade(int velocidadeAtual){
        return this.velocidadeAtual;
    }

    /**
     * Exibe o status completo do carro no console, incluindo o estado (ligado/desligado),
     * velocidade, marcha e direção.
     */
    public void verificarStatus(){
        System.out.println("\n--- STATUS COMPLETO CARRO ---");
        String statusLigado = this.ligado? "LIGADO" : "DESLIGADO";
        System.out.println("Status: "+ statusLigado);
        if(this.ligado){
            System.out.println("Velocidade Atual: "+ this.velocidadeAtual + " KM/H");
            System.out.println("Marcha Atual: " + this.marchaAtual);
            System.out.println("Direção: " + this.direcao);
        }else{
            System.out.println("Velocidade: 0 km/h");
            System.out.println("Marcha: 0 (Ponto Morto)");
            System.out.println("O carro está em repouso.");
        }
        System.out.println("-----------------------------");
    }
}