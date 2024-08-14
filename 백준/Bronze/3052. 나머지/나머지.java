import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        Arrays.fill(arr, -1);
        int count = 0;
        int input;
        boolean check = true;
        for(int i = 0; i<10; i++){
            check = true;
            input = (sc.nextInt() % 42);
            for(int j = 0; j<10; j++){
                if(input==arr[j]){
                    check = false;
                    break;
                }
            }
            if(check){
                arr[count++] = input;
            }
        }
        System.out.print(count);
    }
}