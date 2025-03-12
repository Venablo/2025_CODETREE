import java.util.Scanner;
public class Main {
    public static void cal(int n) {
        int a=0;
        int b=n;
        a += n % 10;
        n /= 10;
        a = a+n;
        if(b%2==0){
            if(a==5){
                System.out.println("Yes");
            }
            else if(a==10){
                System.out.println("Yes");
            }
            else if(a==15){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        cal(n);
    }
}