// 21. Elabore um programa que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias:
// Infantil A = 5 - 7 anos
// Infantil B = 8 - 10 anos
// juvenil A = 11- 13 anos
// juvenil B = 14 - 17 anos
// Sênior = 18 - 25 anos
// Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado.

import java.util.Scanner;

import classes.Nadador;

public class Exercicio21 {

    public static void Executar21() {
        Scanner leitor = new Scanner(System.in);
        Nadador nadador1 = new Nadador();

        System.out.println("-------------- Categorias Nadadores -------------- ");

        System.out.println("Informe a idade do nadador: ");
        nadador1.idade = leitor.nextInt();

        if ((nadador1.idade > 5) && (nadador1.idade < 7)){
            System.out.println("Infantil A");
        }
        else if ((nadador1.idade > 7) && (nadador1.idade <= 10)){
            System.out.println("Infantil B");
        }
        else if ((nadador1.idade > 10) && (nadador1.idade <= 13)){
            System.out.println("juvenil A");
        }
        else if ((nadador1.idade > 13) && (nadador1.idade <= 17)){
            System.out.println("juvenil B");
        }
        else if ((nadador1.idade > 18) && (nadador1.idade <= 25)){
            System.out.println("Senior");
        }
        else{
            System.out.println("idade fora da faixa etária");
        }

        leitor.close();
    }

}
