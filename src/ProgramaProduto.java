import java.util.Scanner;

class Produto {
    private final String nome;
    private final double preco;
    private final int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double getValorTotalEstoque() {
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Valor total do estoque: " + getValorTotalEstoque();
    }
}

public class ProgramaProduto {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de produtos:");
        int numProdutos = scanner.nextInt();
        Produto[] produtos = new Produto[numProdutos];

        for (int i = 0; i < numProdutos; i++) {
            System.out.println("Digite o nome do produto " + (i + 1) + ":");
            String nome = scanner.next();
            System.out.println("Digite o preço do produto " + (i + 1) + ":");
            double preco = scanner.nextDouble();
            System.out.println("Digite a quantidade em estoque do produto " + (i + 1) + ":");
            int quantidade = scanner.nextInt();
            produtos[i] = new Produto(nome, preco, quantidade);
        }

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
