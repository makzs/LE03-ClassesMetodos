// 22. Faça um programa que calcule o valor da conta de luz de uma pessoa. 
// Sabe-se que o cálculoda conta de luz segue a tabela abaixo:Tipo de Cliente Valor do KW/h1
// (Residência) 0,602 
// (Comércio) 0,483
// (Indústria) 1,29

import java.util.Scanner;

import classes.ContaLuz;

public class Exercicio22 {

    public static void Executar22() {
        Scanner leitor = new Scanner(System.in);
        ContaLuz conta =  new ContaLuz();

        System.out.println("Informe o valor de KW/h gasto: ");
        conta.valor = leitor.nextDouble();

        System.out.println("Informe o tipo de cliente (R/C/I) : ");
        conta.tipo = leitor.next().charAt(0);
        conta.tipo = Character.toUpperCase(conta.tipo);

        if ( conta.tipo == 'R'){
            double valorConta = conta.valor * 0.602;
            System.out.println("O valor da conta da luz é de: R$" + valorConta);
        }
        else if (conta.tipo == 'C'){
            double valorConta = conta.valor * 0.483;
            System.out.println("O valor da conta da luz é de: R$" + valorConta);
        }
        else if ( conta.tipo == 'I'){
            double valorConta = conta.valor * 1.29;
            System.out.println("O valor da conta da luz é de: R$" + valorConta);
        }
        else{
            System.out.println("Tipo de cliente invalido!");
        }

        leitor.close();
    }

}
