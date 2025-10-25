package Interfaces_e_Lambda.Marketing;

public class Main {
    public static void main(String[] args) {
       ServicoMensagem[] servicos = {
               new ServicoEmail(),
               new ServicoSms(),
               new ServicoRedesSociais(),
               new ServicoWhatsApp()
       };
       for(ServicoMensagem s: servicos){
           s.enviarMensagem();
       }
    }
}
