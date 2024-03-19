// 6. Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. 
// Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário

import java.util.Scanner;

import classes.Vendas;

public class Exercicio06 {

    public static void Executar06(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o preço de custo do produto: ");
        double preco = leitor.nextDouble();

        System.out.println("Informe a taxa de venda do produto: ");
        int taxa = leitor.nextInt();

        System.out.println("O valor de venda do produto é de " + Vendas.vender(preco, taxa));

        leitor.close();
    }

}
