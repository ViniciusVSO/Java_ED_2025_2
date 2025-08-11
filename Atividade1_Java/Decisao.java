import java.util.Scanner;

public class Decisao {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);

        double nota = tcd.nextDouble();

        while(nota < 0 || nota > 10){
            System.out.println("Insira uma nota entre 0 à 10");
            nota = tcd.nextDouble();
        }

        if(nota >= 7){
            System.out.println("Aprovado!");
        } else if( nota < 7 && nota >= 5) {
            System.out.println("Recuperação!");
        }else {
            System.out.println("Reprovado!");
        }
    }
}