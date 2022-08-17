package aula01;

public class Main {

    public static void main(String [] args){

        /*Calculadora*/

        System.out.println("Exercicio Calculadora");

        Calculadora.soma(23,24);
        Calculadora.divisao(72,3);
        Calculadora.subtracao(23,10099);
        Calculadora.multiplicacao(23,450);

        /*Mensagem*/

        System.out.println("Exercicio Mensagem");

        Mensagem.obeterMensagem(5);
        Mensagem.obeterMensagem(4);
        Mensagem.obeterMensagem(17);

        /*Emprestimo*/

        System.out.println("Exercicio Emprestimo");

        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000,Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);



    }


}
