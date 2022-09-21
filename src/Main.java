import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean finalizaCompra = false;

        CarrinhoCompra carrinhoCompra = new CarrinhoCompra();


        while (!finalizaCompra) {

            String nomeProduto = null;
            double preco = 0d;
            int quantidade = 0;

            System.out.println("\nInforme o nome do produto: \n");
            nomeProduto = in.next();

            System.out.println("\nInforme o preço do produto: \n");
            preco = in.nextDouble();

            System.out.println("\nInforme a quantidade do produto: \n");
            quantidade = in.nextInt();




            Produto produto = new Produto(nomeProduto, preco, quantidade);
            System.out.println(carrinhoCompra.adicionaProdutoCarrinho(produto));

            System.out.println("\nPrecione 1 para continuar ou 0 para finalizar compra: \n");
            int finaliza = in.nextInt();
            finalizaCompra = finaliza == 0;


        }

        System.out.println(carrinhoCompra.finalizaCompra());

    }
}
