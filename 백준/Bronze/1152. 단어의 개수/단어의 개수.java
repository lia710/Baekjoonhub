import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        if(strs.length != 0){
        int count = strs.length;
        if(strs[0].isEmpty()){
            count--;
        }
        if(strs[strs.length-1].isEmpty()){
            count--;
        }
        System.out.print(count);
        }else{System.out.print(0);}
    }
}