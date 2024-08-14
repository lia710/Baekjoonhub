import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i<N-1; i++){
            for(int j = 0; j<N-1-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i = 0; i<2*N-1; i++){
            System.out.print("*");
        }
        System.out.println();
        
        for(int i = N-2; i>=0; i--){
            for(int j = 0; j<N-1-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<2*i+1; j++){
                System.out.print("*");
            }
            if(i==0) break;
            System.out.println();
        }
    }
}