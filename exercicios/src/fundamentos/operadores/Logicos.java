package fundamentos.operadores;

public class Logicos {
    public static void main(String[] args){
        boolean condition1 = 0<1;
        boolean condition2 = 2>0;

        System.out.println(condition1 && condition2);
        System.out.println(condition1 || condition2);
        System.out.println(condition1 ^ condition2);
        System.out.println(!!condition1);
        System.out.println(!condition2);

        System.out.println("Tabela verdade do E");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("Tabela verdade do OU");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("Tabela verdade do OU exclusivo ou XOR");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("Tabela verdade do NOT");
        System.out.println(!true);
        System.out.println(!false);
    }
}
