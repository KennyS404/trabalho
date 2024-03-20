import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void jogar() {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        int palpite;

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Mais alto!");
            } else if (palpite > numeroSecreto) {
                System.out.println("Mais baixo!");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroSecreto);
    }
}
