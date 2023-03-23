package entities;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public double totalValorNoEstoque() {
        return preco * quantidade;
    }
    public void addProduto(int quantidade ) {
        this.quantidade += quantidade;
    }
    public void removerProduto(int quantidade) {
        this.quantidade -= quantidade;
    }
    public String toString() {
        return nome
             + ", R$ "
             + String.format("%.2f", preco)
             + ", "
             + quantidade
             + " Unidades, Total: R$ "
             + String.format("%.2f", totalValorNoEstoque());
    }
}
