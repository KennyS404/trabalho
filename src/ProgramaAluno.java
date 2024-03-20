import java.util.Scanner;
class Aluno {
    private final String nome;
    private final int idade;
    private final double nota;

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public String getSituacao() {
        return nota >= 7 ? "Aprovado" : "Reprovado";
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + ", Situação: " + getSituacao();
    }
}

public class ProgramaAluno {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de alunos:");
        int numAlunos = scanner.nextInt();
        Aluno[] alunos = new Aluno[numAlunos];

        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            String nome = scanner.next();
            System.out.println("Digite a idade do aluno " + (i + 1) + ":");
            int idade = scanner.nextInt();
            System.out.println("Digite a nota do aluno " + (i + 1) + ":");
            double nota = scanner.nextDouble();
            alunos[i] = new Aluno(nome, idade, nota);
        }

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
