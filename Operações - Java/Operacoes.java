//Código produzido por Arthue Eduardo Silva

import java.util.Scanner;

public class Operacoes{
    private static double x;
    private static double y;

    private static String opcao;

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args){
        boolean fim = false; 
        
        while(fim == false){
            System.out.println("Selecione qual operação você deseja fazer!");
            System.out.println(" + para soma!");
            System.out.println(" - para subtração!");
            System.out.println(" * para multiplicação!");
            System.out.println(" / para divisão!");
            System.out.println("Para sair digite fim!");

            opcao = entrada.nextLine();

            if(opcao.equals("fim")){
                fim = true;
            }
            else{
                processadorOpcao(opcao);
            }
        }

        entrada.close();

        System.out.println("Obrigado por usar o Programa!");
    }

    private static void processadorOpcao(String opcao){
        if(opcao.equals("+")){
            System.out.println("Você escolheu Soma!");
            System.out.println("Insira os valores que serão usados na operação!");
            x = Double.parseDouble(entrada.nextLine());
            y = Double.parseDouble(entrada.nextLine());
            System.out.println("Resultado: " + Soma(x, y));
        }
        else if(opcao.equals("-")){
            System.out.println("Você escolheu Subtracão!");
            System.out.println("Insira os valores que serão usados na operação!");
            x = Double.parseDouble(entrada.nextLine());
            y = Double.parseDouble(entrada.nextLine());
            System.out.println("Resultado: " + Subtracao(x, y));
        }
        else if(opcao.equals("*")){
            System.out.println("Você escolheu Multiplicação!");
            System.out.println("Insira os valores que serão usados na operação!");
            x = Double.parseDouble(entrada.nextLine());
            y = Double.parseDouble(entrada.nextLine());
            System.out.println("Resultado: " + Multiplicacao(x, y));
        }
        else if(opcao.equals("/")){
            System.out.println("Você escolheu Divisão!");
            System.out.println("Insira os valores que serão usados na operação!");
            x = Double.parseDouble(entrada.nextLine());
            y = Double.parseDouble(entrada.nextLine());
            System.out.println("Resultado: " + Divisao(x, y));
        }
        else{
            System.out.println("Opção inválida!");
            System.out.println("Por favor insira uma opção válida!");
        }
    }

    private static double Soma(double x, double y){
        return x + y;
    }

    private static double Subtracao(double x, double y){
        return x - y;
    }

    private static double Multiplicacao(double x, double y){
        return x * y;
    }

    private static double Divisao(double x, double y){
        return x / y;
    }
}