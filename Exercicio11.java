//  11. Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é 
// homem ou mulher. No final informe total de homens e de mulheres

import java.util.Scanner;

public class Exercicio11 {

    public static void Executar11(){
        Scanner leitor = new Scanner(System.in);
        String[] nomes = new String[56];
        char[] sexo = new char[56];
        int contM = 0;
        int contF = 0;

        for (int i = 0; i < 56; i++){
            boolean sexoValido = false;
            System.out.println("Informe o " + (i+1) + "o nome: ");
            nomes[i] = leitor.nextLine();
            System.out.println("Informe o sexo de " + nomes[i] + " (M/F): ");
            char sexoInformado = leitor.next().charAt(0);
            sexoInformado = Character.toUpperCase(sexoInformado);
            leitor.nextLine();
            if ((sexoInformado == 'M') || (sexoInformado == 'F')){
                sexo[i] = sexoInformado;
            }
            else{
                while (sexoValido == false){
                    System.out.println("Informe um sexo valido! (M/F) : ");
                    sexoInformado = leitor.next().charAt(0);
                    sexoInformado = Character.toUpperCase(sexoInformado);
                    leitor.nextLine();
                    if ((sexoInformado == 'M') || (sexoInformado == 'F')) {
                        sexoValido = true;
                        sexo[i] = sexoInformado;
                    } 
                }
            }
        }

        System.out.println("--------------------------");

        for (int i = 0; i < 56; i++){
            if (sexo[i] == 'M'){
                contM++;
            }
            else if (sexo[i] == 'F'){
                contF++;
            }
        }

        System.out.println("Da lista de nomes informada, " + contM + " são homens e " + contF + " são mulheres");

        leitor.close();
    }

}
