// 17. Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário 
// reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. 
// Calcule quanto à empresa vai aumentar sua folha de pagamento

import java.util.Scanner;
import classes.Funcionario;

public class Exercicio17 {

    public static void Executar17(){
        Scanner leitor = new Scanner(System.in);
        Funcionario funcionario1 = new Funcionario();

        System.out.println("Informe o nome do funcionario: ");
        funcionario1.nome = leitor.nextLine();

        System.out.println("Informe o salario do funcionario: ");
        funcionario1.salario = leitor.nextDouble();

        System.out.println("Informe o salario minimo: ");
        double salarioMinimo = leitor.nextDouble();

        double reajuste = -1 * (funcionario1.salario - salarioMinimo);

        if ( reajuste < 0){
            System.out.println("Funcionario: " + funcionario1.nome);
            System.out.println("O reajuste nao sera necessario!");
            System.out.println("O  salario mantem: R$" + funcionario1.salario);
        }
        else{
            System.out.println("Funcionario: " + funcionario1.nome);
            System.out.println("O reajuste salarial vai ser de: R$" + reajuste);
            System.out.println("O novo salario vai ser: R$" + (funcionario1.salario + reajuste));
        }

        leitor.close();
    }

}
