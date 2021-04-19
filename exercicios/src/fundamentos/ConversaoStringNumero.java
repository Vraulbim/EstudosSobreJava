package fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {

    public static void main(String[] args){
        String valor1 = JOptionPane.showInputDialog("Digite o valor da String: ");
        String valor2 = JOptionPane.showInputDialog("Digite o valor da String: ");

        double double1 = Double.parseDouble(valor1);
        double double2 = Double.parseDouble(valor2);
        double soma = double1 + double2;
        double media = double1 / double2;

        System.out.println("A soma é: " + soma);
    }
}
