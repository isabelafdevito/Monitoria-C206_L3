package exercicio1;

import static java.lang.Math.pow;

public class Calculadora {

    //definindo uma constante (final) do tipo static:
    public final static double PI = 3.14;

    public static double volume(double raio){
        return (4/3*(PI*pow(raio,2)));
    }

    public static double circunferencia(double raio){
        return (2*PI*raio);
    }
}
