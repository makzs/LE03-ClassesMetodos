// 1. Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve 
// no semestre. No final informar o nome do aluno e a sua média (aritmética).

import java.util.Scanner;

import classes.Aluno;

public  class Exercicio01 {

    public static void Executar01() {
        Scanner leitor =  new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        System.out.println("Informe o nome do aluno: ");
        aluno1.nome = leitor.nextLine();

        System.out.println("Informe a primeira nota: ");
        aluno1.nota1 = leitor.nextDouble();
        System.out.println("Informe a segunda nota: ");
        aluno1.nota2 = leitor.nextDouble();
        System.out.println("Informe a terceira nota: ");
        aluno1.nota3 = leitor.nextDouble();

        double media = (aluno1.nota1 + aluno1.nota2 + aluno1.nota3) / 3;

        System.out.println("A media aritmética do aluno é de: " + media);


        leitor.close();
    }


}
