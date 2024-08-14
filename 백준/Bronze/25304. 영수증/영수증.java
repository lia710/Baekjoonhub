import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int count = sc.nextInt();
        int check = 0;
        for(int i = 0; i<count; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            check += a*b;
        }
        System.out.println((sum==check) ? "Yes" : "No");
    }
}