package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro salário: ");
        String salario1 = scanner.next().replace(",",".");;
        System.out.println("Digite o segundo salário: ");
        String salario2 = scanner.next().replace(",",".");;
        System.out.println("Digite o terceiro salário: ");
        String salario3 = scanner.next().replace(",",".");;

        double salarioUm = Double.parseDouble(salario1);
        double salarioDois = Double.parseDouble(salario2);
        double salarioTres = Double.parseDouble(salario3);

        double mediaSalario = (salarioUm + salarioDois + salarioTres) / 3;

        System.out.println("A média é: " + mediaSalario);
    }
}
