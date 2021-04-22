package fundamentos.operadores;

public class Relacoinais {
    public static void main(String[] args) {
        int a = 97;
        int b = 'a';

        System.out.println((a == b) + " && \u0061");

        System.out.println(3>3);
        System.out.println(3<3);
        System.out.println(3==3);
        System.out.println(3>=3);
        System.out.println(3<=3);

        double nota = 7.0;
        boolean bomcomportamento = true;

        boolean desconto = nota >= 7 && bomcomportamento;

        System.out.println("Tem desconto: " + desconto);
    }
}
