package a4;

public class Moeda extends Item{
    public Moeda (float valor){
        super ("Moeda", valor);
    }

    @Override
    public void exibir(){
        System.out.printf("Moeda: R$ %.2f", getValor());
    }

}