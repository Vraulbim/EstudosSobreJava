package fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.print("Bom dia \n");

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("\nSeu nome é: " + nome);

        System.out.print("Digite sua idade: ");
        int  idade = entrada.nextInt();
        System.out.printf("\nVocê tem %d anos", idade);

        entrada.close();
    }
}
