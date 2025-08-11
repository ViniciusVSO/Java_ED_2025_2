import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);

        int number = tcd.nextInt();

        System.out.println("Tabuada do " + number + "\n");
        for(int i = 1; i <= 10; i++){
            System.out.println(number +  " * " + i + " = " + (number*i));
        }
    }
}