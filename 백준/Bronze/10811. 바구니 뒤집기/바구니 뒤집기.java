import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i<N; i++){
            arr[i] = i+1;
        }

        for(int i = 0; i<M; i++){
            int a = sc.nextInt() -1;
            int b = sc.nextInt() -1;
            int temp;
            for(int j = 0; j< (b-a)/2 + (b-a)%2 ; j++){
                temp = arr[a+j];
                arr[a+j] = arr[b-j];
                arr[b-j] = temp;
            }
        }

        for(int a : arr){
            System.out.print(a + " ");
        }

    }
}