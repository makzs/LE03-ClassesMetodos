package classes;

public class BoletimMelhorado {
    public String nome;
    public int matricula;
    public double notaLaboratorio;
    public double notaAvaliacao;
    public double notaExame;

    public static double notaFinal(double notaLaboratorio, double notaAvaliacao, double notaExame){
        return ((notaLaboratorio * 2) + (notaAvaliacao * 3) + (notaExame * 5)) / 10;
    }

    public static char classificacao(double notaFinal){
        if (notaFinal > 8.10){
            return 'A';
        }
        else if (notaFinal > 7.8){
            return 'B';
        }
        else if (notaFinal > 6.7){
            return 'C';
        }
        else if (notaFinal > 5.6){
            return 'D';
        }
        else{
            return 'R';
        }
    }
}
