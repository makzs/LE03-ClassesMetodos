// 20. A escola “APRENDER” faz o pagamento de seus professores por hora/aula. 
// Faça um programa que calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela:
// Professor Nível 1 R$12,00 por hora/aula
// Professor Nível 2 R$17,00 por hora/aula 
// Professor Nível 3 R$25,00 por hora/aula

import java.util.Scanner;
import classes.Professor;

public class Exercicio20 {

    public static void Executar20(){
        Scanner leitor = new Scanner(System.in);
        Professor professor1 = new Professor();

        System.out.println("-------------- Escola Aprender --------------");

        System.out.println("Passe as informações do professor:");

        System.out.println("Informe a quantidade de aulas: ");
        professor1.aulas = leitor.nextInt();
        System.out.println("Informe a quantidade de horas de cada aula: ");
        professor1.horas = leitor.nextInt();
        System.out.println("Informe o nivel do professor (1/2/3) : ");
        professor1.nivel = leitor.nextInt();

        if (professor1.nivel == 1){
            double salario = (professor1.horas * professor1.aulas) * 12;
            System.out.println("O salario desse professor é de: R$" + salario);
        }
        else if (professor1.nivel == 2){
            double salario = (professor1.horas * professor1.aulas) * 17;
            System.out.println("O salario desse professor é de: R$" + salario);
        }
        else if (professor1.nivel == 3){
            double salario = (professor1.horas * professor1.aulas) * 25;
            System.out.println("O salario desse professor é de: R$" + salario);
        }
        else{
            System.out.println("Nivel invalido!");
        }

        leitor.close();

    }

}
