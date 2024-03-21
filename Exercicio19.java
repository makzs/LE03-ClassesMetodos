// 19. Escrever um programa que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo.
// Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno:
// Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma doscomprimentos dos outros dois lados
// Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais
// Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais. Portanto, todotriângulo equilátero é também isóscele
// Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes

import java.util.Scanner;
import classes.Triangulo;

public class Exercicio19 {

    public static void Executar19(){
        Scanner leitor = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();

        System.out.println("Informe o primeiro valor inteiro: ");
        triangulo.ladoA = leitor.nextInt();

        System.out.println("Informe o segundo valor inteiro: ");
        triangulo.ladoB = leitor.nextInt();

        System.out.println("Informe o terceiro valor inteiro: ");
        triangulo.ladoC = leitor.nextInt();

        if ((triangulo.ladoA + triangulo.ladoB) >= triangulo.ladoC){
                
            if (triangulo.ladoA == triangulo.ladoB && triangulo.ladoA == triangulo.ladoC){
                System.out.println("Esses valores podem formar um triangulo! ");
                System.out.println("Com todos os lados sendo iguais sera um triangulo Equilatero!");
            }
            else if (triangulo.ladoA == triangulo.ladoB && triangulo.ladoA != triangulo.ladoC){
                System.out.println("Esses valores podem formar um triangulo! ");
                System.out.println("Com um dos lados de tamanho diferente sera um triangulo Isoceles!");
            }
            else if (triangulo.ladoA == triangulo.ladoC && triangulo.ladoA != triangulo.ladoB){
                System.out.println("Esses valores podem formar um triangulo! ");
                System.out.println("Com um dos lados de tamanho diferente sera um triangulo Isoceles!");
            }
            else if (triangulo.ladoB == triangulo.ladoC && triangulo.ladoA != triangulo.ladoB){
                System.out.println("Esses valores podem formar um triangulo! ");
                System.out.println("Com um dos lados de tamanho diferente sera um triangulo Isoceles!");
            }
            else{
                System.out.println("Esses valores podem formar um triangulo! ");
                System.out.println("Com todos os lados diferentes sera um triangulo Escaleno!");
            }
        }
        else{
            System.out.println("Esses valores nao podem formar um triangulo");
        }

        leitor.close();

    }

}
