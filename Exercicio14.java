// 14. Faça um programa que receba o preço de custo e o preço de venda de 40 produtos. 
// Mostre como resultado se houve lucro, prejuízo ou empate para cada produto. 
// Informe média de preço de custo e do preço de venda

import java.util.Scanner;

public class Exercicio14 {

    // ----------- Funções ----------- 

    public static void linha(){
        System.out.println("-----------------------------------------------------");
    }

    // ----------- Fim Funções ----------- 

    public static void Executar14(){
        Scanner leitor = new Scanner(System.in);
        double[] custos = new double[40];
        double[] vendas = new double[40];
        double somaCusto = 0;
        double somaVenda = 0;

        for (int i = 0; i < custos.length; i++){
            System.out.print("Informe o valor do " + (i+1) + "o custo: R$");
            custos[i] = leitor.nextDouble();
            somaCusto += custos[i];
        }

        linha();

        for (int i = 0; i < vendas.length; i++){
            System.out.print("Informe o valor da " + (i+1) + "a venda: R$");
            vendas[i] = leitor.nextDouble();
            somaVenda += vendas[i];
        }

        linha();

        for (int i = 0; i < custos.length; i++){
            if (custos[i] - vendas[i] < 0){
                System.out.println("O produto numero " + (i+1) + " teve lucro!");
            }
            else if (custos[i] - vendas[i] > 0){
                System.out.println("O produto numero " + (i+1) + " teve prejuizo!");
            }
            else{
                System.out.println("O produto numero " + (i+1) + " teve empate!");
            }
        }

        linha();

        double mediaCusto = somaCusto / custos.length;
        double mediaVenda = somaVenda / vendas.length;

        System.out.println("Ao todo tivemos uma media de custos de: R$" + mediaCusto);
        System.out.println("Ao todo tivemos uma media de vendas de: R$" + mediaVenda);
        if (mediaCusto < mediaVenda){
            System.out.println("E tivemos mais lucros do que prejuizos!");
        }
        else if (mediaCusto > mediaVenda){
            System.out.println("E tivemos mais prejuizos do que lucros!");
        }
        else{
            System.out.println("E tivemos uma empate entre lucros e prejuizos!");
        }

        leitor.close();

    }

}
