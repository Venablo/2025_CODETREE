import java.util.Scanner;
public class Main {
    public static void printRect(int n) {
    int a = 1;

    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            System.out.print(a+" ");
            a=a+1;
            if(a>9) {
                a=1;
            }
        }
        System.out.println();
    }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printRect(n);
    }
}