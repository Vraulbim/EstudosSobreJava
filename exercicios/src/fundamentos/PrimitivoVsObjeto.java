package fundamentos;

import java.util.Locale;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {
        String s = new String("Texto");
        s.toUpperCase();

        //Wrappers são versões objetificadas dos tipos primitivos
        int i = 1;
        System.out.println(i);

    }
}
