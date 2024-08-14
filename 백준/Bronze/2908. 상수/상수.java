import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        A = A/100+(A/10-(A/100)*10)*10+(A%10*100);
        B = B/100+(B/10-(B/100)*10)*10+(B%10*100);
        
        System.out.print(Math.max(A, B));
        
    }
}