package fundamentos;

public class ConverterTemperatura {
    public static void main(String[] args) {

        final double ajuste = 32;
        final double multiplicador = 5 /9.0;
        double temperaturaF = 86;
        double temperaturaC = (temperaturaF - ajuste) * multiplicador;


        System.out.println(temperaturaC);
    }
}
