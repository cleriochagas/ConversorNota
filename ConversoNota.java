import java.util.Scanner;

public class ConversoNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a nota (de 0 a 10): ");
        int nota = scanner.nextInt();

        // Verifica se a nota está dentro do intervalo válido (0 a 10)
        if (nota < 0 || nota > 10) {
            System.out.println("Valor de nota inválido. A nota deve estar entre 0 e 10.");
        } else {
            // Converte a nota em uma nota conceitual
            String notaConceitual = converterParaNotaConceitual(nota);
            System.out.println("A nota conceitual correspondente é: " + notaConceitual);
        }

        scanner.close();
    }

    public static String converterParaNotaConceitual(int nota) {
        if (nota >= 9 && nota <= 10) {
            return "A";
        } else if (nota >= 7 && nota < 9) {
            return "B";
        } else if (nota >= 5 && nota < 7) {
            return "C";
        } else if (nota >= 3 && nota < 5) {
            return "D";
        } else {
            return "F";
        }
    }
}
