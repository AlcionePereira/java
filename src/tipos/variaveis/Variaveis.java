package tipos.variaveis;

public class Variaveis {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000;


        //int i1 = 10000000000;
        int i2 = 20500;


        long l1 = 1000000000000000000l; //para dizer que é um long coloca l no final do número
        long l2 = 2004005000500055000l;


        //float f1 =  4.5; erro pois para afirmar que é float colocar f no final.
        float f2 = 10.68f; //pode ser f minusculo ou maiúsculo


        double d1 = 85.69; //pode colocar a letra d ou não
        double d2 = 99.84d;


        char c1 = 'h';
        // char c2 = 'tm';  erro pois somente um caracter
        char c3 = '\u0057'; //código unicode correto


        String st1 = "fulano";
        String st2 = "Cicrano";
        String st3 = "ag dgb se ot 9876yh";

        //String dt1 = "02/07/200"; String deve usar somente caracteres

        boolean bol1 = true;
        boolean bol2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l2);
        System.out.println(l1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bol1);
        System.out.println(bol2);
    }
}
