import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Basamak sayisini girniz:" );
        int n = input.nextInt();
        for (int i=1; i<=n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= (2 * i) - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
            if (i == (n+1)/2) {
                break;
            }
        }


        for (int i=6; i<=n; i++) {
            for (int k = 1; k <= i-1; k++) {
                System.out.print(" ");
            }
            for (int c=7; c>=(2*i)-11; c-- ){

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
