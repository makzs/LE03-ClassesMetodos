// 10. Faça um programa que receba a idade de um número finito de pessoas e mostre mensagem informando 
//“maior de idade” e “menor de idade” para cada pessoa. Considerar a pessoa com 18anos como maior de idade.

import java.util.Random;

public class Exercicio10 {

    public static void Executar10(){
        Random valores = new Random();
        int[] nums = new int[50];

        for (int i = 0; i < 50; i++){
            nums[i] = valores.nextInt(75);
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("idades aleatorias: ");
        for (int i = 0; i < 50; i++){
            System.out.print(nums[i] + " - ");
        }

        System.out.println("\n-----------------------------------------------------------");
        System.out.println("maior idade: ");

        for (int valor : nums){
            if (valor > 18){
                System.out.print(valor + " - ");
            }
        }
        System.out.println("\n-----------------------------------------------------------");
        System.out.println("menor idade: ");

        for (int valor : nums){
            if (valor < 18){
                System.out.print(valor + " - ");
            }
        }
        System.out.println("\n-----------------------------------------------------------");
    }

}
