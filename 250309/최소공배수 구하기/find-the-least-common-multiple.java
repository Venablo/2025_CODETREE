import java.util.Scanner;

public class Main {
    public static int Maxint(int n, int m){
        int max =0;
        for(int i=1;i<=n && i<=m;i++){
            if(n%i==0 && m%i==0){
                max = i;
            }
        }        
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int a = Maxint(n,m);
        System.out.println((n*m)/a);
    }
}