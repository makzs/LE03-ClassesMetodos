// 2. Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a 
// distância total percorrida pelo automóvel e o total de combustível gasto.

import java.util.Scanner;
import classes.Automovel;

public class Exercicio02 {

    public static void Executar02(){
        Scanner leitor = new Scanner(System.in);
        Automovel carro1 = new Automovel();

        System.out.println("Informe a distancia percorrida pelo automovel: ");
        carro1.distancia = leitor.nextInt();

        System.out.println("Informe o combustivel consumido pelo automovel: ");
        carro1.combustivel = leitor.nextInt();

        int consumo = carro1.distancia / carro1.combustivel;

        System.out.println("O consumo medio do automovel é de " + consumo + "km/l");

        leitor.close();

    }

}
