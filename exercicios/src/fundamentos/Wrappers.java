package fundamentos;

public class Wrappers {

    public static void main(String[] args) {
        //byte
        Byte b = 100;
        //short
        Short s = 1000;
        //int
        Integer i = 100000;
        //integer - .parseInt converte uma string para um valor inteiro
        Integer iString = Integer.parseInt("100000");
        //long
        Long l = 10000000L;
        //boolean
        Boolean bool = true;
        //Boolean - .parseBoolean converte um valor digitado em texto, em um valor booleano
        Boolean boolString = Boolean.parseBoolean("true");
        //char
        Character c = 'A';
        //float
        Float f = 123.09F;
        //double
        Double d = 4321.2449;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i.toString());
        System.out.println(iString);
        System.out.println(l / 3);
        System.out.println(bool.toString().toUpperCase());
        System.out.println(boolString.booleanValue());
        System.out.println(c);
        System.out.println(f.isInfinite());
        System.out.println(d.toString());
    }

}
