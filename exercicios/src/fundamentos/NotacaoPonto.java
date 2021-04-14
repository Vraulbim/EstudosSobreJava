package fundamentos;

public class NotacaoPonto {

    public static void main(String[] args) {

        String mensagem = "Bom dia X";

        mensagem = mensagem.replace("X", "Vitor");
        mensagem = mensagem.toUpperCase();
        mensagem = mensagem.concat("!");


        System.out.println(mensagem);
        System.out.println("Tipos primitivos não tem o operador . ");

    }

}
