package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV32 =  trabalho1 ^ trabalho2;
        boolean sorvete = trabalho1 || trabalho2;


        //Operador Unário
        boolean maisSaudavel = !sorvete;

        // \" -> Escape para mostrar (") no print
        System.out.println("Comprou TV de 50\": " + comprouTV50);
        System.out.println("Comprou TV de 32\": " + comprouTV32);
        System.out.println("Tomou sorvete: " + sorvete);
        System.out.println("Está mais saudavel: " + maisSaudavel);

    }
}
