package fundamentos;

public class Aritmeticos {

    public static  void main(String[] args){

        System.out.println(1 + 2);

        var x = 1.4;
        double y = 3.5;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        int a = 50;
        int b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a / (double) b); // CAST

        System.out.println(a % 3);

    }
}
