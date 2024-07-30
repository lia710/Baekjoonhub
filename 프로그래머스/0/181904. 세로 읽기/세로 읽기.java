import java.util.Arrays;
class Solution {
    public String solution(String my_string, int m, int c) {
        char[][] chars = new char[my_string.length()/m][m];
        
        for(int i = 0; i<my_string.length()/m; i++){
            chars[i] = my_string.substring(i*m, i*m+m).toCharArray();
            System.out.println(Arrays.toString(chars[i]));
        }
        
        String answer = "";
        for(int i = 0; i<chars.length; i++){
            answer += chars[i][c-1];
        }
        return answer;
    }
}