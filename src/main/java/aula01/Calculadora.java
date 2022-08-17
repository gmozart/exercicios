package aula01;


public class Calculadora {


    public static void soma(double val1, double val2){

        double resultado = val1 + val2;

        System.out.println("Resultado da soma dos numeros "+val1+" e "+val2+ " é: "+resultado);

    }

    public static void multiplicacao(double val1, double val2){

        double resultado = val1 * val2;

        System.out.println("Resultado da multiplicacao dos numeros "+val1+" e "+val2+ " é: "+resultado);

    }

    public static void subtracao(double val1, double val2){

        double resultado = val1 - val2;

        System.out.println("Resultado da subtracao dos numeros "+val1+" e "+val2+ " é: "+resultado);

    }

    public static void divisao(double val1, double val2){

        double resultado = val1 / val2;

        System.out.println("Resultado da divisao dos numeros "+val1+" e "+val2+ " é: "+resultado);

    }


}
