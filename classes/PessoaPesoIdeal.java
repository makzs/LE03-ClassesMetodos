package classes;

public class PessoaPesoIdeal {
    public String nome;
    public char sexo;
    public int idade;
    public double altura;

    public static double pesoCalc(char sexo, double altura, int idade){
        if (sexo == 'M'){
            if (altura > 1.70){
                if (idade >= 40){
                    return (72.7*altura) - 45;
                }
                else if (idade >= 21 && idade <= 39){
                    return (72.7*altura) - 53;
                }
                else if (idade <= 20){
                    return (72.7*altura) - 58;
                }
                else{
                    return -3;
                }
            }
            else if (altura <= 1.70){
                if (idade > 40){
                    return (72.7*altura) - 58;
                }
                else if (idade <= 40){
                    return (72.7*altura) - 50;
                }
                else{
                    return -3;
                }
            }
            else{
                return -2;
            }
        }
        else if (sexo == 'F'){
            if (altura > 1.50){
                return (62.1*altura) - 44.7;
            }
            else if (altura <= 1.50){
                if (idade >= 35){
                    return (62.1*altura) - 45;
                }
                else if (idade < 35){
                    return (62.1*altura) - 49;
                }
                else{
                    return -3;
                }
            }
            else{
                return -2;
            }
        }
        else{
            return -1;
        }
    }
}
