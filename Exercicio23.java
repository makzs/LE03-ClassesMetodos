// 23. Faça um programa que leia o nome, o sexo, a altura e a idade de uma pessoa. Calcule e mostre nome
// e o seu peso ideal de acordo com as seguintes características da pesso
// sexo | altura| idade | peso ideal
// M    | >1.70 | <=20  | (72.7*h) - 58
// M    | >1.70 |21 a 39| (72.7*h) - 53
// M    | >1.70 | >=40  | (72.7*h) - 45
// M    |<=1.70 | <=40  | (72.7*h) - 50
// M    |<=1.70 | >40   | (72.7*h) - 58
//
// F    | >1.50 | ----- | (62.1*h) - 44.7
// F    |<=1.50 | >=35  | (62.1*h) - 45
// F    |<=1.50 | <35   | (62.1*h) - 49

import java.util.Scanner;
import classes.PessoaPesoIdeal;

public class Exercicio23 {

    public static void Executar23(){
        Scanner leitor = new Scanner(System.in);
        PessoaPesoIdeal pessoa1 = new PessoaPesoIdeal();

        System.out.println("Calculadora Peso Ideal");
        System.out.println("----------------------------------------");

        System.out.println("Informe o nome da pessoa: ");
        pessoa1.nome = leitor.nextLine();

        System.out.println("Informe o sexo da pessoa: ");
        pessoa1.sexo = leitor.next().charAt(0);
        pessoa1.sexo = Character.toUpperCase(pessoa1.sexo);

        System.out.println("Informe a idade da pessoa: ");
        pessoa1.idade = leitor.nextInt();

        System.out.println("Informe a altura da pessoa: ");
        pessoa1.altura = leitor.nextDouble();

        System.out.println("----------------------------------------");
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Sexo: "+ pessoa1.sexo);
        System.out.println("idade: "+ pessoa1.idade);
        System.out.println("altura: "+ pessoa1.altura);
        System.out.println("----------------------------------------");
        System.out.println("Peso ideal: "+ PessoaPesoIdeal.pesoCalc(pessoa1.sexo, pessoa1.altura, pessoa1.idade));

        leitor.close();
    }

}
