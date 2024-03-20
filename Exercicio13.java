// 13. Escrever um programa que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se
// está apta ou não para cumprir o serviço militar obrigatório. Informe os totais

import java.util.Scanner;

import classes.Pessoa;

public class Exercicio13 {

    public static void Executar13(){
        Scanner leitor = new Scanner(System.in);
        int contAptos = 0;

        System.out.println("Informe a quantidade de pessoas para serem lidas: ");
        int n = leitor.nextInt();
        leitor.nextLine();

        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < n; i++){
            System.out.println("Informe o nome da "+ (i+1) + "a pessoa: ");
            String nome = leitor.nextLine();

            System.out.println("Informe o sexo da " + (i+1) + "a pessoa: (M/N)");
            char sexo = leitor.next().charAt(0);
            sexo = Character.toUpperCase(sexo);
            leitor.nextLine();

            System.out.println("Informe a idade da "+ (i+1) + "a pessoa: ");
            int idade = leitor.nextInt();
            leitor.nextLine();

            System.out.println("Informe a saude da "+ (i+1) + "a pessoa: (V/I)");
            char saude = leitor.next().charAt(0);
            saude = Character.toUpperCase(saude);
            leitor.nextLine();

            pessoas[i] = new Pessoa(nome, sexo, idade, saude);
        }

        for (int i =0; i < n; i++){
            if ((pessoas[i].sexo == 'M') && (pessoas[i].idade >= 18) && (pessoas[i].saude == 'V')){
                System.out.println(pessoas[i].nome + " esta apto para serviço militar");
                contAptos++;
            }
        }

        System.out.println("Ao todo existem " + contAptos + " pessoas aptas para o seriço militar");

        leitor.close();

    }

}
