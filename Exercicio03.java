// 3. Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas 
// efetuadas por ele no mês (em dinheiro). 
// Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, 
// o salário fixo e salário no final do mês.

import java.util.Scanner;
import classes.Vendedor;

public class Exercicio03 {

    public static void Executar03(){
        Scanner leitor = new Scanner(System.in);
        Vendedor vendedor1 = new Vendedor();

        System.out.println("Informe o nome do vendedor: ");
        vendedor1.nome = leitor.nextLine();

        System.out.println("Informe o salario fixo do vendedor: ");
        vendedor1.salario = leitor.nextFloat();

        System.out.println("Informe o total do valor de vendas do vendedor: ");
        vendedor1.vendas = leitor.nextInt();

        double comissao = (vendedor1.vendas * 15) / 100;

        System.out.println("Status do Vendedor: ");
        System.out.println("Nome: " + vendedor1.nome);
        System.out.println("Salario fixo: " + vendedor1.salario);
        System.out.println("Salario final: " + (vendedor1.salario + comissao));

        leitor.close();

    }

}
