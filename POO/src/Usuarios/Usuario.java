package Usuarios;

import java.util.Scanner;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private boolean administrador;
    private boolean logado;

    private static final Scanner sc = new Scanner(System.in);

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = true;
        this.logado = false;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public void realizarLogin(String emailCorreto, String senhaCorreta) {
        if (this.email.equals(emailCorreto) && this.senha.equals(senhaCorreta)) {
            logado = true;
            System.out.println("Acesso Liberado");
        } else {
            logado = false;
            System.out.println("ERRO: Acesso Negado - Senha ou email incorreto");
        }
    }

    public void realizarLogoff() {
        if (logado) {
            logado = false;
            System.out.println("Usuário Desconectado");
        } else {
            System.out.println("Usuário já está deslogado");
        }
    }

    public void alterarDados() {
        System.out.println("====== ALTERAR DADOS =======");
        System.out.println("Selecione a opção pra alterar os dados: ");
        System.out.println("(1) : Nome");
        System.out.println("(2) : Email");
        System.out.println("(3) : Senha");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Seu nome atual: " + getNome());
                System.out.println("Digite seu novo nome: ");
                String novoNome = sc.nextLine();
                setNome(novoNome);
                System.out.println("Nome alterado com sucesso!");
                System.out.println("Novo nome: " + getNome());
                break;

            case 2:
                System.out.println("Seu email atual :" + getEmail());
                System.out.println("Digite seu novo email: ");
                String novoEmail = sc.nextLine();
                setEmail(novoEmail);
                System.out.println("Email alterado com sucesso!");
                System.out.println("Novo email: " + getEmail());
                break;

            case 3:
                alterarSenha();
                break;

            default:
                System.out.println("Opção Invalida");
        }


    }

    public void alterarSenha() {
        System.out.println("Digite sua senha atual: ");
        String senhaAtual = sc.nextLine();
        if (senhaAtual.equals(getSenha())) {
            System.out.println("Digite sua nova senha: ");
            String novaSenha = sc.nextLine();
            setSenha(novaSenha);
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("ERRO: Senha incorreta. Tente novamente!");
        }

    }
}
