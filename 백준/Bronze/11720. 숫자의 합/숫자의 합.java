import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        int sum = 0;
        for(int i = 0; i<N; i++){
            sum += (int)chars[i] - 48 ;
        }
       System.out.println(sum);
    }
}