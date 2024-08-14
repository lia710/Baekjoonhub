import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char a = 'a';
        boolean check = false;
        for(int i = 0; i<26; i++){
            check = false;
            for(int j = 0; j<str.length(); j++){
                if((a+i) == str.charAt(j)){
                    check = true;
                    System.out.print(j + " ");
                    break;
                }
            }
            if(check == false){
                System.out.print("-1 ");
            }
        }
    }
}