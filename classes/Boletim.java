package classes;

public class Boletim {
    public double notaLaboratorio;
    public double notaAvaliacao;
    public double notaExame;

    public static double notaFinal(double notaLaboratorio, double notaAvaliacao, double notaExame){
        return ((notaLaboratorio * 2) + (notaAvaliacao * 3) + (notaExame * 5)) / 10;
    }
}
