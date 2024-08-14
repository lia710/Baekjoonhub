import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i = 0; i<9; i++){
            arr[i] = sc.nextInt();
        }
        int[] count = Arrays.copyOf(arr, 9);
        Arrays.sort(count);
        System.out.println(count[8]);
        for(int i = 0; i<9; i++){
            if(count[8] == arr[i]) {
                System.out.println(i+1);
            }
        }
    }
}