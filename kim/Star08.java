import java.util.Scanner;

public class Star08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i = 1; i < num; i++) {
            for (int a = 0; a < i; a++){
                System.out.print("*");
            }
            for(int c = 0; c < (2 * num) - (2 * i); c++){
                System.out.print(" ");
            }
            for (int b = 0; b < i; b++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = num; i > 0; i--) {
            for (int a = 0; a < i; a++){
                System.out.print("*");
            }
            for(int c = 0; c < (2 * num) - (2 * i); c++){
                System.out.print(" ");
            }
            for (int b = 0; b < i; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
