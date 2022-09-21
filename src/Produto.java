public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public static double aplicaDesconto(int quantidade, double precoTotal) {

        double precoDesconto;

        if (quantidade >= 11 && quantidade <= 20) {
            precoDesconto = precoTotal - precoTotal * 0.11;
        } else if (quantidade >= 21 && quantidade <= 50) {
            precoDesconto = precoTotal - precoTotal * 0.20;
        } else if (quantidade > 50) {
            precoDesconto = precoTotal - precoTotal * 0.25;
        } else {
            precoDesconto = precoTotal;
        }

        return precoDesconto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
