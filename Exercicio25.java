// 25. Dado o nome de um estudante, com o respectivo número de matrícula e as três notas do exercicio anterior, 
// desenvolva um programa para calcular a nota final e a classificação de cada estudante. 
// A classificação é dada conforme a lista abaixo:
// Nota Final Classificação
// [8,10] A
// [7,8] B
// [6,7] C
// [5,6] D
// [0,5] R
// Imprima o nome do estudante, com o seu número, nota final e classificação

import java.util.Scanner;
import classes.BoletimMelhorado;

public class Exercicio25 {

    public static void Executar25(){
        Scanner leitor = new Scanner(System.in);
        BoletimMelhorado boletim1 = new BoletimMelhorado();

        System.out.println("Classificação de Estudante");
        System.out.println("------------------------------");

        System.out.println("Informe o nome do aluno: ");
        boletim1.nome = leitor.nextLine();

        System.out.println("Informe o numero de matricula aluno: ");
        boletim1.matricula = leitor.nextInt();

        System.out.println("(Peso 2) Informe a nota do trabalho de laboratorio: ");
        boletim1.notaLaboratorio = leitor.nextDouble();

        System.out.println("(Peso 3) Informe a nota da avaliação semestral: ");
        boletim1.notaAvaliacao = leitor.nextDouble();

        System.out.println("(Peso 5) Informe a nota do exame final: ");
        boletim1.notaExame = leitor.nextDouble();

        System.out.println("------------------------------");
        double notaFinal = BoletimMelhorado.notaFinal(boletim1.notaLaboratorio, boletim1.notaAvaliacao, boletim1.notaExame);
        char Classificacao = BoletimMelhorado.classificacao(notaFinal);
        System.out.println("Matricula: " + boletim1.matricula);
        System.out.println("Nome: " + boletim1.nome);
        System.out.println("media final: " + notaFinal);
        System.out.println("Classificação: " + Classificacao);

        leitor.close();
    }

}
