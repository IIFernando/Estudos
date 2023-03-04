public class Main {
    public static void main(String[] args)

//    {Exemplo 01.
//        int var1; // esta instrução declara uma variável
//        int var2; // esta instrução declara outra variável
//
//        var1 = 1024; // esta instrução atribui valor 1024 a var1
//
//        System.out.println("var1 contains " + var1);
//
//        var2 = var1 / 2;
//
//        System.out.println("var2 contains var1 / 2: ");
//        System.out.println(var2);
//
//    }

    {//Exemplo 02.
        int var; // essa instrução declara uma variavel int.
        double x; // essa instrução declara uma variavel de ponto flutuante.

        var = 10; // atribui o valor 10
        x = 10.0; // atribui o valor 10.0

        System.out.println("Original value of var " + var);
        System.out.println("Original value of x " + x);
        System.out.println();

        //agora divide as duas por 4.
        var = var / 4;
        x = x /4;

        System.out.println("var after division: " + var);
        System.out.println("x after division: "+ x);
    }

}