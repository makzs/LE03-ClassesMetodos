// 7. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do 
// distribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois a
// percentagem do distribuidor sobre o resultado). Supondo que a percentagem do distribuidor seja de 
// 28% e os impostos 45%. 
// Escrever um programa que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo

import java.util.Scanner;
import classes.CustoCarros;

public class Exercicio07 {

    public static void Executar07(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor de custo do carro: ");
        double preco = leitor.nextDouble();

        System.out.println("O valor de venda do carro é de: R$" + CustoCarros.Calcular(preco));

        leitor.close();
    }

}
