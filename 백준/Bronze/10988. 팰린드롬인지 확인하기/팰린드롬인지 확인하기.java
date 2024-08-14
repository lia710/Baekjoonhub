import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        if(sb.reverse().toString().equals(str)){
            System.out.print("1");
        }else{System.out.print("0");}
    }
}