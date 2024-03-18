// 5. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros.
// Faça um programa que receba um valor de uma compra e mostre o valor das prestações

import java.util.Scanner;

import classes.Prestacoes;

public class Exercicio05 {

    public static void Executar05(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("\tLoja Mamão com Açucar");
        System.out.println("---------------------------------------");

        System.out.print("Informe o valor do produto: R$");
        double preco = leitor.nextDouble();

        System.out.println("---------------------------------------");
        System.out.println("O valor de cada prestação é de: R$" + Prestacoes.parcelar(preco));

        leitor.close();
    }

}
