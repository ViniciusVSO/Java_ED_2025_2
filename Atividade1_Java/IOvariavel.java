import java.util.Scanner;

public class IOvariavel {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = tcd.next();
        System.out.println("Digite sua idade");
        int idade = tcd.nextInt();
        System.out.println("Digite sua altura");
        double altura = tcd.nextDouble();

        System.out.printf("Nome: %s, Idade: %d, Altura: %.2f%n", nome, idade, altura);
    }
}