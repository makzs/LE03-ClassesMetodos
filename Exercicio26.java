// 26. Uma seguradora possui nove categorias de seguro baseadas na idade e ocupação do segurado.Somente pessoas
// com pelo menos 17 anos e não mais que 70 anos podem adquirir apólices de seguro.
// Quanto às classes de ocupações, foram definidos três grupos de risco: 
//baixo, médio e alto. A tabela abaixo fornece as categorias em função da faixa etária e do grupo de risco.
// Dados nome,idade e grupo de risco de um pretendente, determinar e imprimir seus dados e categoria. 
// Caso aidade não esteja na faixa necessária, imprimir uma mensagem informando que ele não se
//  enquadraem nenhuma das categorias ofertadas
//
//          |   Grupo de risco     |
//   idade  | baixo | medio | alto |
//  17 a 20 |   1   |   2   |   3  |
//  21 a 24 |   2   |   3   |   4  |
//  25 a 34 |   3   |   4   |   5  |
//  35 a 64 |   4   |   5   |   6  |
//  65 a 70 |   7   |   8   |   9  |

import java.util.Scanner;

import classes.Seguro;

public class Exercicio26 {

    public static void Executar26(){
        Scanner leitor = new Scanner(System.in);
        Seguro ficha = new Seguro();

        System.out.println("Ficha de Seguro");
        System.out.println("-------------------------------------");

        System.out.println("Informe o nome: ");
        ficha.nome = leitor.nextLine();

        System.out.println("Informe a idade: ");
        ficha.idade = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Informe o grupo de risco (baixo/medio/alto): ");
        ficha.grupoRisco = leitor.nextLine();
        ficha.grupoRisco = ficha.grupoRisco.toUpperCase();

        System.out.println("-------------------------------------");
        System.out.println("Nome: " + ficha.nome);
        System.out.println("Idade: " + ficha.idade);
        System.out.println("Grupo de Risco: " + ficha.grupoRisco);
        System.out.println("Categoria de seguro selecionada: " + Seguro.categoria(ficha.idade, ficha.grupoRisco.toUpperCase()));


        leitor.close();
    }

}
