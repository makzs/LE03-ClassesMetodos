// 8. Escrever um programa que leia o nome e as três notas obtidas por um aluno durante o semestre. 
// Calcular a sua média (aritmética), informar o nome e sua menção
// aprovado (media >= 7),Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9)

import java.util.Scanner;
import classes.Aluno;

public class Exercicio08 {

    public static void Executar08(){
        Scanner leitor = new Scanner(System.in);
        Aluno aluno1 = new Aluno();
        
        System.out.println("Informe o nome do aluno: ");
        aluno1.nome = leitor.nextLine();

        System.out.println("Informe a primeira nota do aluno: ");
        aluno1.nota1 = leitor.nextDouble();

        System.out.println("Informe a segunda nota do aluno: ");
        aluno1.nota2 = leitor.nextDouble();

        System.out.println("Informe a terceira nota do aluno: ");
        aluno1.nota3 = leitor.nextDouble();

        double media = (aluno1.nota1 + aluno1.nota2 + aluno1.nota3) / 3;

        System.out.println("------------------------------------------");
        System.out.println("\t\tStatus Escolar");
        System.out.println("------------------------------------------");
        System.out.println("Aluno: \t\t" + aluno1.nome);
        System.out.println("Nota 1: \t\t\t" + aluno1.nota1);
        System.out.println("Nota 2: \t\t\t" + aluno1.nota2);
        System.out.println("Nota 3: \t\t\t" + aluno1.nota3);
        System.out.println("Media: \t\t\t\t" + media);
        System.out.println("------------------------------------------");
        if (media >= 7){
            System.out.println("\t\tAluno Aprovado!");
        }
        else if (media > 5.1){
            System.out.println("\t\tAluno em Recuperação!");
        }
        else{
            System.out.println("\t\tAluno Reprovado!");
        }
        System.out.println("------------------------------------------");

        leitor.close();
    }

}
