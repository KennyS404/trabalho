public class VerificarIdade {
    public static void verificar(int idade) {
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
            if (idade >= 16) {
                System.out.println("Você pode ter emancipação voluntária.");
            } else {
                System.out.println("Você não pode ter emancipação voluntária.");
            }
        }
    }
}
