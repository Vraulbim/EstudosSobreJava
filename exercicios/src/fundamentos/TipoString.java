package fundamentos;

public class TipoString {

    public static void main(String [] args){

        //O valor de uma string não pode ser modificado, apenas subtituido ou concatenado
        String nome = "Vitor";
        String sobrenome = "Raul Bim";
        int idade = 19;
        float salario = 700.68f;

        System.out.println("Olá Bem-vindo".charAt(0));
        System.out.println(nome.toLowerCase().startsWith("v"));
        System.out.println(nome.length());
        System.out.println(nome.endsWith("r"));
        System.out.println(nome.equals("Vitor"));
        System.out.println(nome.equalsIgnoreCase("vitor"));

        String frase = String.format("Nome: %s %s \n", nome, sobrenome);
        System.out.println(frase);
        // OU
        System.out.printf("%s tem %d anos e ganha R$%.2f \n", nome, idade, salario);
    }
}
