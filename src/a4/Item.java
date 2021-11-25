package a4;

public abstract class Item {
    private String descricao;
    private float valor;

    public Item(String descricao, float valor){
        setDescricao(descricao);
        setValor(valor);
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public float getValor(){
        return valor;
    }
    public void setValor(float valor){
        this.valor = valor;
    }

    public void exibir(){
        System.out.printf("%s: %f", getDescricao(), getValor());
    }
}
