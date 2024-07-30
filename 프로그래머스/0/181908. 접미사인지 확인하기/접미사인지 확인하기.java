import java.util.Arrays;

class Solution {
    public int solution(String my_string, String is_suffix) {
        boolean check = true;
        
        char[] myString = my_string.toCharArray();
        char[] isSuffix = is_suffix.toCharArray();
        
        if(my_string.length()<is_suffix.length()){
            check = false;
        }
        else{
        for(int i = 1; i<is_suffix.length()+1; i++){
            if(myString[my_string.length()-i]!=isSuffix[is_suffix.length()-i]){
                check = false;
                break;
            }
          }
        }
        int answer = (check) ? 1 : 0;
        return answer;
    }
}