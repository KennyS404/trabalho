public class VerificarParImparAteN {
    public static void verificarG(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " é par.");
            } else {
                System.out.println(i + " é ímpar.");
            }
        }
    }
}
