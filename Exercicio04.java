// 4. Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido 
// em dólar (US$). O programa deverá solicitar o valor da cotação do dólar e também a 
// quantidade de dólares disponíveis com o usuário.

import java.util.Scanner;

import classes.Conversor;

public class Exercicio04 {

    public static void Executar04(){
        Scanner leitor = new Scanner(System.in);
        Conversor converter = new Conversor();
        
        System.out.println("Informe o valor da cotacao do dolar: ");
        converter.cotacao= leitor.nextDouble();

        System.out.println("Informe o valor em dolares: US$");
        converter.dolares = leitor.nextDouble();

        System.out.println("A quantidade de dolares informada é igual a: R$" + (converter.dolares * converter.cotacao));

        leitor.close();
    }


}
