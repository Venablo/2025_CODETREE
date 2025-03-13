import java.util.Scanner;
public class Main {
    public static int check1(int a, int b) {
        int check = 0;
        int n1,n2,n3,n4,n5,n6 =0;
        for(int i=a;i>=a&&i<=b;i++) {
            n1=i%10;
            n2=i%100;
            n3=i%1000;
            n4=i%10000;
            n5=i%100000;
            n6=i%1000000;
            System.out.println(n);
            System.out.println(n);
            if(n1==3||n1==6||n1==9||n2==3||n2==6||n2==9||n3==3||n3==6||n3==9||
                n4==3||n4==6||n4==9||n5==3||n5==6||n5==9||n6==3||n6==6||n6==9) {
                check++;
            }
            if(i%3==0) {
                check++;

            }
        }



        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        int n=check1(A,B);
        System.out.println(n);
    }
}