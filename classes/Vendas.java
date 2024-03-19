package classes;

public class Vendas {
    public static double vender(double preco, int taxa){
        return preco + ((preco * taxa) / 100);
    }
}
