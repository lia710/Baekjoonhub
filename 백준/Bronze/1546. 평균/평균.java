import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] arr = new double[N];
        for(int i = 0; i<N; i++){
            arr[i] = sc.nextDouble();
        }
        
        Arrays.sort(arr);
        
        for(int i = 0; i<N; i++){
            arr[i] = arr[i]/arr[N-1]*100;
        }
        double answer = 0;
        for(double a : arr){
            answer += a;
        }
        
        answer /= (double)N;
        
        System.out.println(answer);
        
    }
}