package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

    public static void main(String[] args){

        //Implicita
        double d = 1.12345678888;
        System.out.println(d);

        //CAST = conversão explicita dos tipos primitivos
        float f = (float) 1.12345678888;
        System.out.println(f);

        int i = 4;
        byte b = (byte) i; // CAST
        System.out.println(b);

        double db = 1;
        int in = (int) db;
        System.out.println(in);
    }
}
