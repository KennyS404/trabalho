import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Verificar se um número é par ou ímpar");
            System.out.println("2 - Exibir números de 1 a 10");
            System.out.println("3 - Exibir informações de uma pessoa");
            System.out.println("4 - Verificar se cada número até um número informado é par ou ímpar");
            System.out.println("5 - Verificar se uma pessoa é maior ou menor de idade e se pode ter emancipação voluntária");
            System.out.println("6 - Inserir múltiplos produtos e exibir o valor total do estoque");
            System.out.println("7 - Jogo de adivinhação");
            System.out.println("8 - Inserir múltiplos alunos e exibir a situação de cada aluno");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número: ");
                    VerificarParImpar.verificar();
                    break;
                case 2:
                    ExibirNumeros.exibir();
                    break;
                case 3:
                    System.out.print("Digite o nome da pessoa: ");
                    String nome = scanner.next();
                    System.out.print("Digite a idade da pessoa: ");
                    int idade = scanner.nextInt();
                    Pessoa pessoa = new Pessoa(nome, idade);
                    pessoa.exibirInformacoes();
                    break;
                case 4:
                    System.out.print("Digite um número: ");
                    int numeroParaVerificar = scanner.nextInt();
                    VerificarParImparAteN.verificarG(numeroParaVerificar);
                    break;
                case 5:
                    System.out.print("Digite sua idade: ");
                    int idadeParaVerificar = scanner.nextInt();
                    VerificarIdade.verificar(idadeParaVerificar);
                    break;
                case 6:
                    ProgramaProduto.executar();
                    break;
                case 7:
                    JogoAdivinhacao.jogar();
                    break;
                case 8:
                    ProgramaAluno.executar();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
