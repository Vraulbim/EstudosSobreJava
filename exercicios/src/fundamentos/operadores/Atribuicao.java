package fundamentos.operadores;

public class Atribuicao {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        int c = a + b;

        c += b;
        c -=a;
        c *=b;
        c /=a;

        System.out.println(c);
        c %= 2;
        System.out.println(c);
    }
}
