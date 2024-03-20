// 15. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. 
// Faça um programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. 
// O desconto deverá ser calculado sobre o valor do veículo de acordo com o combustível 
// (álcool – 25%, gasolina– 21% ou diesel –14%). Com valor do veículo zero encerra entrada de dados. 
// Informe total dedesconto e total pago pelos clientes

import java.util.Scanner;

import classes.DescontosCarrosCombustiveis;

public class Exercicio15 {

    public static void Executar15(){
        Scanner leitor = new Scanner(System.in);
        boolean repetir = true;

        System.out.println("Carango ");
        System.out.println("Calculadora de descontos");

        while (repetir){
            System.out.println("\n----------------------------------\n");
            System.out.print("Informe o preço do veiculo: R$");
            double preco = leitor.nextDouble();

            if (preco == 0){
                repetir = false;
                break;
            }

            System.out.print("\nInforme o tipo de combustivel do veiculo: (A/G/D)");
            char combustivel = leitor.next().charAt(0);
            combustivel = Character.toUpperCase(combustivel);
            if (combustivel == 'A'){
                System.out.println("\nDesconto calculado: " + DescontosCarrosCombustiveis.descontoA(preco));
                System.out.println("Preço final: " + (preco - DescontosCarrosCombustiveis.descontoA(preco)));
            }
            else if (combustivel == 'G'){
                System.out.println("\nDesconto calculado: " + DescontosCarrosCombustiveis.descontoG(preco));
                System.out.println("Preço final: " + (preco - DescontosCarrosCombustiveis.descontoG(preco)));
            }
            else if (combustivel == 'D'){
                System.out.println("\nDesconto calculado: " + DescontosCarrosCombustiveis.descontoD(preco));
                System.out.println("Preço final: " + (preco - DescontosCarrosCombustiveis.descontoD(preco)));
            }
            else{
                System.out.println("Combustive invalido");
            }
        }

        leitor.close();

    }

}
