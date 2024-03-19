// 9. Ler 80 números e ao final informar quantos número(s) estão no intervalo entre 10 (inclusive)e 150 (inclusive).

import java.util.Random;

public class Exercicio09 {

    public static void Executar09(){
        Random valores = new Random();
        int[] nums = new int[80];

        for (int i = 0; i < 80; i++){
            nums[i] = valores.nextInt(300);
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("80 Valores aleatorios: ");
        for (int i = 0; i < 80; i++){
            System.out.print(nums[i] + " - ");
        }

        System.out.println("\n-----------------------------------------------------------");
        System.out.println("Valores entre 10 e 150: ");

        for (int valor : nums){
            if (valor >= 10 && valor <= 150){
                System.out.print(valor + " - ");
            }
        }
        System.out.println("\n-----------------------------------------------------------");
    }

}
