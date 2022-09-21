import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {

    private List<Produto> produtoList = new ArrayList<>();
    private double precoTotal;

    public String adicionaProdutoCarrinho(Produto produto) {
        if (produto.getQuantidade() > 1) {
            produto.setPreco(produto.getPreco() * produto.getQuantidade());
        }
        this.produtoList.add(produto);
        return produto.toString();
    }

    public String finalizaCompra() {
        double precoTotal = 0d;
        int quantidade = 0;
        for (Produto produto : this.produtoList) {
            precoTotal += produto.getPreco();
            quantidade += produto.getQuantidade();
        }

        return "Preço total: " + Produto.aplicaDesconto(quantidade, precoTotal);

    }
}
