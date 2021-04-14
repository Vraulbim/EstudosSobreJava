package fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args){

        //Valor representa a valor máximo das variaveis
        byte anosDeEmpresa = 127;
        short quantidadeDeVoos = 32767;
        int id = 25478586;
        //Se não colocarmos L no final de um long, o valor será salvo como inteiro
        long pontosAcumulados =  3_134_845_223L;

        //Para o float temos que indicar que o valor é do tipo float finalizando o número com f
        float salario = 11_445.44f;
        double vendasAcumuladas = 2_991_797_103.01;

        boolean estaDeFerias = false;

        char ativo = 'A';

        System.out.println(anosDeEmpresa * 365);
        System.out.println(quantidadeDeVoos / 2);
        System.out.println(pontosAcumulados / vendasAcumuladas);
        System.out.println(id + " ganha -> " + salario);
        System.out.println("Ferias? " + estaDeFerias);
        System.out.println("Ativo (A) ou Inativo (I) : " + ativo);
    }
}
