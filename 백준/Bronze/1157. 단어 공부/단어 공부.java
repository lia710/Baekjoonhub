import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        
        char[] chars = str.toCharArray();
        
        int[] alphabet = new int[26];

        for(int i = 0; i<26; i++){
            for(int j = 0; j<chars.length; j++){
                if(chars[j] == (char)('A' + i)){
                    alphabet[i]++;
                }
            }
        }
        
        int max = 0;
        
        for(int i : alphabet){
            if(i>max){
                max = i;
            }
        }
        
        int index = 0;
        int count = 0;
        for(int i = 0; i<26; i++){
            if(max == alphabet[i]){
                count++;
                index = i;
            }
        }
        
        if(count>1){
            System.out.println("?");
        }else{
            System.out.println((char)((int)'A'+index));
        }
    }
}