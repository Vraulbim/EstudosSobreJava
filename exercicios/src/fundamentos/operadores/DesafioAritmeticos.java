package fundamentos.operadores;

public class DesafioAritmeticos {

    public static void main(String[] args){

        int form1 = ((1 - 5) * (2-7)) / 2 ;
        int form12 = (int) Math.pow(form1, 2);
        int form2 = (int) Math.pow((6 * (3 + 2)), 2);
        int form22 = form2 / (3 * 2);

        int form3 = (int) Math .pow((form22 - form12), 3);
        int def = (int) (form3 / (Math.pow(10, 3)));

        System.out.println(def);
    }
}
