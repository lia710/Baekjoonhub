import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean[] student = new boolean[31];
        student[0] = true;
        for(int i = 0; i<28; i++){
            student[sc.nextInt()] = true;
        }
        
        for(int i = 0; i<31; i++){
            if(!student[i]){
                System.out.println(i);
            }
        }
        
    }
}