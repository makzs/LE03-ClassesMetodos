// 18. Faça um programa que receba o nome a idade, o sexo e salário fixo de um funcionário. 
// Mostre o nome e o salário líquido acrescido do abono conforme o sexo e a idade:
// sexo | idade | abono
// M    | >=30  | 100
// M    |  <30  | 50
// F    | >=30  | 200
// F    |  <30  | 80

import java.util.Scanner;
import classes.Funcionario;

public class Exercicio18 {

    public static void Executar18(){
        Scanner leitor = new Scanner(System.in);
        Funcionario funcionario1 = new Funcionario();

        System.out.println("Informe o nome do funcionario: ");
        funcionario1.nome = leitor.nextLine();

        System.out.println("Informe a idade do funcionario: ");
        funcionario1.idade = leitor.nextInt();

        System.out.println("Informe o sexo do funcionario (M/F) : ");
        funcionario1.sexo = leitor.next().charAt(0);
        funcionario1.sexo = Character.toUpperCase(funcionario1.sexo);

        System.out.println("Informe o salario do funcionario: ");
        funcionario1.salario = leitor.nextDouble();

        if (funcionario1.sexo == 'M'){
            if (funcionario1.idade >= 30){
                System.out.println("Ficha de funcionario");
                System.out.println("----------------------------------");
                System.out.println("Nome: " + funcionario1.nome);
                System.out.println("idade: " + funcionario1.idade);
                System.out.println("sexo: " + funcionario1.sexo);
                System.out.println("antigo salario: R$" + funcionario1.salario);
                System.out.println("abono: R$" + 100);
                funcionario1.salario += 100;
                System.out.println("novo salario: R$" + funcionario1.salario);
            }
            else{
                System.out.println("Ficha de funcionario");
                System.out.println("----------------------------------");
                System.out.println("Nome: " + funcionario1.nome);
                System.out.println("idade: " + funcionario1.idade);
                System.out.println("sexo: " + funcionario1.sexo);
                System.out.println("antigo salario: R$" + funcionario1.salario);
                System.out.println("abono: R$" + 50);
                funcionario1.salario += 50;
                System.out.println("novo salario: R$" + funcionario1.salario);
            }
        }
        else if (funcionario1.sexo == 'F'){
            if (funcionario1.idade >= 30){
                System.out.println("Ficha de funcionario");
                System.out.println("----------------------------------");
                System.out.println("Nome: " + funcionario1.nome);
                System.out.println("idade: " + funcionario1.idade);
                System.out.println("sexo: " + funcionario1.sexo);
                System.out.println("antigo salario: R$" + funcionario1.salario);
                System.out.println("abono: R$" + 200);
                funcionario1.salario += 200;
                System.out.println("novo salario: R$" + funcionario1.salario);
            }
            else{
                System.out.println("Ficha de funcionario");
                System.out.println("----------------------------------");
                System.out.println("Nome: " + funcionario1.nome);
                System.out.println("idade: " + funcionario1.idade);
                System.out.println("sexo: " + funcionario1.sexo);
                System.out.println("antigo salario: R$" + funcionario1.salario);
                System.out.println("abono: R$" + 80);
                funcionario1.salario += 80;
                System.out.println("novo salario: R$" + funcionario1.salario);
            }
        }
        else{
            System.out.println("Informações fornecidas invalidas!");
        }

        leitor.close();
    }

}
