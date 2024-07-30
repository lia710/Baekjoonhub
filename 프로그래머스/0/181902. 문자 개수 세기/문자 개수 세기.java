class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int [52];
        for(int i = 0; i<26; i++){
            for(int j = 0; j<my_string.length(); j++){
                if(my_string.charAt(j) == 'A'+i){
                    answer[i]++;
                }
            }
        }
        for(int i = 0; i<26; i++){
            for(int j = 0; j<my_string.length(); j++){
                if(my_string.charAt(j) == 'a'+i){
                    answer[26+i]++;
                }
            }
        }
        
        
        
        return answer;
    }
}