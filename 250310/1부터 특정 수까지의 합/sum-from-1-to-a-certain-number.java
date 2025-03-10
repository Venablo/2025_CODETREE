import java.util.Scanner;
public class Main {
    public static int add(int n) {
        int Max = 0;
        for(int i=0;i<=n;i++){
            Max=Max+i;
        }
        return Max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int Max = add(n);
        System.out.println(Max/10);
    }
}