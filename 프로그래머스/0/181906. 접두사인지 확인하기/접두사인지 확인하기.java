class Solution {
    public int solution(String my_string, String is_prefix) {
        boolean check = true;
        char[] myString = my_string.toCharArray();
        char[] isPrefix = is_prefix.toCharArray();
        
        if(my_string.length()<is_prefix.length()){
            check = false;
        }
        else{
            for(int i = 0; i<is_prefix.length(); i++)
                if(myString[i]!=isPrefix[i]){
                    check = false;
                    break;
                }
                
            }
        
        int answer = (check) ? 1 : 0;
        return answer;
    }
}